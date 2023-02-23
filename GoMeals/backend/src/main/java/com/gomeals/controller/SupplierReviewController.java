package com.gomeals.controller;
import com.gomeals.model.Delivery;
import com.gomeals.model.SupplierReview;
import com.gomeals.service.SupplierReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/supplierReview")

public class SupplierReviewController {
    @Autowired
    SupplierReviewService supplierReviewService;

    @PostMapping("/create")
    public SupplierReview createSupplierReview(@RequestBody SupplierReview supplierReview) {
        return supplierReviewService.createSupplierReview(supplierReview);
    }
}
