package com.example.maks.intent_activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView tvView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvView = (TextView) findViewById(R.id.tvView);
        Intent intent = getIntent();
        String num1 = intent.getStringExtra("num1");
        String num2 = intent.getStringExtra("num2");
        tvView.setText("Password is: " + num1 + ", Login is:" + num2);
    }


}
