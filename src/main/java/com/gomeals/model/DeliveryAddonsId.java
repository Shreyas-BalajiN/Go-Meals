package com.gomeals.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;

@Embeddable
public class DeliveryAddonsId implements Serializable {
    @Column (name="cust_id")
    private int customerId;


    @Column (name="addon_id")
    private int addonId;


    @Column (name="delivery_id")
    private int deliveryId;


    public DeliveryAddonsId(){

    }
    public DeliveryAddonsId(int customerId,int addonId,int deliveryId){
        this.customerId=customerId;
        this.addonId=addonId;
        this.deliveryId=deliveryId;
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
}
