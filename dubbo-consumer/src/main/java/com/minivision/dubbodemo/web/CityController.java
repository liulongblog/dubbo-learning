package com.minivision.dubbodemo.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.minivision.dubbodemo.city.api.CityDubboService;
import com.minivision.dubbodemo.dto.QueryCityByNameReqVO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class CityController {
    @Reference(version = "1.0.0")
    private CityDubboService service;
    @RequestMapping(value = "/queryCityByName")
    public String queryCityByName(@RequestBody QueryCityByNameReqVO req) {
        return service.queryCityByName(req.getCityName());
    }
}
