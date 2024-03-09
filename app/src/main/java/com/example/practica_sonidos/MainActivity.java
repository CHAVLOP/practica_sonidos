package com.example.practica_sonidos;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mp;
    int posicion = 0;
    ImageView king,miss,loba,avici,mundial,thelast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        king       = findViewById(R.id.king);
        miss        = findViewById(R.id.miss);
        loba        = findViewById(R.id.loba);
        avici       = findViewById(R.id.avici);
        mundial        = findViewById(R.id.mundial);
        thelast         = findViewById(R.id.thelast);

        king.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                music("king");
            }
        });
        miss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                music("miss");
            }
        });
        loba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                music("loba");
            }
        });
        avici.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                music("avici");
            }
        });
        mundial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                music("mundial");
            }
        });
        thelast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                music("thelast");
            }
        });
    }

    public void music(String music){
        if (music == "king") {

            if (mp == null){
                mp = MediaPlayer.create(this, R.raw.kingdom);
                mp.start();
            }else if (mp.isPlaying() == true && mp != null){
                mp.stop();
                mp.reset();
                mp.release();
                mp = null;
            }

        }

        if (music == "miss") {
            if (mp == null){
                mp = MediaPlayer.create(this, R.raw.oliver);
                mp.start();
            }else if (mp.isPlaying() == true && mp != null){
                mp.stop();
                mp.reset();
                mp.release();
                mp = null;
            }
        }

        if (music == "loba") {
            if (mp == null){
                mp = MediaPlayer.create(this, R.raw.shakira);
                mp.start();
            }else if (mp.isPlaying() == true && mp != null){
                mp.stop();
                mp.reset();
                mp.release();
                mp = null;
            }
        }

        if (music == "avici") {
            if (mp == null){
                mp = MediaPlayer.create(this, R.raw.avicii);
                mp.start();
            }else if (mp.isPlaying() == true && mp != null){
                mp.stop();
                mp.reset();
                mp.release();
                mp = null;
            }
        }

        if (music == "mundial") {
            if (mp == null){
                mp = MediaPlayer.create(this, R.raw.quevedo);
                mp.start();
            }else if (mp.isPlaying() == true && mp != null){
                mp.stop();
                mp.reset();
                mp.release();
                mp = null;
            }
        }

        if (music == "thelast") {
            if (mp == null){
                mp = MediaPlayer.create(this, R.raw.the_last);
                mp.start();
            }else if (mp.isPlaying() == true && mp != null){
                mp.stop();
                mp.reset();
                mp.release();
                mp = null;
            }
        }

    }

    @Override
    protected void onPause() {
        super.onPause();
        posicion = mp.getCurrentPosition();
        mp.pause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        if(mp != null && mp.isPlaying() == false){
            mp.seekTo(posicion);
            mp.start();
        }
    }}