package com.gomeals.service.implementation;

import com.gomeals.model.Delivery;
import com.gomeals.repository.DeliveryRepository;
import com.gomeals.service.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeliveryServiceImplementation implements DeliveryService {

    @Autowired
    DeliveryRepository deliveryRepository;


    @Override
    public Delivery createDelivery(Delivery delivery) {
        return deliveryRepository.save(delivery);
    }

    @Override
    public Delivery getDeliveryById(int id) {
        Delivery delivery = deliveryRepository.findById(id).orElse(null);
        return delivery;
    }
}
