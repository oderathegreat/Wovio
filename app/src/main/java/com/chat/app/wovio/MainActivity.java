package com.chat.app.wovio;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Window;

import com.chat.app.wovio.Adapter.ListSourceAdapter;
import com.chat.app.wovio.Common.Common;
import com.chat.app.wovio.Interface.NewsServe;
import com.chat.app.wovio.Model.WebRemote;
import com.google.gson.Gson;

import java.io.IOException;

import dmax.dialog.SpotsDialog;
import io.paperdb.Paper;
import okhttp3.Request;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {


    RecyclerView listWebRemote;
    RecyclerView.LayoutManager layoutManager;
    NewsServe mNewsServe;
    ListSourceAdapter adapter;
    AlertDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //init cache
        Paper.init(this);

        //service
        mNewsServe = Common.getNewsService();
         //initilaizing my views
        listWebRemote = (RecyclerView)findViewById(R.id.listSource);
        layoutManager = new LinearLayoutManager(this);
        listWebRemote.setLayoutManager(layoutManager);


     //add your dialog here
        loadWebsiteSource(false);

    }




    private void loadWebsiteSource(boolean isRefresh) {

        if (!isRefresh) {

       String cache = Paper.book().read("cached");

       if (cache !=null && cache.isEmpty()) {

           WebRemote webRemote = new Gson().fromJson(cache, WebRemote.class);
           adapter = new ListSourceAdapter(getBaseContext(), webRemote);
           adapter.notifyDataSetChanged();
           listWebRemote.setAdapter(adapter);
       }  else { //if i dont have caches

           dialog.show();
           //source/fecth new data

           new Call<WebRemote>() {

               @Override
               public Response<WebRemote> execute() throws IOException {
                   return null;
               }

               @Override
               public void enqueue(Callback<WebRemote> callback) {

               }

               @Override
               public boolean isExecuted() {

                  /* Paper.book().write("cache", new Gson().toJson())*/
                   return false;
               }

               @Override
               public void cancel() {

               }

               @Override
               public boolean isCanceled() {
                   return false;
               }

               @Override
               public Call<WebRemote> clone() {
                   return null;
               }

               @Override
               public Request request() {
                   return null;
               }
           }.enqueue(mNewsServe.getSources());



       }


        }


    }
}
