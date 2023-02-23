package com.gomeals.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class mealchartID implements Serializable {
    @Column(name="day")
 private String day;
    @Column(name="sup_id")
 private int supId;

    public mealchartID(String day, int supId) {
        this.day = day;
        this.supId = supId;
    }

    public mealchartID() {

    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public int getSupId() {
        return supId;
    }

    public void setSupId(int supId) {
        this.supId = supId;
    }
}
