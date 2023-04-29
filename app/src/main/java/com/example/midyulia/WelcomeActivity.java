package com.example.midyulia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {

    TextView tvWelcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        tvWelcome = findViewById(R.id.tvWelcome);
        tvWelcome.setText("Welcome " + getIntent().getStringExtra("email"));
    }
}