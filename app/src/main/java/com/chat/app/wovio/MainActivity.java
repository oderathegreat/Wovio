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

import dmax.dialog.SpotsDialog;
import io.paperdb.Paper;
import retrofit2.Call;

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
           mNewsServe.

       }


        }


    }
}
