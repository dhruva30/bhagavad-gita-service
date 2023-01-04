package com.dhruva.sharma.bhagavad.gita.service.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1")
public class HealthCheckController {

    @GetMapping("/healthcheck")
    public Map<String, String> healthCheck(){
        Map<String, String> status = new HashMap<>();
        status.put("status", "OK");
        return status;
    }
}
