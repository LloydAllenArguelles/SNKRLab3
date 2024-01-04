package com.techbuddy.snkrlab3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class RebookActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rebook);

        ImageView rebookImage = findViewById(R.id.rebookImage);
        rebookImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        CardView rebookCard1 = findViewById(R.id.rebookCard1);
        rebookCard1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RebookActivity.this, CameraActivity.class);
                startActivity(intent);
            }
        });

        CardView rebookCard2 = findViewById(R.id.rebookCard2);
        rebookCard2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RebookActivity.this, CameraActivity.class);
                startActivity(intent);
            }
        });

    }
}
