package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TomatoController {

    @GetMapping("/api/growbox/tomato")
    public Tomato tomato(float humidity, long temperature, long illuminance, String lastWateringTime, String imageUrl, long yield_thisYear, long yield_previousYear) {
        return new Tomato(humidity, temperature, illuminance, lastWateringTime, imageUrl, yield_thisYear, yield_previousYear);
    }
}
