package com.gomeals.service.implementation;
import com.gomeals.repository.supplierRepository;
import com.gomeals.model.supplier;
import com.gomeals.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class supplierServiceImplementation implements SupplierService {

    @Autowired
    supplierRepository supplierRepository;
    public supplier getSupplierDetails(int id){
        supplier supplier= supplierRepository.findById(id).orElse(null);
        return supplier;
    }

    public supplier registerSupplier(supplier supplier){
      return  supplierRepository.save(supplier);
    }

    public String updateSupplier(supplier supplier){
        supplier s=supplierRepository.findById(supplier.getSupId()).orElse(null);
        s.setSupName(supplier.getSupName());
        s.setSupContactNumber(supplier.getSupContactNumber());
        s.setSupEmail(supplier.getSupEmail());
        s.setSupAddress(supplier.getSupAddress());
        s.setGovtIssuedId(supplier.getGovtIssuedId());
        return "Supplier profile updated";

    }

    public String deleteSupplier(int id){
        supplierRepository.deleteById(id);
        return "Supplier deleted";
    }

}
