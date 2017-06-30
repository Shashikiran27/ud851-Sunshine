package com.example.android.button;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button clicker = (Button) findViewById(R.id.clicker);
        clicker.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        Log.d("testclick","clca");
    }
}

