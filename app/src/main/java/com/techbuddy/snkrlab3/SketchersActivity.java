package com.techbuddy.snkrlab3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class SketchersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sketchers);

        ImageView sketchersImage = findViewById(R.id.sketchersImage);
        sketchersImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        CardView sketchersCard1 = findViewById(R.id.sketchersCard1);
        sketchersCard1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SketchersActivity.this, CameraActivity.class);
                startActivity(intent);
            }
        });

        CardView sketchersCard2 = findViewById(R.id.sketchersCard2);
        sketchersCard2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SketchersActivity.this, CameraActivity.class);
                startActivity(intent);
            }
        });

    }
}
