package com.example.helloworld.listview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.example.helloworld.R;

public class ListViewActivity extends Activity {
    private ListView mlv1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        mlv1 = findViewById(R.id.lv_1);
        mlv1.setAdapter(new MylistAdapter(ListViewActivity.this));
        mlv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListViewActivity.this,"点击pos:"+position,Toast.LENGTH_LONG).show();
            }
        });
        mlv1.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListViewActivity.this,"长按pos:"+position,Toast.LENGTH_LONG).show();
                return true;
            }
        });
    }
}
