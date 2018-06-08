package com.chat.app.wovio.Interface;

import com.chat.app.wovio.Model.IconBetaFinder;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by Hp on 6/8/2018.
 */

public interface IconFetchService {

    @GET
    Callback<IconBetaFinder> getIconUrl(String Url);
}
