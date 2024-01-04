package com.techbuddy.snkrlab3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class NewbalanceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newbalance);

        ImageView newbalanceImage = findViewById(R.id.newbalanceImage);
        newbalanceImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        CardView newbalanceCard1 = findViewById(R.id.newbalanceCard1);
        newbalanceCard1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NewbalanceActivity.this, CameraActivity.class);
                startActivity(intent);
            }
        });

        CardView newbalanceCard2 = findViewById(R.id.newbalanceCard2);
        newbalanceCard2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NewbalanceActivity.this, CameraActivity.class);
                startActivity(intent);
            }
        });

    }
}