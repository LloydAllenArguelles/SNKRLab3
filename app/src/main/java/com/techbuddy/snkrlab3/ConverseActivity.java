package com.techbuddy.snkrlab3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class ConverseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converse);

        ImageView converseImage = findViewById(R.id.converseImage);
        converseImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        CardView converseCard1 = findViewById(R.id.converseCard1);
        converseCard1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ConverseActivity.this, CameraActivity.class);
                startActivity(intent);
            }
        });

        CardView converseCard2 = findViewById(R.id.converseCard2);
        converseCard2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ConverseActivity.this, CameraActivity.class);
                startActivity(intent);
            }
        });

    }
}