package com.gomeals.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;

@Embeddable
public class DeliveryAddonsId implements Serializable {
   // @Column (name="cust_id")
   // private int customerId;
    private int cust_id;

 //   @Column (name="addon_id")
    private int addon_id;

  //  @Column (name="delivery_id")
    private int delivery_id;
    //private int deliveryId;


    public DeliveryAddonsId(){

    }
    public DeliveryAddonsId(int customerId,int addonId,int deliveryId){
        this.cust_id=customerId;
        this.addon_id=addonId;
        this.delivery_id=deliveryId;

    }

    public int getCust_id() {
        return cust_id;
    }

    public void setCust_id(int cust_id) {
        this.cust_id = cust_id;
    }

    public int getAddon_id() {
        return addon_id;
    }

    public void setAddon_id(int addon_id) {
        this.addon_id = addon_id;
    }

    public int getDelivery_id() {
        return delivery_id;
    }

    public void setDelivery_id(int delivery_id) {
        this.delivery_id = delivery_id;
    }
}
