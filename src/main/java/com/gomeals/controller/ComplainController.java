package com.gomeals.controller;

import com.gomeals.model.Complain;
import com.gomeals.service.ComplainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/complain")
public class ComplainController {

    @Autowired
    ComplainService complainService;

    @PostMapping("/create")
    public Complain createComplain(@RequestBody Complain complain) {
        return complainService.createComplain(complain);
    }
    @GetMapping("/get/{id}")
    public Complain getComplainById(@PathVariable("id") Integer complainId) {
        return complainService.getComplainById(complainId);
    }

    @GetMapping("/get/all")
    public List<Complain> getAllComplains() {
        return complainService.getAllComplains();
    }

    @PutMapping("/update")
    public Complain updateComplain(@RequestBody Complain complain){
        return complainService.updateComplain(complain);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteComplain(@PathVariable("id") Integer complainId){
        complainService.deleteComplain(complainId);
    }






}
