package com.gomeals.model;

import jakarta.persistence.*;

@Entity
@Table(name = "supplier_review")
public class SupplierReview {

    private String comment;

    private String supplier_rating;

    public SupplierReview(){

    }

    public SupplierReview(String comment, String supplier_rating){
        this.comment = comment;
        this.supplier_rating = supplier_rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getSupplier_rating() {
        return supplier_rating;
    }

    public void setSupplier_rating(String supplier_rating) {
        this.supplier_rating = supplier_rating;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

