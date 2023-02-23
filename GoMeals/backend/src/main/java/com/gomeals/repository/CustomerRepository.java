package com.gomeals.repository;

import com.gomeals.model.Customer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
    @Query("SELECT c FROM Customer c WHERE c.cust_email = :email")
    Customer findByEmail(@Param("email") String email);
}
