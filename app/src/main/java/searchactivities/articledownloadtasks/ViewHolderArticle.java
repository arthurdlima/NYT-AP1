package searchactivities.articledownloadtasks;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.arthur.newyorktimesappcurrent.R;

public class ViewHolderArticle {
    private ImageView thumbnailHolder;
    private TextView headlineHolder;
    private TextView dateHolder;
    ViewHolderArticle(View view){
        thumbnailHolder = view.findViewById(R.id.thumbNail);
        headlineHolder = view.findViewById(R.id.date);
        dateHolder = view.findViewById(R.id.headLine);
    }

    public ImageView getThumbnailHolder() {
        return thumbnailHolder;
    }

    public void setThumbnailHolder(ImageView thumbnailHolder) {
        this.thumbnailHolder = thumbnailHolder;
    }

    public TextView getHeadlineHolder() {
        return headlineHolder;
    }

    public void setHeadlineHolder(TextView headlineHolder) {
        this.headlineHolder = headlineHolder;
    }

    public TextView getDateHolder() {
        return dateHolder;
    }

    public void setDateHolder(TextView dateHolder) {
        this.dateHolder = dateHolder;
    }
}
