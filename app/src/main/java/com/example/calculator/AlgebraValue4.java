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

public class AlgebraValue4 extends AppCompatActivity {
    private Button toLinearAlgebra;
    private Button toCalculate;
    private final int nColumn = 4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algebra_value4);

        AlertDialog alert = new AlertDialog.Builder(this).setTitle("Alert")
                .setMessage("Matrix that has no solution or\ninfinitely many solutions will not be accepted").setPositiveButton(android.R.string.yes, null)
                .setIcon(android.R.drawable.ic_dialog_alert).show();

        toCalculate = (Button) findViewById(R.id.calculate4);
        toCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlgebraResult.nColumn = 4;
                EditText aV1 =(EditText) findViewById(R.id.a4V1);
                AlgebraResult.value[0][0] = Double.parseDouble(testZero(aV1.getText().toString()));
                EditText bV1 =(EditText) findViewById(R.id.b4V1);
                AlgebraResult.value[0][1] = Double.parseDouble(testZero(bV1.getText().toString()));
                EditText cV1 =(EditText) findViewById(R.id.c4V1);
                AlgebraResult.value[0][2] = Double.parseDouble(testZero(cV1.getText().toString()));
                EditText dV1 =(EditText) findViewById(R.id.d4V1);
                AlgebraResult.value[0][3] = Double.parseDouble(testZero(dV1.getText().toString()));

                EditText aV2 =(EditText) findViewById(R.id.a4V2);
                AlgebraResult.value[1][0] = Double.parseDouble(testZero(aV2.getText().toString()));
                EditText bV2 =(EditText) findViewById(R.id.b4V2);
                AlgebraResult.value[1][1] = Double.parseDouble(testZero(bV2.getText().toString()));
                EditText cV2 =(EditText) findViewById(R.id.c4V2);
                AlgebraResult.value[1][2] = Double.parseDouble(testZero(cV2.getText().toString()));
                EditText dV2 =(EditText) findViewById(R.id.d4V2);
                AlgebraResult.value[1][3] = Double.parseDouble(testZero(dV2.getText().toString()));

                EditText aV3 =(EditText) findViewById(R.id.a4V3);
                AlgebraResult.value[2][0] = Double.parseDouble(testZero(aV3.getText().toString()));
                EditText bV3 =(EditText) findViewById(R.id.b4V3);
                AlgebraResult.value[2][1] = Double.parseDouble(testZero(bV3.getText().toString()));
                EditText cV3 =(EditText) findViewById(R.id.c4V3);
                AlgebraResult.value[2][2] = Double.parseDouble(testZero(cV3.getText().toString()));
                EditText dV3 =(EditText) findViewById(R.id.d4V3);
                AlgebraResult.value[2][3] = Double.parseDouble(testZero(dV3.getText().toString()));

                EditText aV4 =(EditText) findViewById(R.id.a4V4);
                AlgebraResult.value[3][0] = Double.parseDouble(testZero(aV4.getText().toString()));
                EditText bV4 =(EditText) findViewById(R.id.b4V4);
                AlgebraResult.value[3][1] = Double.parseDouble(testZero(bV4.getText().toString()));
                EditText cV4 =(EditText) findViewById(R.id.c4V4);
                AlgebraResult.value[3][2] = Double.parseDouble(testZero(cV4.getText().toString()));
                EditText dV4 =(EditText) findViewById(R.id.d4V4);
                AlgebraResult.value[3][3] = Double.parseDouble(testZero(dV4.getText().toString()));

                EditText rV1 = (EditText) findViewById(R.id.r4V1);
                AlgebraResult.result[0][0] = Double.parseDouble(testZero(rV1.getText().toString()));
                EditText rV2 = (EditText) findViewById(R.id.r4V2);
                AlgebraResult.result[1][0] = Double.parseDouble(testZero(rV2.getText().toString()));
                EditText rV3 = (EditText) findViewById(R.id.r4V3);
                AlgebraResult.result[2][0] = Double.parseDouble(testZero(rV3.getText().toString()));
                EditText rV4 = (EditText) findViewById(R.id.r4V4);
                AlgebraResult.result[3][0] = Double.parseDouble(testZero(rV4.getText().toString()));

                boolean open = true;
                if(AlgebraResult.value[0][0]==0&&AlgebraResult.value[1][0]==0&&AlgebraResult.value[2][0]==0){
                    open = false;
                }
                if(open) {
                    openActivity(AlgebraValue4.this, AlgebraResult.class);
                }
                else{
                    Toast.makeText(getApplicationContext(),"No or infintely many solutions",Toast.LENGTH_LONG).show();
                }
            }
        });
        toLinearAlgebra = (Button) findViewById(R.id.toLinearAlgebra4);
        toLinearAlgebra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(AlgebraValue4.this,LinearAlgebra.class);
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