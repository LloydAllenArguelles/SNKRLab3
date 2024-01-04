package com.techbuddy.snkrlab3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class AdidasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adidas);

        ImageView adidasImage = findViewById(R.id.adidasImage);
        adidasImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        CardView adidasCard1 = findViewById(R.id.adidasCard1);
        adidasCard1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdidasActivity.this, CameraActivity.class);
                int intValue = 0; // Replace this with your desired integer value
                intent.putExtra("shoe", intValue);
                startActivity(intent);
            }
        });

        CardView adidasCard2 = findViewById(R.id.adidasCard2);
        adidasCard2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdidasActivity.this, CameraActivity.class);
                int intValue = 1; // Replace this with your desired integer value
                intent.putExtra("shoe", intValue);
                startActivity(intent);
            }
        });

    }
}
