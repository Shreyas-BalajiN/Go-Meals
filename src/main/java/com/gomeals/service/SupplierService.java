package com.gomeals.service;
import com.gomeals.model.Supplier;

import java.util.List;


public interface SupplierService {
    public Supplier getSupplierDetails(int id);
    public List<Supplier> getAllSuppliers();
    public Supplier registerSupplier(Supplier supplier);
    public Supplier updateSupplier(Supplier supplier);
    public String deleteSupplier(int id);

}
