package com.hudawei.imageviewsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

/**
 * Created by hudawei on 2017/2/7.
 *
 */

public class SrcBackActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_src_back);
        setImageView();
    }

    private void setImageView() {
        ImageView image_back=(ImageView)findViewById(R.id.image_back);
        ImageView image_src=(ImageView)findViewById(R.id.image_src);

        image_back.setBackgroundResource(R.mipmap.ic_launcher);
        image_src.setImageResource(R.mipmap.ic_launcher);
    }
}
