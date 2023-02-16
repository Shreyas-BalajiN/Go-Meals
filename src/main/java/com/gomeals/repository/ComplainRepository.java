package com.gomeals.repository;

import com.gomeals.model.Complain;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ComplainRepository extends CrudRepository<Complain, Integer> {

    /*List<Complain> findComplainByCustomerId(int custommerId);
    List<Complain> findComplainBySupplierId(int supplierId);*/



}
