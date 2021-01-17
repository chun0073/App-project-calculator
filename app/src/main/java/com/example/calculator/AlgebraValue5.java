package com.example.calculator;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AlgebraValue5 extends AppCompatActivity {
    private Button toLinearAlgebra;
    private Button toCalculate;
    private final int nColumn = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algebra_value5);

        AlertDialog alert = new AlertDialog.Builder(this).setTitle("Alert")
                .setMessage("Matrix that has no solution or\ninfinitely many solutions will not be accepted").setPositiveButton(android.R.string.yes, null)
                .setIcon(android.R.drawable.ic_dialog_alert).show();

        toCalculate = (Button) findViewById(R.id.calculate5);
        toCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlgebraResult.nColumn = 5;
                EditText aV1 =(EditText) findViewById(R.id.a5V1);
                AlgebraResult.value[0][0] = Double.parseDouble(testZero(aV1.getText().toString()));
                EditText bV1 =(EditText) findViewById(R.id.b5V1);
                AlgebraResult.value[0][1] = Double.parseDouble(testZero(bV1.getText().toString()));
                EditText cV1 =(EditText) findViewById(R.id.c5V1);
                AlgebraResult.value[0][2] = Double.parseDouble(testZero(cV1.getText().toString()));
                EditText dV1 =(EditText) findViewById(R.id.d5V1);
                AlgebraResult.value[0][3] = Double.parseDouble(testZero(dV1.getText().toString()));
                EditText eV1 =(EditText) findViewById(R.id.e5V1);
                AlgebraResult.value[0][4] = Double.parseDouble(testZero(eV1.getText().toString()));

                EditText aV2 =(EditText) findViewById(R.id.a5V2);
                AlgebraResult.value[1][0] = Double.parseDouble(testZero(aV2.getText().toString()));
                EditText bV2 =(EditText) findViewById(R.id.b5V2);
                AlgebraResult.value[1][1] = Double.parseDouble(testZero(bV2.getText().toString()));
                EditText cV2 =(EditText) findViewById(R.id.c5V2);
                AlgebraResult.value[1][2] = Double.parseDouble(testZero(cV2.getText().toString()));
                EditText dV2 =(EditText) findViewById(R.id.d5V2);
                AlgebraResult.value[1][3] = Double.parseDouble(testZero(dV2.getText().toString()));
                EditText eV2 =(EditText) findViewById(R.id.e5V2);
                AlgebraResult.value[1][4] = Double.parseDouble(testZero(eV2.getText().toString()));

                EditText aV3 =(EditText) findViewById(R.id.a5V3);
                AlgebraResult.value[2][0] = Double.parseDouble(testZero(aV3.getText().toString()));
                EditText bV3 =(EditText) findViewById(R.id.b5V3);
                AlgebraResult.value[2][1] = Double.parseDouble(testZero(bV3.getText().toString()));
                EditText cV3 =(EditText) findViewById(R.id.c5V3);
                AlgebraResult.value[2][2] = Double.parseDouble(testZero(cV3.getText().toString()));
                EditText dV3 =(EditText) findViewById(R.id.d5V3);
                AlgebraResult.value[2][3] = Double.parseDouble(testZero(dV3.getText().toString()));
                EditText eV3 =(EditText) findViewById(R.id.e5V3);
                AlgebraResult.value[2][4] = Double.parseDouble(testZero(eV3.getText().toString()));

                EditText aV4 =(EditText) findViewById(R.id.a5V4);
                AlgebraResult.value[3][0] = Double.parseDouble(testZero(aV4.getText().toString()));
                EditText bV4 =(EditText) findViewById(R.id.b5V4);
                AlgebraResult.value[3][1] = Double.parseDouble(testZero(bV4.getText().toString()));
                EditText cV4 =(EditText) findViewById(R.id.c5V4);
                AlgebraResult.value[3][2] = Double.parseDouble(testZero(cV4.getText().toString()));
                EditText dV4 =(EditText) findViewById(R.id.d5V4);
                AlgebraResult.value[3][3] = Double.parseDouble(testZero(dV4.getText().toString()));
                EditText eV4 =(EditText) findViewById(R.id.e5V4);
                AlgebraResult.value[3][4] = Double.parseDouble(testZero(eV4.getText().toString()));

                EditText aV5 =(EditText) findViewById(R.id.a5V5);
                AlgebraResult.value[4][0] = Double.parseDouble(testZero(aV5.getText().toString()));
                EditText bV5 =(EditText) findViewById(R.id.b5V5);
                AlgebraResult.value[4][1] = Double.parseDouble(testZero(bV5.getText().toString()));
                EditText cV5 =(EditText) findViewById(R.id.c5V5);
                AlgebraResult.value[4][2] = Double.parseDouble(testZero(cV5.getText().toString()));
                EditText dV5 =(EditText) findViewById(R.id.d5V5);
                AlgebraResult.value[4][3] = Double.parseDouble(testZero(dV5.getText().toString()));
                EditText eV5 =(EditText) findViewById(R.id.e5V5);
                AlgebraResult.value[4][4] = Double.parseDouble(testZero(eV5.getText().toString()));

                EditText rV1 = (EditText) findViewById(R.id.r5V1);
                AlgebraResult.result[0][0] = Double.parseDouble(testZero(rV1.getText().toString()));
                EditText rV2 = (EditText) findViewById(R.id.r5V2);
                AlgebraResult.result[1][0] = Double.parseDouble(testZero(rV2.getText().toString()));
                EditText rV3 = (EditText) findViewById(R.id.r5V3);
                AlgebraResult.result[2][0] = Double.parseDouble(testZero(rV3.getText().toString()));
                EditText rV4 = (EditText) findViewById(R.id.r5V4);
                AlgebraResult.result[3][0] = Double.parseDouble(testZero(rV4.getText().toString()));
                EditText rV5 = (EditText) findViewById(R.id.r5V5);
                AlgebraResult.result[4][0] = Double.parseDouble(testZero(rV5.getText().toString()));

                boolean open = true;
                if(AlgebraResult.value[0][0]==0&&AlgebraResult.value[1][0]==0
                        &&AlgebraResult.value[2][0]==0&&AlgebraResult.value[3][0]==0){
                    open = false;
                }
                if(open) {
                    openActivity(AlgebraValue5.this, AlgebraResult.class);
                }
                else{
                    Toast.makeText(getApplicationContext(),"No or infintely many solutions",Toast.LENGTH_LONG).show();
                }
            }
        });
        toLinearAlgebra = (Button) findViewById(R.id.toLinearAlgebra5);
        toLinearAlgebra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(AlgebraValue5.this,LinearAlgebra.class);
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