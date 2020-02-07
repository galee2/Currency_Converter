package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {
    TextView disp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        disp = findViewById(R.id.dispText);
        Intent intent = getIntent();
        String str = "Conversion: " + intent.getStringExtra("converted");
        disp.setText(str);
    }
}
