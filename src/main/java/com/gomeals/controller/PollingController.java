package com.gomeals.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/polling")
public class PollingController {

    @GetMapping("/get")
    public void getPolling() {

    }

    @PostMapping("/create/{sup_id}")
    public void createPoll(@PathVariable("sup_id") int supId) {

    }
}
