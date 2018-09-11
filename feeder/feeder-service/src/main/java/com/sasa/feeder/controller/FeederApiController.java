package com.sasa.feeder.controller;

import com.sasa.feeder.api.feign.FeederApi;
import com.sasa.feeder.service.FeederService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("feeder-service")
public class FeederApiController implements FeederApi{

    @Autowired
    private FeederService feederService;

    @GetMapping(value = "/hi")
    public String greeting(@RequestParam String name) {
        return feederService.greeting(name);
    }
}
