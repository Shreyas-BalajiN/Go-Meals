package com.gomeals.service.implementation;

import com.gomeals.model.Delivery;
import com.gomeals.model.Subscriptions;
import com.gomeals.repository.DeliveryRepository;
import com.gomeals.repository.SubscriptionRepository;
import com.gomeals.service.DeliveryService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class DeliveryServiceImplementation implements DeliveryService {

    @Autowired
    DeliveryRepository deliveryRepository;

    @Autowired
    SubscriptionRepository subscriptionRepository;


    @Override
    public Delivery createDelivery(Delivery delivery) {
        return deliveryRepository.save(delivery);
    }

    @Override
    public Delivery getDeliveryById(int id) {
        Delivery delivery = deliveryRepository.findById(id).orElse(null);
        return delivery;
    }

    @Override
    public Delivery updateDelivery(@RequestBody Delivery delivery) {
        Delivery currentDelivery = deliveryRepository.findById(delivery.getDeliveryId()).orElse(null);
        if (currentDelivery != null) {
            currentDelivery.setDeliveryDate(delivery.getDeliveryDate());
            currentDelivery.setDeliveryMeal(delivery.getDeliveryMeal());
            currentDelivery.setOrderStatus(delivery.getOrderStatus());
            currentDelivery.setSupId(delivery.getSupId());
            currentDelivery.setCustId(delivery.getCustId());
            deliveryRepository.save(currentDelivery);
        }
        return currentDelivery;
    }

    @Override
    public String deleteDeliveryById(int id) {
        deliveryRepository.deleteById(id);
        return "Delivery deleted!";
    }

    @Override
    public List<Delivery> getByCustId(int id) {
        return deliveryRepository.findByCustId(id);
    }

    @Transactional
    @Override
    public Delivery updateStatusToCancelledById(int id) {
        Delivery delivery = deliveryRepository.findById(id).orElse(null);
        if(delivery != null){
            if(!delivery.getOrderStatus().equals("Inprogress")){
                return null;
            }
            Subscriptions subscription = subscriptionRepository.findSubscriptionsByCustomerIdAndSupplierIdAndActiveStatus(
                    delivery.getCustId(), delivery.getSupId(),1);
            if(subscription != null){ // If the user has an active subscription with that supplier
                // Set delivery status to cancelled
                delivery.setOrderStatus("Cancelled");
                // Update the remaining meals on the subscription table
                subscription.setMeals_remaining(subscription.getMeals_remaining()+1);

                deliveryRepository.save(delivery);
                subscriptionRepository.save(subscription);

                return delivery;
            }
        }
        return null;
    }

}
