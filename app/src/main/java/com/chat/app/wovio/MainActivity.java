package com.chat.app.wovio;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.chat.app.wovio.Adapter.ListSourceAdapter;
import com.chat.app.wovio.Interface.NewsServe;

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
    }
}
