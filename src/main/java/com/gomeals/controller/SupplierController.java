package com.gomeals.controller;
import com.gomeals.model.supplier;
import com.gomeals.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/supplier")
public class SupplierController {
    @Autowired
    SupplierService supplierService;

    @PostMapping("/create")
    public supplier registerSupplier(@RequestBody supplier supplier) {
        return supplierService.registerSupplier(supplier);
    }

    @GetMapping("/get/{id}")
    public supplier getSupplierDetails(@PathVariable int id) {
        return supplierService.getSupplierDetails(id);
    }

    @PutMapping("/update")
    public supplier updateSupplier(@RequestBody supplier supplier) {
        return supplierService.updateSupplier(supplier);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteSupplier(@PathVariable int id) {
        return supplierService.deleteSupplier(id);
    }
}


