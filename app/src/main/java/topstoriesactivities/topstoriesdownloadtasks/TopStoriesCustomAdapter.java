package topstoriesactivities.topstoriesdownloadtasks;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.arthur.newyorktimesappcurrent.R;
import com.squareup.picasso.Picasso;

import java.util.List;

import searchactivities.articledownloadtasks.ArticleResponseObj;


public class TopStoriesCustomAdapter extends BaseAdapter {

    private List<TopStoriesResponseObj.ResultsBean> resultItem;
    private Context context;
    private LayoutInflater inflater;

    public TopStoriesCustomAdapter(Context context, List<TopStoriesResponseObj.ResultsBean> resultItem) {
        this.context = context;
        this.resultItem = resultItem;

    }


    @Override
    public int getCount() {
        return resultItem.size();
    }

    @Override
    public Object getItem(int position) {
        return resultItem.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView = convertView;
        ViewHolderTopStories holder = null;

        rowView = convertView;
        if(rowView==null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            rowView = inflater.inflate(R.layout.list_item, parent, false);
            holder = new ViewHolderTopStories(rowView);
            rowView.setTag(holder);
        }else {
            holder = (ViewHolderTopStories) rowView.getTag();
        }

        TopStoriesResponseObj.ResultsBean item = (TopStoriesResponseObj.ResultsBean) getItem(position);
        try{
            String thumbnailUrl = item.getMultimedia().get(0).getUrl();
            Picasso.get().load(thumbnailUrl).fit().into(holder.getThumbnailHolder());
        }catch (Exception e) {
            Picasso.get().load(R.drawable.noimages).fit().into(holder.getThumbnailHolder());
        }

        try{
            String trimDate = item.getUpdated_date().substring(0,10);
            //.setText((trimDate));
            holder.getDateHolder().setText(trimDate);
        } catch (Exception e){
            holder.getDateHolder().setText("??/??/????");
        }
        holder.getTitleHolder().setText(item.getTitle());

        return rowView;
    }
}
