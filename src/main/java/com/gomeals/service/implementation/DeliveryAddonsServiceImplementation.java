package com.gomeals.service.implementation;

import com.gomeals.model.DeliveryAddons;
import com.gomeals.repository.DeliveryAddonsRepository;
import com.gomeals.service.DeliveryAddonsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeliveryAddonsServiceImplementation implements DeliveryAddonsService{
    @Autowired
    DeliveryAddonsRepository deliveryAddonsRepository;

    @Override
    public DeliveryAddons createDeliveryAddons(DeliveryAddons deliveryAddons) {
        return deliveryAddonsRepository.save(deliveryAddons);
    }
}
