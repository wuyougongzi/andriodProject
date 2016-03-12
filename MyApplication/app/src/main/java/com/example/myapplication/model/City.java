package com.example.myapplication.model;

/**
 * Created by chongge on 2016/3/12.
 */
public class City {
    private int id;
    private String cityName;
    private String cityCode;
    private int provinceId;

    public int getId(){
        return id;
    }
    public void setId(int id){
        id = id;
    }

    public String getCityName(){
        return cityName;
    }
    public void setCityName(String name){
        cityName = name;
    }

    public String getCityCode(){
        return cityCode;
    }
    public void setCityCode(String code){
        cityCode = code;
    }

    public int getProvinceId(){
        return provinceId;
    }
    public void setProvinceId(int provinceId) {
        provinceId = provinceId;
    }
}
