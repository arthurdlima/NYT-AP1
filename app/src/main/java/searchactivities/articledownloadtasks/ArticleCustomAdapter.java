package searchactivities.articledownloadtasks;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.arthur.newyorktimesappcurrent.R;
import com.squareup.picasso.Picasso;

import java.util.List;

/*"Whenever you need a customized list in a ListView or
customized grids in a GridView you create your own adapter
and extend base adapter in that." Since I'm doing this for NYT
app, will use custom adapter.
*/
public class ArticleCustomAdapter extends BaseAdapter {

    private List<ArticleResponseObj.ResponseBean.DocsBean> docItem;
    private Context context;
    private LayoutInflater inflater;

    public ArticleCustomAdapter(Context context, List<ArticleResponseObj.ResponseBean.DocsBean> docItem) {
        this.context = context;
        this.docItem = docItem;

    }

    @Override
    public int getCount() {
        return docItem.size();
    }

    @Override
    public Object getItem(int position) {
        return docItem.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View rowView = convertView;
        ViewHolderArticle holder = null;
        if(rowView==null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            rowView = inflater.inflate(R.layout.list_item, parent, false);
            holder = new ViewHolderArticle(rowView);
            rowView.setTag(holder);
        }else{
            holder = (ViewHolderArticle) rowView.getTag();
        }

        ArticleResponseObj.ResponseBean.DocsBean item = (ArticleResponseObj.ResponseBean.DocsBean) getItem(position);

        //If there is an image from api->show, if not, show "no image" png.
        try{
            String thumbnailUrl = item.getMultimedia().get(0).getUrl();
            Picasso.get().load("http://www.nytimes.com/"+thumbnailUrl).fit().into(holder.getThumbnailHolder());

        }catch (Exception e){
            Picasso.get().load(R.drawable.noimages).fit().into(holder.getThumbnailHolder());
        }

        //Full date comes with extra info. trim.
        try{
            String trimDate = item.getPub_date().substring(0,10);
            //.setText((trimDate));
            holder.getDateHolder().setText(trimDate);
        } catch (Exception e){
            holder.getDateHolder().setText("??/??/????");
        }
        holder.getHeadlineHolder().setText(item.getHeadline().getMain());

        Log.i("rowView",rowView.toString());
        return rowView;
    }
}
