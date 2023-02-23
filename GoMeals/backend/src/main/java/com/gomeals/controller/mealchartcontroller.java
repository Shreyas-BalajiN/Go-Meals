package com.gomeals.controller;
import com.gomeals.model.mealchart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.gomeals.service.mealChartService;
import com.gomeals.model.mealchartID;

@RestController
@RequestMapping("/meal_chart")
public class mealchartcontroller {
    @Autowired
    mealChartService mealChartService;
    @GetMapping ("/get")
    public mealchart getMealChart(@RequestBody mealchartID id){
        return mealChartService.getMealChart(id);
    }
    @PostMapping ("/create")
    public mealchart addMealChart(@RequestBody mealchart mealChart){
        return mealChartService.addMealChart(mealChart);
    }
    @PutMapping("/update")
    public mealchart updateMealChart(@RequestBody mealchart mealChart){
        return mealChartService.updateMealChart(mealChart);
    }
    @DeleteMapping("/delete")
    public String deleteMealChart(@RequestBody mealchartID id){
        return mealChartService.deleteMealChart(id);
    }

}
