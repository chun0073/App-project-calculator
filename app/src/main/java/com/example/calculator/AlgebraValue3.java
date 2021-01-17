package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AlgebraValue3 extends AppCompatActivity {
    private Button toLinearAlgebra;
    private Button toCalculate;
    private final int nColumn = 3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algebra_value3);

        toCalculate = (Button) findViewById(R.id.calculate3);
        toCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlgebraResult.nColumn = 3;
                EditText aV1 =(EditText) findViewById(R.id.a3V1);
                AlgebraResult.value[0][0] = Double.parseDouble(testZero(aV1.getText().toString()));
                EditText bV1 =(EditText) findViewById(R.id.b3V1);
                AlgebraResult.value[0][1] = Double.parseDouble(testZero(bV1.getText().toString()));
                EditText cV1 =(EditText) findViewById(R.id.c3V1);
                AlgebraResult.value[0][2] = Double.parseDouble(testZero(cV1.getText().toString()));

                EditText aV2 =(EditText) findViewById(R.id.a3V2);
                AlgebraResult.value[1][0] = Double.parseDouble(testZero(aV2.getText().toString()));
                EditText bV2 =(EditText) findViewById(R.id.b3V2);
                AlgebraResult.value[1][1] = Double.parseDouble(testZero(bV2.getText().toString()));
                EditText cV2 =(EditText) findViewById(R.id.c3V2);
                AlgebraResult.value[1][2] = Double.parseDouble(testZero(cV2.getText().toString()));

                EditText aV3 =(EditText) findViewById(R.id.a3V3);
                AlgebraResult.value[2][0] = Double.parseDouble(testZero(aV3.getText().toString()));
                EditText bV3 =(EditText) findViewById(R.id.b3V3);
                AlgebraResult.value[2][1] = Double.parseDouble(testZero(bV3.getText().toString()));
                EditText cV3 =(EditText) findViewById(R.id.c3V3);
                AlgebraResult.value[2][2] = Double.parseDouble(testZero(cV3.getText().toString()));

                EditText rV1 = (EditText) findViewById(R.id.r3V1);
                AlgebraResult.result[0][0] = Double.parseDouble(testZero(rV1.getText().toString()));
                EditText rV2 = (EditText) findViewById(R.id.r3V2);
                AlgebraResult.result[1][0] = Double.parseDouble(testZero(rV2.getText().toString()));
                EditText rV3 = (EditText) findViewById(R.id.r3V3);
                AlgebraResult.result[2][0] = Double.parseDouble(testZero(rV3.getText().toString()));

                // Add a method to test values whether are available or not.
                boolean open = true;
                for(int i=0; i<nColumn-1; i++){
                    for(int j=0; j<nColumn-1;j++){
                        if((AlgebraResult.value[i][j]/AlgebraResult.value[i+1][j])==(AlgebraResult.value[i][j+1]/AlgebraResult.value[i+1][j+1])){
                            open = false;
                            Toast.makeText(getApplicationContext(),"No or infinitely many solutions",Toast.LENGTH_LONG).show();
                        }
                    }
                }
                if(AlgebraResult.value[0][0]==0&&AlgebraResult.value[1][0]==0&&AlgebraResult.value[2][0]==0){
                    open = false;
                }

                if(open) {
                    openActivity(AlgebraValue3.this, AlgebraResult.class);
                }
                else{
                    Toast.makeText(getApplicationContext(),"No or infinitely many solutions",Toast.LENGTH_LONG).show();
                }
            }
        });
        toLinearAlgebra = (Button) findViewById(R.id.toLinearAlgebra3);
        toLinearAlgebra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(AlgebraValue3.this,LinearAlgebra.class);
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