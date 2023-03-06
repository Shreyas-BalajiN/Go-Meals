package com.gomeals.service;
import com.gomeals.model.Supplier;

import java.util.List;


public interface SupplierService {
    Supplier getSupplierDetails(int id);
    List<Supplier> getAllSuppliers();
    Supplier registerSupplier(Supplier supplier);
    Supplier updateSupplier(Supplier supplier);
    String deleteSupplier(int id);

}
