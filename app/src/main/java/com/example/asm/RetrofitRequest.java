package com.example.asm;


import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitRequest {
    public static Retrofit retrofit;
    public static Retrofit getRetrofit(){
        return retrofit = new Retrofit.Builder()
                .baseUrl("http://192.168.56.1:8000/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}
