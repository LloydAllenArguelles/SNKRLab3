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
                Intent intent = new Intent(MainActivity2.this, NikeActivity.class);
                startActivity(intent);
            }
        });

        adidasCard = findViewById(R.id.adidasCard);
        adidasCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, AdidasActivity.class);
                startActivity(intent);
            }
        });

        converseCard = findViewById(R.id.converseCard);
        converseCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, ConverseActivity.class);
                startActivity(intent);
            }
        });

        sketchersCard = findViewById(R.id.sketchersCard);
        sketchersCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, SketchersActivity.class);
                startActivity(intent);
            }
        });

        newbalanceCard = findViewById(R.id.newbalanceCard);
        newbalanceCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, NewbalanceActivity.class);
                startActivity(intent);
            }
        });

        rebookCard = findViewById(R.id.rebookCard);
        rebookCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, RebookActivity.class);
                startActivity(intent);
            }
        });

    }
}
