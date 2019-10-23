package unsw.infs.jingdianli.recyclerviewproj;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

class ArticleRecyclerViewAdapter extends RecyclerView.Adapter<ArticleRecyclerViewAdapter.ArticleViewHolder> {

    public static ArrayList<Article> dataSource = FakeDatabase.getAllArticles();
    private Context context;


    public ArticleRecyclerViewAdapter(Context context){
        this.context = context;
    }

    /**
     * Create new views
     * @param viewGroup
     * @param position
     * @return
     */
    @NonNull
    @Override
    public ArticleViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int position) {
        return new ArticleViewHolder(LayoutInflater.from(context).inflate(R.layout.chunk, viewGroup, false));
    }

    /**
     * Replace the content of the view
     * @param articleViewHolder
     * @param position
     */
    @Override
    public void onBindViewHolder(@NonNull ArticleViewHolder articleViewHolder, int position) {
        articleViewHolder.articleImage.setImageResource(R.drawable.article_6);
        articleViewHolder.articleImage.setId(position);
        articleViewHolder.articleHeadline.setText(dataSource.get(position).getHeadline());
        articleViewHolder.articleHeadline.setId(position);
        articleViewHolder.articleSummary.setText(dataSource.get(position).getSummary());
        articleViewHolder.articleSummary.setId(position);
        articleViewHolder.bookmarkButton.setId(position);
        articleViewHolder.shareButton.setId(position);
    }

    /**
     *Return the number of articles
     * @return
     */
    @Override
    public int getItemCount() {
        return dataSource.size();
    }

    static class ArticleViewHolder extends RecyclerView.ViewHolder{

        ImageView articleImage;
        TextView articleHeadline;
        TextView articleSummary;
        Button bookmarkButton;
        Button shareButton;


        public ArticleViewHolder(@NonNull View itemView) {
            super(itemView);

            articleImage = itemView.findViewById(R.id.article_image);
            articleHeadline = itemView.findViewById(R.id.article_headline);
            articleSummary = itemView.findViewById(R.id.article_summary);
            bookmarkButton = itemView.findViewById(R.id.bookmark_button);
            shareButton = itemView.findViewById(R.id.share_button);
        }
    }
}
