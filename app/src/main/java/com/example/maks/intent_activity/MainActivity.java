package com.example.maks.intent_activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button showb;
    EditText Num1;
    EditText Num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonListener();
    }

    public void buttonListener() {
        showb = findViewById(R.id.show);
        Num1 = findViewById(R.id.Num1);
        Num2 = findViewById(R.id.Num2);

        showb.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.maks.MainActivity");
                        intent.putExtra("num1", Num1.getText().toString());
                        intent.putExtra("num2", Num2.getText().toString());
                        startActivity(intent);
                    }
                }
        );


    }
}


