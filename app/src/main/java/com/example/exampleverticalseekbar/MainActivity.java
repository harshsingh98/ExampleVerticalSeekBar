package com.example.exampleverticalseekbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RelativeLayout relFive;
    RelativeLayout relFour;
    RelativeLayout relThree;
    RelativeLayout relTwo;
    RelativeLayout relOne;
    ImageView imgFive;
    ImageView imgFour;
    ImageView imgThree;
    ImageView imgTwo;
    ImageView imgOne;
    /*SeekBar seekBar;*/
    ProgressBar progressBar;
    Button btnClick;
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        relFive = findViewById(R.id.relFive);
        relFour = findViewById(R.id.relFour);
        relThree = findViewById(R.id.relThree);
        relTwo = findViewById(R.id.relTwo);
        relOne = findViewById(R.id.relOne);
        imgFive = findViewById(R.id.imgFive);
        imgFour = findViewById(R.id.imgFour);
        imgThree = findViewById(R.id.imgThree);
        imgTwo = findViewById(R.id.imgTwo);
        imgOne = findViewById(R.id.imgOne);

        progressBar = findViewById(R.id.progressBar);
        progressBar.setProgress(25);
        imgOne.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.colorPrimaryBlue));
        imgTwo.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.colorPrimaryBlue));
        btnClick = findViewById(R.id.btnClick);
//        progressBar.setProgress(20);

        relOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               /* i = i + 25;
                progressBar.setProgress(i);*/
            }
        });

        relTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /*i = i + 25;
                progressBar.setProgress(25);*/
            }
        });

        relThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                i = i + 25;
                progressBar.setProgress(50);
                imgThree.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.colorPrimaryBlue));
            }
        });

        relFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                i = i + 25;
                progressBar.setProgress(75);
                imgFour.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.colorPrimaryBlue));
            }
        });

        relFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                i = i + 25;
                progressBar.setProgress(100);
                imgFive.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.colorPrimaryBlue));
            }
        });

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /*i = i + 25;
                progressBar.setProgress(i);*/
            }
        });

       /* seekBar = findViewById(R.id.seekBar);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            int progressChangedValue = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
                progressChangedValue = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this, "Seekbar Progress Is: " + progressChangedValue, Toast.LENGTH_SHORT).show();

            }
        });*/
    }
}
