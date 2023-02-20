package com.gomeals.model;

import jakarta.persistence.*;
import java.io.Serializable;


@Entity
@IdClass(SupplierReview.SupplierReviewKey.class)
@Table(name = "supplier_review")
public class SupplierReview {

    @Id
    @ManyToOne
    @JoinColumn(name = "cust_id")
    private Integer customerId;

    @Id
    @ManyToOne
    @JoinColumn(name = "sup_id")
    private Integer supplierId;
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private int supplierReviewid;
    private String comment;

    private String supplier_rating;

    public SupplierReview(){

    }

    public SupplierReview(Integer customerId, Integer supplierId, String comment, String supplier_rating) {
        this.customerId = customerId;
        this.supplierId = supplierId;
        this.comment = comment;
        this.supplier_rating = supplier_rating;
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

    @Override
    public String toString() {
        return super.toString();
    }

    @Embeddable
    public static class SupplierReviewKey implements Serializable {

        @Column(name = "cust_id")
        private Integer customerId;

        @Column(name = "supp_id")
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

