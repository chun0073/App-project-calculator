package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class equationMain extends AppCompatActivity {

    private Button quadratic, cubic, quartic, eToMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equation_main);

        quadratic = (Button) findViewById(R.id.quadratic);
        quadratic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(equationQuadratic.class);
            }
        });
        cubic = (Button) findViewById(R.id.cubic);
        cubic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(equationCubic.class);
            }
        });
        quartic = (Button) findViewById(R.id.quartic);
        quartic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(equationQuartic.class);
            }
        });

        eToMain = (Button) findViewById(R.id.eToMain);
        eToMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(MainActivity2.class);
            }
        });

    }
    private void openActivity(Class c){
        Intent intent = new Intent(equationMain.this, c);
        startActivity(intent);
    }
}