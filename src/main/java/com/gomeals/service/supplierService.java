package com.gomeals.service;
import com.gomeals.model.supplier;
import org.springframework.stereotype.Service;


public interface supplierService {
    public supplier getSupplierDetails(int id);
    public supplier registerSupplier(supplier supplier);
    public String updateSupplier(supplier supplier);
    public String deleteSupplier(int id);

}
