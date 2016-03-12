package com.example.myapplication.util;

/**
 * Created by chongge on 2016/3/12.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
