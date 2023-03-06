package com.gomeals.service;
import com.gomeals.model.mealchart;
import com.gomeals.model.mealchartID;
import org.springframework.stereotype.Service;

import java.util.List;


public interface mealChartService {
    public mealchart getMealChart(mealchartID id);
    public String addMealChart(List<mealchart> mealChart);
    public mealchart updateMealChart(mealchart mealChart);
    public String deleteMealChart(mealchartID id);
}
