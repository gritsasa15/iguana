package com.sasa.iguana.feeder.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "feeder-service")
public interface FeederApi {

    @GetMapping(value = "/hi")
    String greeting(@RequestParam String name);

}
