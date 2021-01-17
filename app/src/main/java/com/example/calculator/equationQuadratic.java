package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class equationQuadratic extends AppCompatActivity {
    private Button eTo2E, eq2Calculate;
    private TextView e2f1,e2f2,e2f3,e2r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equation_quadratic);
        e2f1 = (TextView) findViewById(R.id.e2f1);
        e2f2 = (TextView) findViewById(R.id.e2f2);
        e2f3 = (TextView) findViewById(R.id.e2f3);
        e2r = (TextView) findViewById(R.id.e2r);

        eTo2E = (Button) findViewById(R.id.e2ToE);
        eTo2E.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(equationMain.class);
            }
        });

        eq2Calculate = (Button) findViewById(R.id.eq2calculate);
        eq2Calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                equationResult.n = 2;
                equationResult.a = Double.valueOf(testZero(e2f1.getText().toString()));
                equationResult.b = Double.valueOf(testZero(e2f2.getText().toString()));
                equationResult.c = Double.valueOf(testZero(e2f3.getText().toString()));
                equationResult.r = Double.valueOf(testZero(e2r.getText().toString()));

                if(equationResult.a == 0){
                    Toast.makeText(getApplicationContext(), "x^2'constant should be assigned", Toast.LENGTH_LONG).show();
                }
                else {
                    openActivity(equationResult.class);
                }
            }
        });
    }
    private void openActivity(Class c){
        Intent intent = new Intent(equationQuadratic.this, c);
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