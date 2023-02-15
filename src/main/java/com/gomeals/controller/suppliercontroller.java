package com.gomeals.controller;
import com.gomeals.model.supplier;
import com.gomeals.service.supplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/supplier")
public class suppliercontroller {
    supplierService supplierService;

    @PostMapping("/create")
    public supplier registerSupplier(@RequestBody supplier supplier) {
        return supplierService.registerSupplier(supplier);
    }

    @GetMapping("/get/{id}")
    public supplier getSupplierDetails(@PathVariable int id) {
        return supplierService.getSupplierDetails(id);
    }

    @PutMapping("/update")
    public String updateSupplier(supplier supplier) {
        return supplierService.updateSupplier(supplier);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteSupplier(@PathVariable int id) {
        return supplierService.deleteSupplier(id);
    }
}


