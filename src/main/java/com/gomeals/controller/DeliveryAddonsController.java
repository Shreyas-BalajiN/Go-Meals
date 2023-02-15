package com.gomeals.controller;

import com.gomeals.model.DeliveryAddons;
import com.gomeals.service.DeliveryAddonsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/deliveryAddons")
public class DeliveryAddonsController {
    @Autowired
    DeliveryAddonsService deliveryAddonsService;

    @PostMapping("/create")
    public DeliveryAddons createDeliveryAddons(@RequestBody DeliveryAddons deliveryAddons) {
        return deliveryAddonsService.createDeliveryAddons(deliveryAddons);
    }
}
