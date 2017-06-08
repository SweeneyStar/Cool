package com.example.thinkpad.cool.util;



import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Callback;

/**
 * Created by Thinkpad on 2017/6/7.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address,Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
