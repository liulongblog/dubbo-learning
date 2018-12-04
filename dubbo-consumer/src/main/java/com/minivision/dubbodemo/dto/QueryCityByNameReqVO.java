package com.minivision.dubbodemo.dto;

import java.io.Serializable;

public class QueryCityByNameReqVO implements Serializable {
    /*
    城市名
     */
    private String cityName;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
