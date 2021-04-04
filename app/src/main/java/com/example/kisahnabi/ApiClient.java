package com.example.kisahnabi;

import com.google.gson.internal.$Gson$Preconditions;

import java.net.URL;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    private static final String BASE_URL="https://kisahnabi-api-zhirrr.vercel.app/api/";
    private static Retrofit retrofit;
    public static Retrofit ambilKisah(){
        if (retrofit==null){
            retrofit=new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
    }
        return retrofit;
}
}
