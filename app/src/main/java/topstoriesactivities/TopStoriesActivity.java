package topstoriesactivities;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import com.example.arthur.newyorktimesappcurrent.R;
import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import cz.msebera.android.httpclient.Header;
import topstoriesactivities.topstoriesdownloadtasks.TopStoriesCustomAdapter;
import topstoriesactivities.topstoriesdownloadtasks.TopStoriesResponseObj;

public class TopStoriesActivity extends AppCompatActivity {
    private Spinner spinner;
    private ListView listview;
    private TopStoriesResponseObj responseObj;
    private TopStoriesCustomAdapter adapter;
    private Gson gson;
    private AsyncHttpClient client;
    private String url = null;

    public void goBackTopstories(View view){
        finish();
    }

    public void topStoriesSearchBtn(View view){
        //Getting the string from spinner to put in url
        String spinnerText = spinner.getSelectedItem().toString();
        url = "https://api.nytimes.com/svc/topstories/v2/"+spinnerText+".json?api-key=ojpr9RChTP1F0nBOMBVKgKAlh17jk7SR";

        client = new AsyncHttpClient();
        client.get(TopStoriesActivity.this, url, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                String responsestr = new String(responseBody);
                gson = new Gson();
                responseObj = gson.fromJson(responsestr,TopStoriesResponseObj.class);
                adapter = new TopStoriesCustomAdapter(TopStoriesActivity.this,responseObj.getResults());
                listview.setAdapter(adapter);
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {

            }
        });

    }







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topstories_search);
        listview = findViewById(R.id.TpStoriesListView);
        spinner = findViewById(R.id.TopStoriesSpinner);
        ArrayAdapter<String>spinnerAdapter = new ArrayAdapter<String>(TopStoriesActivity.this,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.topstories_spinner));
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(spinnerAdapter);
    }
}
