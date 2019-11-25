package com.example.exampleverticalseekbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatSeekBar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Toast;

public class VerticalSeekbarActivity extends AppCompatActivity {

    CustomSeekBar seekBar;
    Button btnClick;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vertical_seekbar);
        btnClick = findViewById(R.id.btnClick);
        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                seekBar.setProgress(1);
            }
        });
        seekBar = findViewById(R.id.seekBar);

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
                //Toast.makeText(VerticalSeekbarActivity.this, "Seekbar Progress Is: " + progressChangedValue, Toast.LENGTH_SHORT).show();
                if (seekBar.getProgress() == 1){
                    Toast.makeText(VerticalSeekbarActivity.this, "Bham Bham", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
