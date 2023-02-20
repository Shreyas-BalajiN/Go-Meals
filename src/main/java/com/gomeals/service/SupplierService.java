package com.gomeals.service;
import com.gomeals.model.supplier;


public interface SupplierService {
    public supplier getSupplierDetails(int id);
    public supplier registerSupplier(supplier supplier);
    public supplier updateSupplier(supplier supplier);
    public String deleteSupplier(int id);

}
