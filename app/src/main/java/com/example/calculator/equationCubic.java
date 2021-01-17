package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class equationCubic extends AppCompatActivity {
    private Button e3ToE, eq3Calculate;
    private TextView e3f1,e3f2,e3f3,e3f4,e3r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equation_cubic);
        e3f1 = (TextView) findViewById(R.id.e3f1);
        e3f2 = (TextView) findViewById(R.id.e3f2);
        e3f3 = (TextView) findViewById(R.id.e3f3);
        e3f4 = (TextView) findViewById(R.id.e3f4);
        e3r = (TextView) findViewById(R.id.e3r);

        eq3Calculate = (Button) findViewById(R.id.eq3Calculate);
        eq3Calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                equationResult.n = 3;
                equationResult.a = Double.valueOf(testZero(e3f1.getText().toString()));
                equationResult.b = Double.valueOf(testZero(e3f2.getText().toString()));
                equationResult.c = Double.valueOf(testZero(e3f3.getText().toString()));
                equationResult.d = Double.valueOf(testZero(e3f4.getText().toString()));
                equationResult.r = Double.valueOf(testZero(e3r.getText().toString()));

                if(equationResult.a == 0){
                    Toast.makeText(getApplicationContext(), "x^3'constant should be assigned", Toast.LENGTH_LONG).show();
                }
                else {
                    openActivity(equationResult.class);
                }
            }
        });

        e3ToE = (Button) findViewById(R.id.e3ToE);
        e3ToE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(equationMain.class);
            }
        });
    }
    private void openActivity(Class c){
        Intent intent = new Intent(equationCubic.this, c);
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