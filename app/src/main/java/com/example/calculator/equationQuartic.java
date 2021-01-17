package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class equationQuartic extends AppCompatActivity {
    private Button e4ToE,eq4Calculate;
    private TextView e4f1,e4f2,e4f3,e4f4,e4f5,e4r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equation_quartic);
        e4f1 = (TextView) findViewById(R.id.e4f1);
        e4f2 = (TextView) findViewById(R.id.e4f2);
        e4f3 = (TextView) findViewById(R.id.e4f3);
        e4f4 = (TextView) findViewById(R.id.e4f4);
        e4f5 = (TextView) findViewById(R.id.e4f5);
        e4r = (TextView) findViewById(R.id.e4r);

        eq4Calculate = (Button) findViewById(R.id.eq4Calculate);
        eq4Calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                equationResult.n = 4;
                equationResult.a = Double.valueOf(testZero(e4f1.getText().toString()));
                equationResult.b = Double.valueOf(testZero(e4f2.getText().toString()));
                equationResult.c = Double.valueOf(testZero(e4f3.getText().toString()));
                equationResult.d = Double.valueOf(testZero(e4f4.getText().toString()));
                equationResult.e = Double.valueOf(testZero(e4f5.getText().toString()));
                equationResult.r = Double.valueOf(testZero(e4r.getText().toString()));

                if(equationResult.a == 0){
                    Toast.makeText(getApplicationContext(), "x^4'constant should be assigned", Toast.LENGTH_LONG).show();
                }
                else {
                    openActivity(equationResult.class);
                }
            }
        });

        e4ToE = (Button) findViewById(R.id.e4ToE);
        e4ToE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(equationMain.class);
            }
        });

    }
    private void openActivity(Class c){
        Intent intent = new Intent(equationQuartic.this, c);
        startActivity(intent);
    }
    private String testZero(String container){
        if(container.length()==0){
            return "0";
        }
        else{
            return container;
        }
    }
}