package com.techbuddy.snkrlab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;

import android.view.View;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView videoView = findViewById(R.id.videoView);
        String uriPath = "android.resource://" + getPackageName() + "/" + R.raw.mainbg;
        videoView.setVideoURI(Uri.parse(uriPath));
        videoView.start();
        videoView.setOnPreparedListener(MediaPlayer::start);
        videoView.setOnCompletionListener(MediaPlayer::start);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(MainActivity.this,MainActivity3.class));
                finish();
            }
        }, 3000);
    }
}