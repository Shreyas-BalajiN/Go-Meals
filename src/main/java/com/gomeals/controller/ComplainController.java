package com.gomeals.controller;

import com.gomeals.model.Complain;
import com.gomeals.service.ComplainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/complain")
public class ComplainController {

    @Autowired
    ComplainService complainService;

    @GetMapping("/get/{id}")
    public Complain getComplainById(@PathVariable("id") Integer id) {
        return complainService.getComplainById(id);
    }

    @PostMapping("/create")
    public Complain createComplain(@RequestBody Complain complain) {
        return complainService.createComplain(complain);
    }
    /*
    @DeleteMapping
    public ResponseEntity<HttpStatus> deleteComplain(@PathVariable Integer)*/


}
