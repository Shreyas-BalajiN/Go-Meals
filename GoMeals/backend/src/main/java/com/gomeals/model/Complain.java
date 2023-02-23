package com.gomeals.model;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "complain")
public class Complain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name = "complain_id")
    private Integer complainId;
    private Date date;
    private String meal;

    @Column( name = "cust_comment", nullable = false)
    private String customerComment;
    private String status;

    @Column( name = "cust_id", nullable = false)
    private int customerId; // customer FK

    @Column( name = "sup_id")
    private int supplierId; // supplier FK

    public Complain(){
    }

    public Complain(Integer complain_id, String meal, Date date, String cust_comment, String status, int cust_id, int sup_id){
        this.complainId = complain_id;
        this.date = date;
        this.meal = meal;
        this.customerComment = cust_comment;
        this.status = status;
        this.customerId=cust_id;
        this.supplierId=sup_id;
    }

    public int getComplainId() {
        return complainId;
    }

    public void setComplainId(int complainId) {
        this.complainId = complainId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMeal() {
        return meal;
    }

    public void setMeal(String meal) {
        this.meal = meal;
    }

    public String getCustomerComment() {
        return customerComment;
    }

    public void setCustomerComment(String customerComment) {
        this.customerComment = customerComment;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }
}
