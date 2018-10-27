package moviereviewactivities;



import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ListView;

import com.example.arthur.newyorktimesappcurrent.R;
import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import cz.msebera.android.httpclient.Header;
import moviereviewactivities.moviereviewdownloadtasks.MovieCustomAdapter;
import moviereviewactivities.moviereviewdownloadtasks.MovieResponseObj;
import searchactivities.articledownloadtasks.ArticleCustomAdapter;

public class MovieReviewActivity extends AppCompatActivity {
    private ListView listview;
    private MovieResponseObj responseObj;
    private MovieCustomAdapter adapter;
    private Gson gson;
    private AsyncHttpClient client;
    private String url = null;
    private String searchString = null;


    //The searchbox editText
    private EditText searchBox;


    public void getSearchBtn(View view) {
        // For keyboard to minimize on clicking search
        InputMethodManager manager = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
        manager.hideSoftInputFromWindow(searchBox.getWindowToken(),0);


        //Trimming input search before sending to api
        searchString = searchBox.getText().toString();
        searchString = searchString.replaceAll("\\s+","");

        url = "https://api.nytimes.com/svc/movies/v2/reviews/search.json?api-key=8b7bd25e12164826ba91787497ea5c6b&query="+searchString;

        client = new AsyncHttpClient();
        client.get(MovieReviewActivity.this, url, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                String responsestr = new String(responseBody);
                gson = new Gson();
                responseObj = gson.fromJson(responsestr,MovieResponseObj.class);
                adapter = new MovieCustomAdapter(MovieReviewActivity.this,responseObj.getResults());
                listview.setAdapter(adapter);
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {

            }
        });
    }

    //Return button
    public void goBack(View view){
        finish();
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_review);
        listview = findViewById(R.id.MoviewListView);
        searchBox = findViewById(R.id.Moviesearchbox);
    }
}
