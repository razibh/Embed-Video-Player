package com.razib.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.LocaleList;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout lay1 ,lay2, lay3, lay4, lay5, lay6 ,lay7, lay8, lay9, lay10, lay11, lay12,lay13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lay1 = findViewById(R.id.lay1);
        lay2 = findViewById(R.id.lay2);
        lay3 = findViewById(R.id.lay3);
        lay4 = findViewById(R.id.lay4);
        lay5 = findViewById(R.id.lay5);
        lay6 = findViewById(R.id.lay6);
        lay7 = findViewById(R.id.lay7);
        lay8 = findViewById(R.id.lay8);
        lay9 = findViewById(R.id.lay9);
        lay10 = findViewById(R.id.lay10);
        lay11 = findViewById(R.id.lay11);
        lay12 = findViewById(R.id.lay12);
        lay13 = findViewById(R.id.lay13);


            lay1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                Video_Player.video_url= "https://www.youtube.com/embed/ILoPMd6aTQ0";
                    Intent intent = new Intent(MainActivity.this,Video_Player.class);
                    startActivity(intent);
                }
            });

        lay2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Video_Player.video_url= "https://www.youtube.com/embed/J_u8XPQiHFk";
                Intent intent = new Intent(MainActivity.this,Video_Player.class);
                startActivity(intent);
            }
        });

        lay3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Video_Player.video_url= "https://www.youtube.com/embed/TtGgnY94VWo";
                Intent intent = new Intent(MainActivity.this,Video_Player.class);
                startActivity(intent);
            }
        });

        lay4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Video_Player.video_url= "https://www.youtube.com/embed/AkjCnBzSdRM";
                Intent intent = new Intent(MainActivity.this,Video_Player.class);
                startActivity(intent);
            }
        });

        lay5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Video_Player.video_url= "https://www.youtube.com/embed/lb10pG9u1KI";
                Intent intent = new Intent(MainActivity.this,Video_Player.class);
                startActivity(intent);
            }
        });

        lay6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Video_Player.video_url= "https://www.youtube.com/embed/H2xY5VNvSzE";
                Intent intent = new Intent(MainActivity.this,Video_Player.class);
                startActivity(intent);
            }
        });

        lay7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Video_Player.video_url= "https://www.youtube.com/embed/WkJF3TdcK8Y";
                Intent intent = new Intent(MainActivity.this,Video_Player.class);
                startActivity(intent);
            }
        });

        lay8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Video_Player.video_url= "https://www.youtube.com/embed/IIt2kk3GaQw";
                Intent intent = new Intent(MainActivity.this,Video_Player.class);
                startActivity(intent);
            }
        });
        lay9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Video_Player.video_url= "https://www.youtube.com/embed/hrOj7CZt3to";
                Intent intent = new Intent(MainActivity.this,Video_Player.class);
                startActivity(intent);
            }
        });

        lay10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Video_Player.video_url= "https://www.youtube.com/embed/iv39CMHGMWE";
                Intent intent = new Intent(MainActivity.this,Video_Player.class);
                startActivity(intent);
            }
        });

        lay11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Video_Player.video_url= "https://www.youtube.com/embed/SEP9QQnjIVc";
                Intent intent = new Intent(MainActivity.this,Video_Player.class);
                startActivity(intent);
            }
        });

        lay12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Video_Player.video_url= "https://www.youtube.com/embed/iiMwtwfYn2Agit ";
                Intent intent = new Intent(MainActivity.this,Video_Player.class);
                startActivity(intent);
            }
        });

        lay13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Video_Player.video_url= "https://www.youtube.com/embed/v-Tl_xKK-O4";
                Intent intent = new Intent(MainActivity.this,Video_Player.class);
                startActivity(intent);
            }
        });

    }
}