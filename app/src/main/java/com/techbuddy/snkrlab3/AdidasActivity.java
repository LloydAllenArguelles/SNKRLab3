package com.techbuddy.snkrlab3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.net.Uri;
import android.widget.VideoView;
import android.media.MediaPlayer;

public class AdidasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adidas);

        VideoView videoView = findViewById(R.id.videoView);
        String uriPath = "android.resource://" + getPackageName() + "/" + R.raw.adidasbg;
        videoView.setVideoURI(Uri.parse(uriPath));
        videoView.start();
        videoView.setOnPreparedListener(MediaPlayer::start);
        videoView.setOnCompletionListener(MediaPlayer::start);

        ImageView back = findViewById(R.id.back);

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
                Intent intent = new Intent(AdidasActivity.this, NMDActivity.class);
                int intValue = 1; // Replace this with your desired integer value
                intent.putExtra("shoe", intValue);
                startActivity(intent);
            }
        });

        CardView adidasCard2 = findViewById(R.id.adidasCard2);
        adidasCard2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdidasActivity.this, AlphaActivity.class);
                int intValue = 1; // Replace this with your desired integer value
                intent.putExtra("shoe", intValue);
                startActivity(intent);
            }
        });

        CardView adidasCard3 = findViewById(R.id.adidasCard3);
        adidasCard3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdidasActivity.this, CloudActivity.class);
                int intValue = 1; // Replace this with your desired integer value
                intent.putExtra("shoe", intValue);
                startActivity(intent);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdidasActivity.this, MainActivity2.class);
                int intValue = 1; // Replace this with your desired integer value
                intent.putExtra("shoe", intValue);
                startActivity(intent);
            }
        });

        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                // Restart the video when it completes
                videoView.start(); // Loop the video
            }
        });

    }
}
