package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class IeeeValue extends AppCompatActivity {
    private Button iEEECalculate, iToMain;
    private EditText iEEEInput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ieee_value);

        iToMain = (Button) findViewById(R.id.iToMain);
        iToMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(IeeeValue.this, MainActivity2.class);
            }
        });
        iEEECalculate = (Button) findViewById(R.id.iEEECalculate);
        iEEECalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText iEEEInput = (EditText) findViewById(R.id.iEEEInput);
                IEEEResult.decimal=Double.parseDouble(testZero(iEEEInput.getText().toString()));
                openActivity(IeeeValue.this, IEEEResult.class);
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