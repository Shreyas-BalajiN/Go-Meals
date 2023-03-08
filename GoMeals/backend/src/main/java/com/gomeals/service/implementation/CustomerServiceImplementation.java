package com.gomeals.service.implementation;

import com.gomeals.model.Customer;
import com.gomeals.model.Subscriptions;
import com.gomeals.model.Supplier;
import com.gomeals.repository.CustomerRepository;
import com.gomeals.repository.SubscriptionRepository;
import com.gomeals.repository.supplierRepository;
import com.gomeals.service.CustomerService;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.*;

@Service
public class CustomerServiceImplementation implements CustomerService{
    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    supplierRepository supplierRepository;
    @Autowired
    SubscriptionRepository subscriptionRepository;

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
    public String loginCustomer(Customer customer, HttpServletResponse response){
        if (customerRepository.findByEmail(customer.getCust_email()) == null) {
            throw new RuntimeException("User not Registered");
        }
        else{
           String password = customerRepository.passwordMatch(customer.getCust_email());
           if(Objects.equals(password, customer.getCust_password())){
               Cookie cookie = new Cookie("loggedInUser", customer.getCust_email());
               response.addCookie(cookie);
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
        if(customer != null){

            List<Supplier> suppliers = new ArrayList<>();
            List<Subscriptions> subscriptions = new ArrayList<>();
            subscriptionRepository.findSubscriptionsByCustomerIdAndActiveStatus(customer.getCust_id(),1).forEach(
                    subscription -> {
                        // For each supplier that the customer is subbed to, store the supplier details
                        Optional<Supplier> supplier = supplierRepository.findById(subscription.getSupplierId());
                        suppliers.add(unwrapSupplier(supplier));
                        // Store the subscription details
                        subscriptions.add(subscription);
                    }
            );
            customer.setSuppliers(suppliers);
            customer.setSubscriptions(subscriptions);

        }
        return customer;
    }
    private static Supplier unwrapSupplier(Optional<Supplier> entity){
        return entity.orElse(null);
    }


}
