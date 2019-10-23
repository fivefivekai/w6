package unsw.infs.jingdianli.recyclerviewproj;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import static unsw.infs.jingdianli.recyclerviewproj.ArticleRecyclerViewAdapter.dataSource;

public class MainActivity extends AppCompatActivity {
    public static final String HEADLINE_KEY = "unsw.infs.jingdianli.headline";
    public static final String AUTHOR_KEY = "unsw.infs.jingdianli.author";
    public static final String CONTENT_KEY = "unsw.infs.jingdianli.content";

    private RecyclerView articleRecyclerView;
    private ArticleRecyclerViewAdapter articleAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        articleRecyclerView = findViewById(R.id.article_recycler_view);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        articleRecyclerView.setLayoutManager(linearLayoutManager);
        articleAdapter = new ArticleRecyclerViewAdapter(this);
        articleRecyclerView.setAdapter(articleAdapter);
    }

    public void onClickView(View view){
        int viewId = view.getId();
        Intent intent = new Intent(this,ArticleContentActivity.class);
        intent.putExtra(HEADLINE_KEY, dataSource.get(viewId).getHeadline());
        intent.putExtra(AUTHOR_KEY, dataSource.get(viewId).getAuthor());
        intent.putExtra(CONTENT_KEY, dataSource.get(viewId).getContent());
        startActivity(intent);
    }

    public void onClickShareButton(View view) {
        int articleId = view.getId();
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, "Here is a cool article: " +
                dataSource.get(articleId).getHeadline());
        startActivity(intent);
    }
}
