package com.chat.app.wovio.Remote;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Hp on 6/8/2018.
 */

public class IconServiceClient {

    private static Retrofit retrofit= null;
    public static Retrofit getClient()
    {
        if (retrofit==null) {

            retrofit = new Retrofit.Builder()
                    .baseUrl("https://besticon-demo.herokuapp.com/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();



        }

        return retrofit;


    }

}
