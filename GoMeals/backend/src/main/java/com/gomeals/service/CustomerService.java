package com.gomeals.service;

import com.gomeals.model.Customer;

public interface CustomerService {
    Customer createCustomer(Customer customer);
    String loginCustomer(Customer customer);
    Customer getCustomerById(int id);

}