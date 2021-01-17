package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ConversionMain extends AppCompatActivity {
    private Button conToB, convert;
    private EditText conText;
    private Conversion con;
    private String num, before, after;
    private TextView result;
    private final ArrayList arrayBase = new ArrayList();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion_main);
        conToB = (Button) findViewById(R.id.conToB);
        conToB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(MainActivity2.class);
            }
        });

        conText = (EditText) findViewById(R.id.conText);
        result = (TextView) findViewById(R.id.textView4);
        arrayBase.add(0,"Decimal");
        arrayBase.add(1, "Hexadecimal");
        arrayBase.add(2,"Octal");
        arrayBase.add(3,"Binary");

        final Spinner spinner = findViewById(R.id.spinner);
        final ArrayAdapter<CharSequence> adapter = new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item,arrayBase);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner.setAdapter(adapter);
        spinner.setSelection(0);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                before = String.valueOf(arrayBase.get(i));

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                before = String.valueOf(arrayBase.get(0));
            }
        });
        final Spinner spinner2 = findViewById(R.id.spinner2);
        spinner2.setAdapter(adapter);
        spinner2.setSelection(3);
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                after = String.valueOf(arrayBase.get(i));

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                after = String.valueOf(arrayBase.get(3));
            }
        });

        convert = (Button) findViewById(R.id.convert);
        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(conText.getText().toString().length()==0){
                    Toast.makeText(getApplicationContext(),"Input the number",Toast.LENGTH_LONG).show();
                }
                else {
                    num = conText.getText().toString();
                    con = new Conversion(num, before, after);
                    result.setText(con.execution());
                }
            }
        });
    }

    private void openActivity(Class c){
        Intent intent = new Intent(ConversionMain.this, c);
        startActivity(intent);
    }
}