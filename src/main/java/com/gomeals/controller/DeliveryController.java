package com.gomeals.controller;

import com.gomeals.model.Delivery;
import com.gomeals.service.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/delivery")
public class DeliveryController {

    @Autowired
    DeliveryService deliveryService;

    @GetMapping("/get/{id}")
    public Delivery getDeliveryById(@PathVariable("id") int id) {
        return deliveryService.getDeliveryById(id);
    }

    @PostMapping("/create")
    public Delivery createDelivery(@RequestBody Delivery delivery) {
        return deliveryService.createDelivery(delivery);
    }

}
