package com.gomeals.controller;
import com.gomeals.model.mealchart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.gomeals.service.mealChartService;

@RestController
@RequestMapping("/meal_chart")
public class mealchartcontroller {
    @Autowired
    mealChartService mealChartService;
    @GetMapping ("/get/{id}")
    public mealchart getMealChart(@PathVariable int id){
        return mealChartService.getMealChart(id);
    }
    @PostMapping ("/create")
    public mealchart addMealChart(@RequestBody mealchart mealChart){
        return mealChartService.addMealChart(mealChart);
    }
    @PutMapping("/update")
    public String updateMealChart(mealchart mealChart){
        return mealChartService.updateMealChart(mealChart);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteMealChart(@PathVariable int id){
        return mealChartService.deleteMealChart(id);
    }

}
