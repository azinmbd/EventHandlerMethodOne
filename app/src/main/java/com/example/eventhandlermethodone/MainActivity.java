package com.example.eventhandlermethodone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ConstraintLayout constraintLayout;
    private String TAG = MainActivity.class.getCanonicalName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        constraintLayout = findViewById(R.id.ConstraintLayout);
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.button1) {
            constraintLayout.setBackgroundColor(Color.CYAN);
            Log.e(TAG, "color change to Cyan!");

        } else if (view.getId() == R.id.button2) {
            constraintLayout.setBackgroundColor(Color.YELLOW);
            Log.e(TAG, "color change to Yellow!");
        }
    }
}