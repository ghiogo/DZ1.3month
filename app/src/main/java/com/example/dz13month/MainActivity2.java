package com.example.dz13month;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity2 extends AppCompatActivity {

    ImageView im_photo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        im_photo = findViewById(R.id.im_photo);

        Bundle argument = getIntent().getExtras();
        String text = argument.getString("text");
        if (argument != null) {

            Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
        }switch (text){
            case "WhatsApp":
                im_photo.setImageResource(R.drawable.img);
                break;
            case "Chrome":
                im_photo.setImageResource(R.drawable.img_1);
                break;
            case "YouTube":
                im_photo.setImageResource(R.drawable.img_2);
                break;
        }
    }
}