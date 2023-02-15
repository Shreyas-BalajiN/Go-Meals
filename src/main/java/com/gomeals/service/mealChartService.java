package com.gomeals.service;
import com.gomeals.model.mealchart;
import org.springframework.stereotype.Service;


public interface mealChartService {
    public mealchart getMealChart(int id);
    public String addMealChart(mealchart mealChart);
    public String updateMealChart(mealchart mealChart);
    public String deleteMealChart(int id);
}
