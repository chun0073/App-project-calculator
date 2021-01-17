package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class IEEEResult extends AppCompatActivity {
    public static double decimal;

    private TextView IEEEResult, IEEEHexa, IEEEBinary;
    private Button iToI, iToMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_i_e_e_e_result);

        IEEEBinary = (TextView) findViewById(R.id.IEEEBinary);
        IEEEResult = (TextView) findViewById(R.id.IEEEResult);
        IEEEHexa = (TextView) findViewById(R.id.IEEEHexa);

        if(decimal == 0){
            IEEEBinary.setText("0");
            IEEEResult.setText("0");
            IEEEHexa.setText("0");
        }
        else{
            IEEE754 ieee754 = new IEEE754(decimal);
            IEEEBinary.setText(ieee754.convertDtoB_16bits());
            IEEEResult.setText(ieee754.iEEE754Binary());
            IEEEHexa.setText(ieee754.iEEE754Hexa());
        }

        iToI = (Button) findViewById(R.id.itoI);
        iToI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(IEEEResult.this, IeeeValue.class);
            }
        });
        iToMain = (Button) findViewById(R.id.button7);
        iToMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(IEEEResult.this, MainActivity2.class);
            }
        });
    }
    private void openActivity(Context context, Class c){
        Intent intent = new Intent(context, c);
        startActivity(intent);
    }
}