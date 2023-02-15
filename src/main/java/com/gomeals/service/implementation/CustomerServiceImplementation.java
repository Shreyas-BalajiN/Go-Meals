package com.gomeals.service.implementation;

import com.gomeals.model.Customer;
import com.gomeals.model.Customer;
import com.gomeals.repository.CustomerRepository;
import com.gomeals.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CustomerServiceImplementation implements CustomerService{
@Autowired
    CustomerRepository customerRepository;

    public CustomerServiceImplementation() {
        super();
    }

    @Override
    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer getCustomerById(int id) {
        Customer customer = customerRepository.findById(id).orElse(null);
        return customer;
    }
}
