package com.sasa.iguana.feeder.service;

import org.springframework.stereotype.Service;

@Service
public class FeederService {

    public String greeting(String name) {
        return "Hi" + name;
    }

}
