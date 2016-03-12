package com.example.myapplication.util;

import android.text.TextUtils;

import com.example.myapplication.db.CoolWeatherDB;
import com.example.myapplication.model.Province;

/**
 * Created by chongge on 2016/3/12.
 */
public class Utility {
    public synchronized static boolean handleProvinceResponce(CoolWeatherDB coolWeatherDB,
                                                              String response){
        if(!TextUtils.isEmpty(response)){
            String[] allProvince = response.split(",");
            if(allProvince != null && allProvince.length > 0){
                for(String p : allProvince){
                    String[] array = p.split("\\|");
                    Province province = new Province();
                    province.setProvinceCode(array[0]);
                    province.setProvinceName(array[1]);

                    coolWeatherDB.saveProvince(province);
                }
                return  true;
            }
        }
        return  false;
    }
}
