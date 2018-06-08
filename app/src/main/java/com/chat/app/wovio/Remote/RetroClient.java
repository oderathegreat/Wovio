package com.chat.app.wovio.Remote;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Hp on 6/8/2018.
 */

public class RetroClient {

    private static Retrofit retrofit= null;
    public static Retrofit getClient(String BaseUrl)
    {
        if (retrofit==null) {

               retrofit = new Retrofit.Builder()
                       .baseUrl(BaseUrl)
                       .addConverterFactory(GsonConverterFactory.create())
                       .build();



        }

    return retrofit;


    }


}
