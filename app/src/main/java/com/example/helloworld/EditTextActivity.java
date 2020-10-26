package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class EditTextActivity extends AppCompatActivity {
    private Button mbtnLogin;
    private TextView texZhuce;
    private TextView texWangJi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);

        mbtnLogin = findViewById(R.id.btn_login);
        mbtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(EditTextActivity.this,"登录成功!",Toast.LENGTH_LONG).show();
            }
        });
        texZhuce = findViewById(R.id.btn_zhu);
        texZhuce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EditTextActivity.this,ZhuCeActivity.class);
                startActivity(intent);
            }
        });
        texWangJi = findViewById(R.id.btn_wang);
        texWangJi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EditTextActivity.this,WangJiActivity.class);
                startActivity(intent);
            }
        });
    }
}