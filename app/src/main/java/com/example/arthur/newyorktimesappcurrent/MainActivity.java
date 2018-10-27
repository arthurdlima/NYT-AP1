package com.example.arthur.newyorktimesappcurrent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import moviereviewactivities.MovieReviewActivity;
import searchactivities.ArticleSearchActivity;
import topstoriesactivities.TopStoriesActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void clickTopstories(View v){
        Intent intent;
        intent = new Intent(getApplicationContext(), TopStoriesActivity.class);
        startActivity(intent);
    }

    public void clickArticles(View v) {
        Intent intent;
        intent = new Intent(getApplicationContext(), ArticleSearchActivity.class);
        startActivity(intent);
    }

    public void clickMovieReview(View v) {
        Intent intent;
        intent = new Intent(getApplicationContext(), MovieReviewActivity.class);
        startActivity(intent);

    }

    }

