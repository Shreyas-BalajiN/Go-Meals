package com.gomeals.model;

import jakarta.persistence.*;

@Entity
@Table(name = "delivery_addons")
@IdClass(DeliveryAddonsId.class)
public class DeliveryAddons {

    /*
    @EmbeddedId
    private DeliveryAddonsId deliveryAddonsId;*/

    @Id
    private int cust_id;
  //  private int custommerId;
    @Id
    private int addon_id;
   // private int addonId;
    @Id
    private int delivery_id;
    //private int deliveryId;
    private int quantity;


    public DeliveryAddons(){
        quantity = 0;
    }
    public DeliveryAddons(int cust_id, int addon_id, int delivery_id,int quantity){
        this.cust_id = cust_id;
        this.addon_id = addon_id;
        this.delivery_id=delivery_id;
        this.quantity = quantity;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

