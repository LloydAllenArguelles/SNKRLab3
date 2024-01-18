package com.techbuddy.snkrlab3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.net.Uri;
import android.widget.VideoView;
import android.media.MediaPlayer;

public class NMDActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nmd);

        VideoView videoView = findViewById(R.id.videoView);
        String uriPath = "android.resource://" + getPackageName() + "/" + R.raw.shoebg;
        videoView.setVideoURI(Uri.parse(uriPath));
        videoView.start();
        videoView.setOnPreparedListener(MediaPlayer::start);
        videoView.setOnCompletionListener(MediaPlayer::start);

        Button tryButton = findViewById(R.id.tryButton);
        ImageView arrowLeft = findViewById(R.id.arrowLeft);
        ImageView arrowRight = findViewById(R.id.arrowRight);
        ImageView back = findViewById(R.id.back);

        tryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NMDActivity.this, CameraActivity.class);
                int intValue = 1; // Replace this with your desired integer value
                intent.putExtra("shoe", intValue);
                startActivity(intent);
            }
        });

        arrowLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NMDActivity.this, CloudActivity.class);
                startActivity(intent);
            }
        });

        arrowRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NMDActivity.this, AlphaActivity.class);
                startActivity(intent);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NMDActivity.this, AdidasActivity.class);
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