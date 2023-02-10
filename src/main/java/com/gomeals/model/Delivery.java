package com.gomeals.model;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "delivery")
public class Delivery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int delivery_id;
    private Date delivery_date;
    private String delivery_meal;
    private String order_status;

    public Delivery() {
    }

    public Delivery(int delivery_id, Date delivery_date, String delivery_meal, String order_status) {
        this.delivery_id = delivery_id;
        this.delivery_date = delivery_date;
        this.delivery_meal = delivery_meal;
        this.order_status = order_status;
    }

    public int getDelivery_id() {
        return delivery_id;
    }

    public void setDelivery_id(int delivery_id) {
        this.delivery_id = delivery_id;
    }

    public Date getDelivery_date() {
        return delivery_date;
    }

    public void setDelivery_date(Date delivery_date) {
        this.delivery_date = delivery_date;
    }

    public String getDelivery_meal() {
        return delivery_meal;
    }

    public void setDelivery_meal(String delivery_meal) {
        this.delivery_meal = delivery_meal;
    }

    public String getOrder_status() {
        return order_status;
    }

    public void setOrder_status(String order_status) {
        this.order_status = order_status;
    }
}
