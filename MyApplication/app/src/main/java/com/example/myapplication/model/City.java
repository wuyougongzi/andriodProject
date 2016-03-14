package com.example.myapplication.model;

/**
 * Created by chongge on 2016/3/12.
 */
public class City {
    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCityName(){
        return cityName;
    }
    public void setCityName(String name){
        this.cityName = name;
    }

    public String getCityCode(){
        return cityCode;
    }
    public void setCityCode(String code){
        this.cityCode = code;
    }

    public int getProvinceId(){
        return provinceId;
    }
    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    private int cityId;
    private String cityName;
    private String cityCode;
    private int provinceId;
}
