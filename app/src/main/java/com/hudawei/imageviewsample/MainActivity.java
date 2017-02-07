package com.hudawei.imageviewsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void srcBack(View view){
        startActivity(new Intent(this,SrcBackActivity.class));
    }
    public void adjustViewBounds(View view){
        startActivity(new Intent(this,AdjustViewBoundsActivity.class));
    }
    public void scaleType(View view){
        startActivity(new Intent(this,ScaleTypeActivity.class));
    }
    public void circleImage(View view){
        startActivity(new Intent(this,CircleImageViewActivity.class));
    }


}
