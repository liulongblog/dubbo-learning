package com.minivision.dubbodemo.city.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.minivision.dubbodemo.city.api.CityDubboService;

@Service(version = "1.0.0")
public class CityDubboServiceImpl implements CityDubboService {
    @Override
    public String queryCityByName(String name) {
        return "调用Dubbo Service成功，城市：" + name;
    }
}
