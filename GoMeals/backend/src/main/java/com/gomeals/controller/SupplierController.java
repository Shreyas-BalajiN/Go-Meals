package com.gomeals.controller;
import com.gomeals.model.Customer;
import com.gomeals.model.Supplier;
import com.gomeals.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/supplier")
@CrossOrigin(origins = "http://localhost:3000")
public class SupplierController {
    @Autowired
    SupplierService supplierService;

    @PostMapping("/create")
    public Supplier registerSupplier(@RequestBody Supplier supplier) {
        return supplierService.registerSupplier(supplier);
    }

    @GetMapping("/get/{id}")
    public Supplier getSupplierDetails(@PathVariable int id) {
        return supplierService.getSupplierDetails(id);
    }

    @PutMapping("/update")
    public Supplier updateSupplier(@RequestBody Supplier supplier) {
        return supplierService.updateSupplier(supplier);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteSupplier(@PathVariable int id) {
        return supplierService.deleteSupplier(id);
    }
    @PostMapping("/login")
    public String loginSupplier(@RequestBody Supplier supplier) { return supplierService.loginSupplier(supplier);}
}


