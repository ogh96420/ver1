package com.example.ver1.ui.Admin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.ver1.R;

public class ConfigActivity extends AppCompatActivity {

    private Button btn_openbook;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config);

        btn_openbook = findViewById(R.id.btn_openbook);

        btn_openbook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ConfigActivity.this, Openbook.class);
                startActivity(intent);
            }
        });
    }
}
