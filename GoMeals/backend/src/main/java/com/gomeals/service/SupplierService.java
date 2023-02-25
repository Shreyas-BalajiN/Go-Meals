package com.gomeals.service;
import com.gomeals.model.Supplier;


public interface SupplierService {
    public Supplier getSupplierDetails(int id);
    public Supplier registerSupplier(Supplier supplier);
    public Supplier updateSupplier(Supplier supplier);
    public String deleteSupplier(int id);
    public  String loginSupplier(Supplier supplier);

}
