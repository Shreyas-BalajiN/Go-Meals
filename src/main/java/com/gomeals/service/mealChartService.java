package com.gomeals.service;
import com.gomeals.model.mealchart;
import com.gomeals.model.mealchartID;
import org.springframework.stereotype.Service;


public interface mealChartService {
    public mealchart getMealChart(mealchartID id);
    public mealchart addMealChart(mealchart mealChart);
    public mealchart updateMealChart(mealchart mealChart);
    public String deleteMealChart(mealchartID id);
}
