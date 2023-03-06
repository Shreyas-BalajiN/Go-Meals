package com.gomeals.service.implementation;
import com.gomeals.model.mealchart;
import com.gomeals.service.mealChartService;
import com.gomeals.repository.mealchartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gomeals.model.mealchartID;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class mealChartServiceImplementation implements mealChartService {
    @Autowired
    mealchartRepository mealchartRepository;
    @Override
    public mealchart getMealChart(mealchartID id) {
        return mealchartRepository.findById(id).orElse(null);

    }
    @Override
    public String addMealChart(List<mealchart> mealChart){
        mealchartRepository.saveAll(mealChart);
        return "Objects saved";
    }
    @Override
    public mealchart updateMealChart( @RequestBody mealchart mealChart){
        mealchart m=mealchartRepository.findById(mealChart.getId()).orElse(null);
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
    public String deleteMealChart(mealchartID id){
        mealchartRepository.deleteById(id);
        return "Meal Chart Deleted";
    }
}
