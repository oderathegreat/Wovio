package com.chat.app.wovio.Interface;

import com.chat.app.wovio.Model.WebRemote;

import retrofit2.Callback;
import retrofit2.http.GET;

/**
 * Created by Hp on 6/8/2018.
 */

public interface NewsServe {

    @GET("v1/sources?language=en")
    Callback<WebRemote> getSources();

}
