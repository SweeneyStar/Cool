package com.example.thinkpad.cool.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Thinkpad on 2017/6/8.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}