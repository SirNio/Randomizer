package com.example.randomizer;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.support.v7.app.AppCompatActivity;

import java.util.Random;

public class MainActivityJava extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // access to our views
        Button rollButton = findViewById(R.id.rollButton);
        // action
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView resultsTextView = findViewById(R.id.resultsTextView);
                SeekBar seekBar = findViewById(R.id.seekBar);
                int rand = new Random().nextInt(seekBar.getProgress() + 2) + 1;
                resultsTextView.setText(String.valueOf(rand));
            }
        });
    }
}
