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

public class NikeActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_nike);

            VideoView videoView = findViewById(R.id.videoView);
            String uriPath = "android.resource://" + getPackageName() + "/" + R.raw.nikebg;
            videoView.setVideoURI(Uri.parse(uriPath));
            videoView.start();
            videoView.setOnPreparedListener(MediaPlayer::start);
            videoView.setOnCompletionListener(MediaPlayer::start);

            ImageView back = findViewById(R.id.back);
          
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
                    Intent intent = new Intent(NikeActivity.this, ForceActivity.class);
                    startActivity(intent);
                }
            });

            CardView nikeCard2 = findViewById(R.id.nikeCard2);
            nikeCard2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(NikeActivity.this, JordanActivity.class);
                    startActivity(intent);
                }
            });

            CardView nikeCard3 = findViewById(R.id.nikeCard3);
            nikeCard3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(NikeActivity.this, MaxActivity.class);
                    startActivity(intent);
                }
            });

            back.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(NikeActivity.this, MainActivity2.class);
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
