package com.gomeals.repository;
import com.gomeals.model.mealchart;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface mealchartRepository extends CrudRepository<mealchart, String> {

}
