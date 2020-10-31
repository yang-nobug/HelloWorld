package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.helloworld.Layout.GridLayoutActivity;
import com.example.helloworld.Layout.TableLayoutActivity;
import com.example.helloworld.gridview.GridViewActivity;
import com.example.helloworld.listview.ListViewActivity;
import com.example.helloworld.recyclerview.RecyclerViewActivity;

public class MainActivity2 extends AppCompatActivity {
    private Button mbtnTextview;
    private Button mbtnButton;
    private Button mbtnEditText;
    private Button mbtnImageView;
    private Button mbtnListView;
    private Button mbtnGridView;
    private Button mbtnRecyclerView;
    private Button mbtnTableLayout;
    private Button mbtnGridLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mbtnTextview = (Button) findViewById(R.id.btn_view);
        mbtnTextview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this,TextViewActivity.class);
                startActivity(intent);
            }
        });


        mbtnButton=(Button) findViewById(R.id.btn_button);
        mbtnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this,ButtonActivity.class);
                startActivity(intent);
            }
        });

        mbtnEditText = findViewById(R.id.btn_edit);
        mbtnEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this,EditTextActivity.class);
                startActivity(intent);
            }
        });

        mbtnImageView = findViewById(R.id.btn_imageview);
        mbtnImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this,ImageViewActivity.class);
                startActivity(intent);
            }
        });

        mbtnListView = findViewById(R.id.btn_listview);
        mbtnListView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, ListViewActivity.class);
                startActivity(intent);
            }
        });
        mbtnGridView = findViewById(R.id.btn_gridview);
        mbtnGridView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, GridViewActivity.class);
                startActivity(intent);
            }
        });
        mbtnRecyclerView = findViewById(R.id.btn_recyclerview);
        mbtnRecyclerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, RecyclerViewActivity.class);
                startActivity(intent);
            }
        });
        mbtnTableLayout = findViewById(R.id.btn_tablelogin);
        mbtnTableLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, TableLayoutActivity.class);
                startActivity(intent);
            }
        });
        mbtnGridLayout = findViewById(R.id.btn_gridlayout);
        mbtnGridLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, GridLayoutActivity.class);
                startActivity(intent);
            }
        });
    }
}