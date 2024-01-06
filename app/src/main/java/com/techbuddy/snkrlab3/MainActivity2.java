package com.techbuddy.snkrlab3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class MainActivity2 extends AppCompatActivity {
    CardView nikeCard;
    CardView adidasCard;
    CardView converseCard;
    CardView newbalanceCard;
    CardView sketchersCard;
    CardView rebookCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        nikeCard = findViewById(R.id.nikeCard);
        nikeCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this,  CameraActivity.class);
                int intValue = 0; // Replace this with your desired integer value
                intent.putExtra("shoe", intValue);
                startActivity(intent);
            }
        });

        adidasCard = findViewById(R.id.adidasCard);
        adidasCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this,  CameraActivity.class);
                int intValue = 1; // Replace this with your desired integer value
                intent.putExtra("shoe", intValue);
                startActivity(intent);
            }
        });

        converseCard = findViewById(R.id.converseCard);
        converseCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this,  CameraActivity.class);
                int intValue = 2; // Replace this with your desired integer value
                intent.putExtra("shoe", intValue);
                startActivity(intent);
            }
        });
    }
}
