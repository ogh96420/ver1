package com.example.ver1.ui.Admin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ver1.R;
import com.example.ver1.ui.login.LoginActivity;

public class AdminActivity extends AppCompatActivity {

    private Button btn_create, btn_config,btn_update,btn_question;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        btn_create = findViewById(R.id.btn_create);
        btn_config = findViewById(R.id.btn_config);
        btn_update = findViewById(R.id.btn_update);
        btn_question = findViewById(R.id.btn_question);

        btn_create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        btn_config.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminActivity.this, ConfigActivity.class);
                startActivity(intent);
            }
        });
        btn_update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminActivity.this, UpdateActivity.class);
                startActivity(intent);
            }
        });
        btn_question.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminActivity.this, QuestionActivity.class);
                startActivity(intent);
            }
        });
    }

}
