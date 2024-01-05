package com.techbuddy.snkrlab3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class NikeActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_nike);

            ImageView nikeImage = findViewById(R.id.nikeImage);
            nikeImage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                }
            });

            CardView nikeCard1 = findViewById(R.id.nikeCard1);
            nikeCard1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(NikeActivity.this, CameraActivity.class);
                    int intValue = 0; // Replace this with your desired integer value
                    intent.putExtra("shoe", intValue);
                    startActivity(intent);
                }
            });

            CardView nikeCard2 = findViewById(R.id.nikeCard2);
            nikeCard2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(NikeActivity.this, CameraActivity.class);
                    int intValue = 0; // Replace this with your desired integer value
                    intent.putExtra("shoe", intValue);
                    startActivity(intent);
                }
            });

        }
    }
