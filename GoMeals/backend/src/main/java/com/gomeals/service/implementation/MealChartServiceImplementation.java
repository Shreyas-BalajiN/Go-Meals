package com.gomeals.service.implementation;
import com.gomeals.model.MealChart;
import com.gomeals.service.MealChartService;
import com.gomeals.repository.MealChartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gomeals.model.MealChartID;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class MealChartServiceImplementation implements MealChartService {
    @Autowired
    MealChartRepository mealchartRepository;
    @Override
    public MealChart getMealChart(MealChartID id) {
        return mealchartRepository.findById(id).orElse(null);

    }
    @Override

    public String addMealChart(List<MealChart> mealChart){
        mealchartRepository.saveAll(mealChart);
        return "Objects saved";
    }
    @Override
    public MealChart updateMealChart(@RequestBody MealChart mealChart){
        MealChart m=mealchartRepository.findById(mealChart.getId()).orElse(null);
        m.setId(mealChart.getId());
        m.setItem1(mealChart.getItem1());
        m.setItem2(mealChart.getItem2());
        m.setItem3(mealChart.getItem3());
        m.setItem4(mealChart.getItem4());
        m.setItem5(mealChart.getItem5());
        m.setSpecialDate(mealChart.getSpecialDate());
        mealchartRepository.save(m);
        return m;
    }
    @Override
    public String deleteMealChart(MealChartID id){
        mealchartRepository.deleteById(id);
        return "Meal Chart Deleted";
    }
}
