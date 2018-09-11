package com.sasa.feeder.api.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "feeder-service")
public interface FeederApi {

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String greeting(@RequestParam(value = "name") String name);

}
