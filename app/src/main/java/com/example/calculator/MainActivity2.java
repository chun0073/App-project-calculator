package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    private Button linearAlgebra;
    private Button iEEEValue;
    private Button equation;
    private Button conversion;
    private Button vector;
    private Button toCal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        linearAlgebra = (Button) findViewById(R.id.linearAlgebra);
        linearAlgebra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(LinearAlgebra.class);
            }
        });
        iEEEValue = (Button) findViewById(R.id.iEEEValue);
        iEEEValue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(IeeeValue.class);
            }
        });
        equation = (Button) findViewById(R.id.equation);
        equation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(equationMain.class);
            }
        });
        conversion = (Button) findViewById(R.id.conversion);
        conversion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(ConversionMain.class);
            }
        });
        vector = (Button) findViewById(R.id.vector);
        vector.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                openActivity(VectorMain.class);
            }
        });

        toCal = (Button) findViewById(R.id.toCal);
        toCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(Calculator.class);
            }
        });
    }
    private void openActivity(Class c){
        Intent intent = new Intent(MainActivity2.this, c);
        startActivity(intent);
    }
}