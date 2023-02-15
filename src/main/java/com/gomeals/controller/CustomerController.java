package com.gomeals.controller;
import com.gomeals.model.Customer;
import com.gomeals.model.Customer;
import com.gomeals.service.CustomerService;
import com.gomeals.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    CustomerService CustomerService;

    @GetMapping("/get/{id}")
    public Customer getCustomerById(@PathVariable("id") int id) {
        return CustomerService.getCustomerById(id);
    }

    @PostMapping("/create")
    public Customer createCustomer(@RequestBody Customer Customer) {
        return CustomerService.createCustomer(Customer);
    }
}
