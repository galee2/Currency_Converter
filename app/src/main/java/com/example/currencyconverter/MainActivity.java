package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Double numDollars;
    Double numPounds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toDollars(View view) {
        EditText poundsInput = findViewById(R.id.poundsInput);
        numPounds = Double.parseDouble(poundsInput.getText().toString());
        numDollars = numPounds/0.77;
        String dollars = "£" + numPounds.toString() + " is $" + numDollars.toString();
        goToDisp(dollars);
    }

    public void toPounds(View view) {
        EditText poundsInput = findViewById(R.id.dollarsInput);
        numDollars = Double.parseDouble(poundsInput.getText().toString());
        numPounds = numDollars*0.77;
        String pounds = "$" + numDollars.toString() + " is £" + numPounds.toString();
        goToDisp(pounds);
    }

    public void goToDisp(String amount) {
        Intent intent = new Intent(this, DisplayActivity.class);
        intent.putExtra("converted", amount);
        startActivity(intent);
    }

}
