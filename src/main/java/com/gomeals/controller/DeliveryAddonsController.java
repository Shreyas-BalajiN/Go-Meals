package com.gomeals.controller;

import com.gomeals.model.DeliveryAddons;
import com.gomeals.model.DeliveryAddonsId;
import com.gomeals.service.DeliveryAddonsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/deliveryAddons")
public class DeliveryAddonsController {
    @Autowired
    DeliveryAddonsService deliveryAddonsService;

    @PostMapping("/create")
    public DeliveryAddons createDeliveryAddons(@RequestBody DeliveryAddons deliveryAddons) {
        return deliveryAddonsService.createDeliveryAddons(deliveryAddons);
    }
    @PostMapping("/getDeliveryAddons")
    public DeliveryAddons getDeliveryAddonsById(@RequestBody DeliveryAddonsId deliveryAddonsId) {
        return deliveryAddonsService.getDeliveryAddonsById(deliveryAddonsId);
    }
    @GetMapping("/get/{id}")
    public List<DeliveryAddons> getDeliveryAddonsByDeliveryId(@PathVariable("id") Integer deliveryId) {
        return deliveryAddonsService.getDeliveryAddonsByDeliveryId(deliveryId);
    }
    @PutMapping("/update")
    public DeliveryAddons updateDeliveryAddon(@RequestBody DeliveryAddons deliveryAddon){
        return deliveryAddonsService.updateDeliveryAddon(deliveryAddon);
    }
    @DeleteMapping("/delete")
    public void deleteDeliveryAddon(@RequestBody DeliveryAddonsId deliveryAddonId) {
        deliveryAddonsService.deleteDeliveryAddon(deliveryAddonId);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteAllByDeliveryId(@PathVariable("id") Integer deliveryId){
        deliveryAddonsService.deleteAllByDeliveryId(deliveryId);
    }

}
