package com.spaga.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertToDollars(View view) {
        double rate = 7.8;
        EditText myDollars = findViewById(R.id.myDollars);
        Double convertedDollars = Double.parseDouble(myDollars.getText().toString()) * rate;
        Toast.makeText(this, "$" + String.format("%.2f", convertedDollars.toString()), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
