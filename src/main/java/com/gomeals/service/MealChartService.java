package com.gomeals.service;
import com.gomeals.model.MealChart;
import com.gomeals.model.MealChartID;


public interface MealChartService {
    public MealChart getMealChart(MealChartID id);
    public MealChart addMealChart(MealChart mealChart);
    public MealChart updateMealChart(MealChart mealChart);
    public String deleteMealChart(MealChartID id);
}
