package com.gomeals.model;

import jakarta.persistence.*;

@Entity
@Table(name = "delivery_addons")
@IdClass(DeliveryAddonsId.class)
public class DeliveryAddons {
    @Id
    @Column (name="cust_id")
    private int customerId;
    @Id
    @Column (name="addon_id")
    private int addonId;
    @Id
    @Column (name="delivery_id")
    private int deliveryId;
    private int quantity;

    public DeliveryAddons(){
        quantity = 0;
    }
    public DeliveryAddons(int cust_id, int addon_id, int delivery_id,int quantity){
        this.customerId = cust_id;
        this.addonId = addon_id;
        this.deliveryId=delivery_id;
        this.quantity = quantity;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getAddonId() {
        return addonId;
    }

    public void setAddonId(int addonId) {
        this.addonId = addonId;
    }

    public int getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(int deliveryId) {
        this.deliveryId = deliveryId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

