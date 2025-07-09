package com.amranemon.collageproject.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.amranemon.collageproject.NewsAdapter;
import com.amranemon.collageproject.NewsModel;
import com.amranemon.collageproject.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<NewsModel> newsList;
    NewsAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        newsList = new ArrayList<>();
        newsList.add(new NewsModel("Learn the basics of HTML for web structure", R.drawable.html));
        newsList.add(new NewsModel("Style your websites beautifully using CSS", R.drawable.css));
        newsList.add(new NewsModel("Make websites interactive with JavaScript", R.drawable.js));
        newsList.add(new NewsModel("Start programming with the C language", R.drawable.c));
        newsList.add(new NewsModel("Build powerful apps using C++", R.drawable.cpp));


        adapter = new NewsAdapter(this, newsList);
        recyclerView.setAdapter(adapter);


        adapter = new NewsAdapter(this, newsList);
        recyclerView.setAdapter(adapter);
    }
}
