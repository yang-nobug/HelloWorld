package com.example.helloworld.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.helloworld.R;

public class LinearActivity extends AppCompatActivity {

    private RecyclerView mrvMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear);
        mrvMain = findViewById(R.id.rv_main);
        mrvMain.setLayoutManager(new LinearLayoutManager(LinearActivity.this));

    }
}