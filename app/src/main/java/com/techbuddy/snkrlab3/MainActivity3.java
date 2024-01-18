package com.techbuddy.snkrlab3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.techbuddy.snkrlab3.R;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.content.Intent;
import android.widget.TextView;
import android.widget.ProgressBar;

import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.kwabenaberko.newsapilib.NewsApiClient;
import com.kwabenaberko.newsapilib.models.Article;
import com.kwabenaberko.newsapilib.models.request.TopHeadlinesRequest;
import com.kwabenaberko.newsapilib.models.response.ArticleResponse;
import com.techbuddy.snkrlab3.adapters.BrandsAdapter;
import com.techbuddy.snkrlab3.adapters.NewsRecyclerAdapter;
import com.techbuddy.snkrlab3.adapters.NewsRecyclerAdapter;
import com.techbuddy.snkrlab3.models.Brands;

import java.util.ArrayList;
import java.util.List;

public class MainActivity3 extends AppCompatActivity {

    RecyclerView recentRecycler, recyclerView;
    BrandsAdapter BrandsAdapter;
    NewsRecyclerAdapter adapter;
    List<Article> articleList = new ArrayList<>();
    LinearProgressIndicator progressIndicator;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        recyclerView = findViewById(R.id.news_recycler_view);
        progressIndicator = findViewById(R.id.progress_bar);
        setRecyclerView();

        getNews("TECHNOLOGY");

        List<Brands> brandsList = new ArrayList<>();
        brandsList.add(new Brands("Nike",R.drawable.nikecheck));
        brandsList.add(new Brands("Adidas",R.drawable.adidascheck));
        brandsList.add(new Brands("New Balance",R.drawable.newbalancecheck));
        brandsList.add(new Brands("Converse",R.drawable.conversecheck));
        brandsList.add(new Brands("Sketchers",R.drawable.sketchercheck));
        brandsList.add(new Brands("Rebook",R.drawable.rebookcheck));

        setRecentRecycler(brandsList);

        TextView seeAllTextView = findViewById(R.id.textView4);
        seeAllTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity3.this, MainActivity2.class);
                startActivity(intent);
            }
        });

    }

    private  void setRecentRecycler(List<Brands> brandsList){

        recentRecycler = findViewById(R.id.recent_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        recentRecycler.setLayoutManager(layoutManager);
        BrandsAdapter = new BrandsAdapter(this, brandsList);
        recentRecycler.setAdapter(BrandsAdapter);

    }

    void setRecyclerView(){
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new NewsRecyclerAdapter(articleList);
        recyclerView.setAdapter(adapter);
    }

    void changeInProgress(boolean show){
        if (show)
            progressIndicator.setVisibility(View.VISIBLE);
        else
            progressIndicator.setVisibility(View.INVISIBLE);
    }

    void getNews(String category){
        changeInProgress(true);
        NewsApiClient newsApiClient = new NewsApiClient("472c0a6fd20d4b5db0bec6cb3e305d26");
        newsApiClient.getTopHeadlines(
                new TopHeadlinesRequest.Builder()
                        .language("en")
                        .category(category)
                        .build(),
                new NewsApiClient.ArticlesResponseCallback() {
                    @Override
                    public void onSuccess(ArticleResponse response) {
                        runOnUiThread(()->{
                            changeInProgress(false);
                            articleList = response.getArticles();
                            adapter.updateData(articleList);
                            adapter.notifyDataSetChanged();
                        });
                    }

                    @Override
                    public void onFailure(Throwable throwable) {
                        String errorMessage = throwable.getMessage();
                        if (errorMessage != null) {
                            Log.i("GOT FAILURE", errorMessage);
                        } else {
                            Log.i("GOT FAILURE", "Unknown error occurred.");
                        }
                    }
                }
        );

    }

}
