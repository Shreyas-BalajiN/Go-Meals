package com.gomeals.repository;

import com.gomeals.model.Delivery;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DeliveryRepository extends CrudRepository<Delivery, Integer> {

    List<Delivery> findByCustId(int custId);

}
