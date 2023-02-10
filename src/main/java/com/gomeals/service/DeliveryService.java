package com.gomeals.service;

import com.gomeals.model.Delivery;

public interface DeliveryService {

    Delivery createDelivery(Delivery delivery);

    Delivery getDeliveryById(int id);


}
