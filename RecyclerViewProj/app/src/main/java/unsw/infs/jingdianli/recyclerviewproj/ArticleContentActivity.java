package unsw.infs.jingdianli.recyclerviewproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ArticleContentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article_content);

        Intent intent= getIntent();

        TextView articleHeadline = findViewById(R.id.article_headline);
        articleHeadline.setText(intent.getStringExtra(MainActivity.HEADLINE_KEY));

        TextView articleAuthor = findViewById(R.id.article_author);
        articleAuthor.setText(intent.getStringExtra(MainActivity.AUTHOR_KEY));

        TextView articleContent = findViewById(R.id.article_content);
        articleContent.setText(intent.getStringExtra(MainActivity.CONTENT_KEY));
    }
}
