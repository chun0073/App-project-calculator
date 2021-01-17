package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AlgebraValue2 extends AppCompatActivity {
    private Button toLinearAlgebra;
    private Button toCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algebra_value2);

        toCalculate = (Button) findViewById(R.id.calculate2);
        toCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlgebraResult.nColumn = 2;
                EditText aV1 =(EditText) findViewById(R.id.a2V1);
                AlgebraResult.value[0][0] = Double.parseDouble(testZero(aV1.getText().toString()));
                EditText bV1 =(EditText) findViewById(R.id.b2V1);
                AlgebraResult.value[0][1] = Double.parseDouble(testZero(bV1.getText().toString()));
                EditText aV2 =(EditText) findViewById(R.id.a2V2);
                AlgebraResult.value[1][0] = Double.parseDouble(testZero(aV2.getText().toString()));
                EditText bV2 =(EditText) findViewById(R.id.b2V2);
                AlgebraResult.value[1][1] = Double.parseDouble(testZero(bV2.getText().toString()));

                EditText rV1 = (EditText) findViewById(R.id.r2V1);
                AlgebraResult.result[0][0] = Double.parseDouble(testZero(rV1.getText().toString()));
                EditText rV2 = (EditText) findViewById(R.id.r2V2);
                AlgebraResult.result[1][0] = Double.parseDouble(testZero(rV2.getText().toString()));

                if(AlgebraResult.value[0][0]==0&&AlgebraResult.value[1][0]==0){
                    Toast.makeText(getApplicationContext(), "No or infinitely many solutions", Toast.LENGTH_LONG).show();
                }
                else {
                    if (AlgebraResult.value[0][0] / AlgebraResult.value[1][0] ==
                            AlgebraResult.value[0][1] / AlgebraResult.value[1][1]) {
                        Toast.makeText(getApplicationContext(), "No or infinitely many solutions", Toast.LENGTH_LONG).show();
                    } else {
                        openActivity(AlgebraValue2.this, AlgebraResult.class);
                    }
                }
            }
        });
        toLinearAlgebra = (Button) findViewById(R.id.toLinearAlgebra2);
        toLinearAlgebra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(AlgebraValue2.this,LinearAlgebra.class);
            }
        });
    }

    private String testZero(String container){
        if(container.length()==0){
            return "0";
        }
        else{
            return container;
        }
    }

    private void openActivity(Context context, Class c){
        Intent intent = new Intent(context, c);
        startActivity(intent);
    }
}