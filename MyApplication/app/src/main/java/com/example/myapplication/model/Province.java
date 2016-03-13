package com.example.myapplication.model;

/**
 * Created by chongge on 2016/3/12.
 */
public class Province {
    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public String getProvinceName(){
        return provinceName;
    }
    public void setProvinceName(String name){
        provinceName = name;
    }

    public String getProvinceCode(){
        return provinceCode;
    }
    public void setProvinceCode(String code){
        provinceCode = code;
    }

    private  int provinceId;
    private String provinceName;
    private String provinceCode;
}
