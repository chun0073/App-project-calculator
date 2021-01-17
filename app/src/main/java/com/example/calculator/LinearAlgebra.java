package com.example.calculator;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LinearAlgebra extends AppCompatActivity {
    private TextView title;
    private Button nValue2;
    private Button nValue3;
    private Button nValue4;
    private Button nValue5;
    private Button nValue6;
    private Button nValue7;
    private Button toMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_algebra);

        title = (TextView) findViewById(R.id.title21);

        nValue2 = (Button) findViewById(R.id.button1);
        nValue2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(AlgebraValue2.class);
            }
        });
        nValue3 = (Button) findViewById(R.id.button2);
        nValue3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(AlgebraValue3.class);
            }
        });
        nValue4 = (Button) findViewById(R.id.button3);
        nValue4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(AlgebraValue4.class);
            }
        });
        nValue5 = (Button) findViewById(R.id.button4);
        nValue5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(AlgebraValue5.class);
            }
        });
        nValue6 = (Button) findViewById(R.id.button5);
        nValue6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(AlgebraValue6.class);
            }
        });
        toMain = (Button) findViewById(R.id.tomain);
        toMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(MainActivity2.class);
            }
        });
    }
    private void openActivity(Class c){
        Intent intent = new Intent(LinearAlgebra.this, c);
        startActivity(intent);
    }
}