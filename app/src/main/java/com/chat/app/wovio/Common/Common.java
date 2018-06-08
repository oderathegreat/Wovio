package com.chat.app.wovio.Common;

import com.chat.app.wovio.Interface.NewsServe;
import com.chat.app.wovio.Remote.RetroClient;

/**
 * Created by Hp on 6/8/2018.
 */

public class Common {

   private static final String BASE_URL = "https://newsapi.org/";
   public static final String API_KEY = "d7fb5a51c92d41e3beb4df294f4b8db9";


   public static NewsServe getNewsService(){
     return RetroClient.getClient(BASE_URL).create(NewsServe.class);


   }


}
