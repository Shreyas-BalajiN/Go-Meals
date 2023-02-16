package com.gomeals.service.implementation;
import com.gomeals.model.mealchart;
import com.gomeals.service.mealChartService;
import com.gomeals.repository.mealchartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class mealChartServiceImplementation implements mealChartService {
    @Autowired
    mealchartRepository mealchartRepository;
    @Override
    public mealchart getMealChart(int id) {
        mealchart mealChart=mealchartRepository.findById(id).orElse(null);
        return mealChart;
    }
    @Override
    public mealchart addMealChart(mealchart mealChart){
        mealchartRepository.save(mealChart);
        return mealChart;
    }
    @Override
    public String updateMealChart(mealchart mealChart){
        mealchart m=mealchartRepository.findById((int) mealChart.getSupId()).orElse(null);
        m.setDay(mealChart.getDay());
        m.setItem1(mealChart.getItem1());
        m.setItem2(mealChart.getItem2());
        m.setItem3(mealChart.getItem3());
        m.setItem4(mealChart.getItem4());
        m.setItem5(mealChart.getItem5());
        m.setSpecialDate(mealChart.getSpecialDate());
        return "Meal Chart Updated";
    }
    @Override
    public String deleteMealChart(int id){
        mealchartRepository.deleteById(id);
        return "Meal Chart Deleted";
    }
}
