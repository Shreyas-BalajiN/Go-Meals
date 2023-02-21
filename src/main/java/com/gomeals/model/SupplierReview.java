package com.gomeals.model;

import jakarta.persistence.*;
import java.io.Serializable;


@Entity
@IdClass(SupplierReview.SupplierReviewKey.class)
@Table(name = "supplier_review")
public class SupplierReview {

    @Id
    @Column (name="cust_id")
    private Integer customerId;

    @Id
    @Column (name="sup_id")
    private Integer supplierId;
    private String comment;

    private String supplier_rating;
    private String supplier_reviewcol;

    public SupplierReview(){

    }

    public SupplierReview(Integer customerId, Integer supplierId, String comment, String supplier_rating,String supplier_reviewcol) {
        this.customerId = customerId;
        this.supplierId = supplierId;
        this.comment = comment;
        this.supplier_rating = supplier_rating;
        this.supplier_reviewcol=supplier_reviewcol;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
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

    public String getSupplier_reviewcol() {
        return supplier_reviewcol;
    }

    public void setSupplier_reviewcol(String supplier_reviewcol) {
        this.supplier_reviewcol = supplier_reviewcol;
    }

    @Embeddable
    public static class SupplierReviewKey implements Serializable {

        @Column(name = "cust_id")
        private Integer customerId;

        @Column(name = "sup_id")
        private Integer supplierId;

        public Integer getCustomerId() {
            return customerId;
        }

        public void setCustomerId(Integer customerId) {
            this.customerId = customerId;
        }



        public Integer getSupplierId() {
            return supplierId;
        }

        public void setSupplierId(Integer supplierId) {
            this.supplierId = supplierId;
        }

    }
}

