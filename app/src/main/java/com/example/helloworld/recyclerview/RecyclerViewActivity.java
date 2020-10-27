package com.example.helloworld.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.helloworld.MainActivity2;
import com.example.helloworld.R;

public class RecyclerViewActivity extends AppCompatActivity {
    private Button mbtnLinear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        mbtnLinear = findViewById(R.id.btn_linear);
        mbtnLinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecyclerViewActivity.this,LinearActivity.class);
                startActivity(intent);
            }
        });
    }
}