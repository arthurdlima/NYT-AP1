package topstoriesactivities.topstoriesdownloadtasks;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.arthur.newyorktimesappcurrent.R;

public class ViewHolderTopStories {
    private ImageView thumbnailHolder;
    private TextView titleHolder;
    private TextView dateHolder;
    ViewHolderTopStories(View view){
        thumbnailHolder = view.findViewById(R.id.thumbNail);
        titleHolder = view.findViewById(R.id.date);
        dateHolder = view.findViewById(R.id.headLine);
    }

    public ImageView getThumbnailHolder() {
        return thumbnailHolder;
    }

    public void setThumbnailHolder(ImageView thumbnailHolder) {
        this.thumbnailHolder = thumbnailHolder;
    }

    public TextView getTitleHolder() {
        return titleHolder;
    }

    public void setTitleHolder(TextView titleHolder) {
        this.titleHolder = titleHolder;
    }

    public TextView getDateHolder() {
        return dateHolder;
    }

    public void setDateHolder(TextView dateHolder) {
        this.dateHolder = dateHolder;
    }

}
