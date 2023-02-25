package com.gomeals.service.implementation;

import com.gomeals.model.Customer;
import com.gomeals.model.Customer;
import com.gomeals.repository.CustomerRepository;
import com.gomeals.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class CustomerServiceImplementation implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    public CustomerServiceImplementation() {
        super();
    }

    @Override
    public Customer createCustomer(Customer customer) {

        if (customerRepository.findByEmail(customer.getCust_email()) != null) {
            throw new RuntimeException("Email already exists");
        }
        return customerRepository.save(customer);
    }
    @Override
    public String loginCustomer(Customer customer){
        if (customerRepository.findByEmail(customer.getCust_email()) == null) {
            throw new RuntimeException("User not Registered");
        }
        else{
           String password = customerRepository.passwordMatch(customer.getCust_email());
           if(Objects.equals(password, customer.getCust_password())){
               return "Login Successful";
           }
           else{
               return "Incorrect Password";
           }
        }
    }
    @Override
    public Customer getCustomerById(int id) {
        Customer customer = customerRepository.findById(id).orElse(null);
        return customer;
    }
}
