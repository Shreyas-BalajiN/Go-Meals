package com.gomeals.repository;
import com.gomeals.model.MealChart;
import org.springframework.data.repository.CrudRepository;
import com.gomeals.model.MealChartID;

public interface MealChartRepository extends CrudRepository<MealChart, MealChartID> {

}
