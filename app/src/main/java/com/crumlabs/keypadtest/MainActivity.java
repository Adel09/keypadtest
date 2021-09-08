package com.crumlabs.keypadtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public String num = "";
    TextView numText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numText = (TextView) findViewById(R.id.numText);
    }

// I only built this app for boredom and testing purposes

    public void one(View view){num += "1"; numText.setText(num);}
    public void two(View view){num += "2"; numText.setText(num);}
    public void three(View view){num += "3"; numText.setText(num);}
    public void four(View view){num += "4"; numText.setText(num);}
    public void five(View view){num += "5"; numText.setText(num);}
    public void six(View view){num += "6"; numText.setText(num);}
    public void seven(View view){num += "7"; numText.setText(num);}
    public void eight(View view){num += "8"; numText.setText(num);}
    public void nine(View view){num += "9"; numText.setText(num);}








}