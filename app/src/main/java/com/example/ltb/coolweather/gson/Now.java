package com.example.ltb.coolweather.gson;

import com.google.gson.annotations.SerializedName;

public class Now  {
    @SerializedName("tmp")
    public  String temperayure;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
