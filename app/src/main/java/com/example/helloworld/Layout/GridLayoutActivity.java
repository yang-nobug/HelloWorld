package com.example.helloworld.Layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.helloworld.R;

public class GridLayoutActivity extends AppCompatActivity {
    private ImageView ivm1;
    private ImageView ivm2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_layout);
        ivm1 = findViewById(R.id.imv_1);
        Glide.with(this).load("https://dss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=1194131577,2954769920&fm=26&gp=0.jpg").into(ivm1);
        ivm2 = findViewById(R.id.imv_2);
        Glide.with(this).load("https://dss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=1194131577,2954769920&fm=26&gp=0.jpg").into(ivm2);
    }
}