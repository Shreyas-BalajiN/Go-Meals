package com.gomeals.service.implementation;
import com.gomeals.repository.supplierRepository;
import com.gomeals.model.Supplier;
import com.gomeals.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class supplierServiceImplementation implements SupplierService {

    @Autowired
    supplierRepository supplierRepository;
    public Supplier getSupplierDetails(int id){
        Supplier supplier= supplierRepository.findById(id).orElse(null);
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

}
