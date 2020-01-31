package searchactivities;

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
import searchactivities.articledownloadtasks.ArticleCustomAdapter;
import searchactivities.articledownloadtasks.ArticleResponseObj;



public class ArticleSearchActivity extends AppCompatActivity {

    private ListView listview;
    private ArticleResponseObj responseObj;
    private ArticleCustomAdapter adapter;
    private Gson gson;
    private AsyncHttpClient client;
    private String url = null;
    private String searchString = null;


    //The searchbox editText
    private EditText searchBox;

    //search button
    public void getSearchBtn(View view){
        // For keyboard to minimize on clicking search
        InputMethodManager manager = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
        manager.hideSoftInputFromWindow(searchBox.getWindowToken(),0);


        //Trimming input search before sending to api
        searchString = searchBox.getText().toString();
        searchString = searchString.replaceAll("\\s+","");

        url = "https://api.nytimes.com/svc/search/v2/articlesearch.json?api-key=ojpr9RChTP1F0nBOMBVKgKAlh17jk7SR&q="+searchString+"&fl=pub_date,headline,multimedia,web_url&page=0";

        client = new AsyncHttpClient();
        client.get(ArticleSearchActivity.this, url, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                String responsestr = new String(responseBody);
                gson = new Gson();
                responseObj = gson.fromJson(responsestr,ArticleResponseObj.class);
                adapter = new ArticleCustomAdapter(ArticleSearchActivity.this,responseObj.getResponse().getDocs());
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
        setContentView(R.layout.activity_article_search);
        listview = findViewById(R.id.ArticleListView);
        searchBox = findViewById(R.id.searchBox);
    }
}
