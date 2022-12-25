package com.example.dz13month;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.button.MaterialButton;


public class MainActivity extends AppCompatActivity {
    EditText et_search;
    MaterialButton btn_open;

    String text1 = "WhatsApp";
    String text2 = "YouTube";
    String text3 = "Chrome";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_search = findViewById(R.id.et_search);
        btn_open = findViewById(R.id.btn_open);

        btn_open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = et_search.getText().toString().trim();
                if (text.isEmpty()) {
                    et_search.setError("Заполните поля");

                }else {
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("text",text);
                    startActivity(intent);
                }
            }
        });
    }
}