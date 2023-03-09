package com.gomeals.service.implementation;
import com.gomeals.model.Customer;
import com.gomeals.repository.CustomerRepository;
import com.gomeals.repository.SubscriptionRepository;
import com.gomeals.repository.supplierRepository;
import com.gomeals.model.Supplier;
import com.gomeals.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class SupplierServiceImplementation implements SupplierService {

    @Autowired
    supplierRepository supplierRepository;

    @Autowired
    SubscriptionRepository subscriptionRepository;

    @Autowired
    CustomerRepository customerRepository;


    public Supplier getSupplierDetails(int id){
        Supplier supplier = supplierRepository.findById(id).orElse(null);
        if(supplier != null){
            List<Customer> customers = new ArrayList<>();
            subscriptionRepository.findSubscriptionsBySupplierIdAndActiveStatus(id,1).forEach(
                    subscribedCustomer -> {
                        Optional<Customer> customer = customerRepository.findById(subscribedCustomer.getCustomerId());
                        customers.add( unwrapCustomer(customer));
                    });
            supplier.setCustomers(customers);
        }
        return supplier;
    }

    public List<Supplier> getAllSuppliers(){
        List<Supplier> suppliers = new ArrayList<>();
        supplierRepository.findAll().forEach(supplier -> suppliers.add(supplier));
        return suppliers;
    }

    public Supplier registerSupplier(Supplier supplier){
        return  supplierRepository.save(supplier);
    }

    public Supplier updateSupplier(@RequestBody Supplier supplier){
        Supplier s=supplierRepository.findById(supplier.getSupId()).orElse(null);
        s.setSupName(supplier.getSupName());
        s.setSupContactNumber(supplier.getSupContactNumber());
        s.setSupEmail(supplier.getSupEmail());
        s.setSupAddress(supplier.getSupAddress());
        s.setGovtIssuedId(supplier.getGovtIssuedId());
        s.setPassword(supplier.getPassword());
        supplierRepository.save(s);
        return supplier;

    }

    public String deleteSupplier(int id){
        supplierRepository.deleteById(id);
        return "Supplier deleted";
    }
    public String loginSupplier(Supplier supplier){
        if (supplierRepository.findSupplierByEmail(supplier.getSupEmail()) == null) {
            throw new RuntimeException("Supplier not Registered");
        }
        else{
            String password = supplierRepository.supplierPasswordMatch(supplier.getSupEmail());
            if(Objects.equals(password, supplier.getPassword())){
                return "Login Successful";
            }
            else{
                return "Incorrect Password";
            }
        }
    }

    private static Customer unwrapCustomer(Optional<Customer> entity){
        return entity.orElse(null);
    }

}