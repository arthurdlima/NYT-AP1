package moviereviewactivities.moviereviewdownloadtasks;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.arthur.newyorktimesappcurrent.R;
import com.squareup.picasso.Picasso;

import java.util.List;


public class MovieCustomAdapter extends BaseAdapter {

    private List<MovieResponseObj.ResultsBean> movieItem;
    private Context context;
    private LayoutInflater inflater;

    public MovieCustomAdapter(Context context, List<MovieResponseObj.ResultsBean> movieItem) {
        this.context = context;
        this.movieItem = movieItem;

    }



    @Override
    public int getCount() {
        return movieItem.size();
    }

    @Override
    public Object getItem(int position) {
        return movieItem.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView = convertView;
        ViewHolderMovie holder = null;
        if(rowView==null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            rowView = inflater.inflate(R.layout.list_item, parent, false);
            holder = new ViewHolderMovie(rowView);
            rowView.setTag(holder);
        }else{
            holder = (ViewHolderMovie) rowView.getTag();
        }

        MovieResponseObj.ResultsBean item = (MovieResponseObj.ResultsBean) getItem(position);
        //If there is an image from api->show, if not, show "no image" png.
        try{
            String thumbnailUrl = item.getMultimedia().getSrc();
            Picasso.get().load(thumbnailUrl).fit().into(holder.getThumbnailHolder());

        }catch (Exception e){
            Picasso.get().load(R.drawable.noimages).fit().into(holder.getThumbnailHolder());
        }
        //Full date comes with extra info. trim.
        try{
            String trimDate = item.getPublication_date().substring(0,10);
            //.setText((trimDate));
            holder.getDateHolder().setText(trimDate);
        } catch (Exception e){
            holder.getDateHolder().setText("??/??/????");
        }
        holder.getHeadlineHolder().setText(item.getHeadline());

        return rowView;
    }
}
