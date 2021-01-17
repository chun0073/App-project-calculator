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

public class AlgebraValue6 extends AppCompatActivity {
    private Button toLinearAlgebra;
    private Button toCalculate;
    private final int nColumn = 6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algebra_value6);

        AlertDialog alert = new AlertDialog.Builder(this).setTitle("Alert")
                .setMessage("Matrix that has no solution or\ninfinitely many solutions will not be accepted").setPositiveButton(android.R.string.yes, null)
                .setIcon(android.R.drawable.ic_dialog_alert).show();

        toCalculate = (Button) findViewById(R.id.calculate6);
        toCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlgebraResult.nColumn = 6;
                EditText aV1 =(EditText) findViewById(R.id.a6V1);
                AlgebraResult.value[0][0] = Double.parseDouble(testZero(aV1.getText().toString()));
                EditText bV1 =(EditText) findViewById(R.id.b6V1);
                AlgebraResult.value[0][1] = Double.parseDouble(testZero(bV1.getText().toString()));
                EditText cV1 =(EditText) findViewById(R.id.c6V1);
                AlgebraResult.value[0][2] = Double.parseDouble(testZero(cV1.getText().toString()));
                EditText dV1 =(EditText) findViewById(R.id.d6V1);
                AlgebraResult.value[0][3] = Double.parseDouble(testZero(dV1.getText().toString()));
                EditText eV1 =(EditText) findViewById(R.id.e6V1);
                AlgebraResult.value[0][4] = Double.parseDouble(testZero(eV1.getText().toString()));
                EditText fV1 =(EditText) findViewById(R.id.f6V1);
                AlgebraResult.value[0][5] = Double.parseDouble(testZero(fV1.getText().toString()));

                EditText aV2 =(EditText) findViewById(R.id.a6V2);
                AlgebraResult.value[1][0] = Double.parseDouble(testZero(aV2.getText().toString()));
                EditText bV2 =(EditText) findViewById(R.id.b6V2);
                AlgebraResult.value[1][1] = Double.parseDouble(testZero(bV2.getText().toString()));
                EditText cV2 =(EditText) findViewById(R.id.c6V2);
                AlgebraResult.value[1][2] = Double.parseDouble(testZero(cV2.getText().toString()));
                EditText dV2 =(EditText) findViewById(R.id.d6V2);
                AlgebraResult.value[1][3] = Double.parseDouble(testZero(dV2.getText().toString()));
                EditText eV2 =(EditText) findViewById(R.id.e6V2);
                AlgebraResult.value[1][4] = Double.parseDouble(testZero(eV2.getText().toString()));
                EditText fV2 =(EditText) findViewById(R.id.f6V2);
                AlgebraResult.value[1][5] = Double.parseDouble(testZero(fV2.getText().toString()));

                EditText aV3 =(EditText) findViewById(R.id.a6V3);
                AlgebraResult.value[2][0] = Double.parseDouble(testZero(aV3.getText().toString()));
                EditText bV3 =(EditText) findViewById(R.id.b6V3);
                AlgebraResult.value[2][1] = Double.parseDouble(testZero(bV3.getText().toString()));
                EditText cV3 =(EditText) findViewById(R.id.c6V3);
                AlgebraResult.value[2][2] = Double.parseDouble(testZero(cV3.getText().toString()));
                EditText dV3 =(EditText) findViewById(R.id.d6V3);
                AlgebraResult.value[2][3] = Double.parseDouble(testZero(dV3.getText().toString()));
                EditText eV3 =(EditText) findViewById(R.id.e6V3);
                AlgebraResult.value[2][4] = Double.parseDouble(testZero(eV3.getText().toString()));
                EditText fV3 =(EditText) findViewById(R.id.f6V3);
                AlgebraResult.value[2][5] = Double.parseDouble(testZero(fV3.getText().toString()));

                EditText aV4 =(EditText) findViewById(R.id.a6V4);
                AlgebraResult.value[3][0] = Double.parseDouble(testZero(aV4.getText().toString()));
                EditText bV4 =(EditText) findViewById(R.id.b6V4);
                AlgebraResult.value[3][1] = Double.parseDouble(testZero(bV4.getText().toString()));
                EditText cV4 =(EditText) findViewById(R.id.c6V4);
                AlgebraResult.value[3][2] = Double.parseDouble(testZero(cV4.getText().toString()));
                EditText dV4 =(EditText) findViewById(R.id.d6V4);
                AlgebraResult.value[3][3] = Double.parseDouble(testZero(dV4.getText().toString()));
                EditText eV4 =(EditText) findViewById(R.id.e6V4);
                AlgebraResult.value[3][4] = Double.parseDouble(testZero(eV4.getText().toString()));
                EditText fV4 =(EditText) findViewById(R.id.f6V4);
                AlgebraResult.value[3][5] = Double.parseDouble(testZero(fV4.getText().toString()));

                EditText aV5 =(EditText) findViewById(R.id.a6V5);
                AlgebraResult.value[4][0] = Double.parseDouble(testZero(aV5.getText().toString()));
                EditText bV5 =(EditText) findViewById(R.id.b6V5);
                AlgebraResult.value[4][1] = Double.parseDouble(testZero(bV5.getText().toString()));
                EditText cV5 =(EditText) findViewById(R.id.c6V5);
                AlgebraResult.value[4][2] = Double.parseDouble(testZero(cV5.getText().toString()));
                EditText dV5 =(EditText) findViewById(R.id.d6V5);
                AlgebraResult.value[4][3] = Double.parseDouble(testZero(dV5.getText().toString()));
                EditText eV5 =(EditText) findViewById(R.id.e6V5);
                AlgebraResult.value[4][4] = Double.parseDouble(testZero(eV5.getText().toString()));
                EditText fV5 =(EditText) findViewById(R.id.f6V5);
                AlgebraResult.value[4][5] = Double.parseDouble(testZero(fV5.getText().toString()));

                EditText aV6 =(EditText) findViewById(R.id.a6V6);
                AlgebraResult.value[5][0] = Double.parseDouble(testZero(aV6.getText().toString()));
                EditText bV6 =(EditText) findViewById(R.id.b6V6);
                AlgebraResult.value[5][1] = Double.parseDouble(testZero(bV6.getText().toString()));
                EditText cV6 =(EditText) findViewById(R.id.c6V6);
                AlgebraResult.value[5][2] = Double.parseDouble(testZero(cV6.getText().toString()));
                EditText dV6 =(EditText) findViewById(R.id.d6V6);
                AlgebraResult.value[5][3] = Double.parseDouble(testZero(dV6.getText().toString()));
                EditText eV6 =(EditText) findViewById(R.id.e6V6);
                AlgebraResult.value[5][4] = Double.parseDouble(testZero(eV6.getText().toString()));
                EditText fV6 =(EditText) findViewById(R.id.f6V6);
                AlgebraResult.value[5][5] = Double.parseDouble(testZero(fV6.getText().toString()));

                EditText rV1 = (EditText) findViewById(R.id.r6V1);
                AlgebraResult.result[0][0] = Double.parseDouble(testZero(rV1.getText().toString()));
                EditText rV2 = (EditText) findViewById(R.id.r6V2);
                AlgebraResult.result[1][0] = Double.parseDouble(testZero(rV2.getText().toString()));
                EditText rV3 = (EditText) findViewById(R.id.r6V3);
                AlgebraResult.result[2][0] = Double.parseDouble(testZero(rV3.getText().toString()));
                EditText rV4 = (EditText) findViewById(R.id.r6V4);
                AlgebraResult.result[3][0] = Double.parseDouble(testZero(rV4.getText().toString()));
                EditText rV5 = (EditText) findViewById(R.id.r6V5);
                AlgebraResult.result[4][0] = Double.parseDouble(testZero(rV5.getText().toString()));
                EditText rV6 = (EditText) findViewById(R.id.r6V6);
                AlgebraResult.result[5][0] = Double.parseDouble(testZero(rV6.getText().toString()));

                boolean open = true;
                if(AlgebraResult.value[0][0]==0&&AlgebraResult.value[1][0]==0&&AlgebraResult.value[2][0]==0
                        &&AlgebraResult.value[3][0]==0&&AlgebraResult.value[4][0]==0){
                    open = false;
                }
                if(open) {
                    openActivity(AlgebraValue6.this, AlgebraResult.class);
                }
                else{
                    Toast.makeText(getApplicationContext(),"No or infintely many solutions",Toast.LENGTH_LONG).show();
                }
            }
        });

        toLinearAlgebra = (Button) findViewById(R.id.toLinearAlgebra6);
        toLinearAlgebra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(AlgebraValue6.this,LinearAlgebra.class);
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