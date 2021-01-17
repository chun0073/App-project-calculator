package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.DecimalFormat;
import java.util.Vector;

public class VectorMain extends AppCompatActivity {
    private Button vec1_decompose, vec2_decompose, vec3_decompose, Add, Dot, vToM;
    private EditText magnitude1,magnitude2,magnitude3,angle1,angle2,angle3;
    private TextView vec1_x,vec2_x,vec3_x,vec_Rx, vec1_y,vec2_y,vec3_y,vec_Ry,magnitudeR,angleR;
    DecimalFormat f = new DecimalFormat("0.####");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vector_main);

        magnitudeR = (TextView) findViewById(R.id.magnitudeR);
        angleR = (TextView) findViewById(R.id.angleR);
        vec_Rx = (TextView) findViewById(R.id.vec_Rx);
        vec_Ry = (TextView) findViewById(R.id.vec_Ry);
        vec1_decompose = (Button) findViewById(R.id.vec1_decompose);
        vec2_decompose = (Button) findViewById(R.id.vec2_decompose);
        vec3_decompose = (Button) findViewById(R.id.vec3_decompose);
        Add = (Button) findViewById(R.id.Add);
        Dot = (Button) findViewById(R.id.Dot);
        magnitude1 = (EditText) findViewById(R.id.magnitude1);
        magnitude2 = (EditText) findViewById(R.id.magnitude2);
        magnitude3 = (EditText) findViewById(R.id.magnitude3);
        angle1 = (EditText) findViewById(R.id.angle1);
        angle2 = (EditText) findViewById(R.id.angle2);
        angle3 = (EditText) findViewById(R.id.angle3);
        vec1_x = (TextView) findViewById(R.id.vec1_x);
        vec2_x = (TextView) findViewById(R.id.vec2_x);
        vec3_x = (TextView) findViewById(R.id.vec3_x);
        vec1_y = (TextView) findViewById(R.id.vec1_y);
        vec2_y = (TextView) findViewById(R.id.vec2_y);
        vec3_y = (TextView) findViewById(R.id.vec3_y);


        vec1_decompose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mag1 = magnitude1.getText().toString();
                String ang1 = angle1.getText().toString();
                VectorV vec1 = new VectorV(mag1, ang1);
                vec1_x.setText(f.format(vec1.getX()));
                vec1_y.setText(f.format(vec1.getY()));
            }
        });

        vec2_decompose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mag2 = magnitude2.getText().toString();
                String ang2 = angle2.getText().toString();
                VectorV vec2 = new VectorV(mag2, ang2);
                vec2_x.setText(f.format(vec2.getX()));
                vec2_y.setText(f.format(vec2.getY()));
            }
        });

        vec3_decompose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mag3 = magnitude3.getText().toString();
                String ang3 = angle3.getText().toString();
                VectorV vec3 = new VectorV(mag3, ang3);
                vec3_x.setText(f.format(vec3.getX()));
                vec3_y.setText(f.format(vec3.getY()));
            }
        });

        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                VectorV v1 = new VectorV(magnitude1.getText().toString(), angle1.getText().toString());
                VectorV v2 = new VectorV(magnitude2.getText().toString(), angle2.getText().toString());
                VectorV v3 = new VectorV(magnitude3.getText().toString(), angle3.getText().toString());
                VectorCalculate vectorCalculate = new VectorCalculate(v1,v2,v3);
                VectorV vR = vectorCalculate.vectorAdd();
                magnitudeR.setText(f.format(vR.getMag()));
                angleR.setText(f.format(vR.getAngle()));
                vec_Rx.setText(f.format(vR.getX()));
                vec_Ry.setText(f.format(vR.getY()));
            }
        });

        Dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                VectorV v1 = new VectorV(magnitude1.getText().toString(), angle1.getText().toString());
                VectorV v2 = new VectorV(magnitude2.getText().toString(), angle2.getText().toString());
                VectorV v3 = new VectorV(magnitude3.getText().toString(), angle3.getText().toString());
                VectorCalculate vectorCalculate = new VectorCalculate(v1,v2,v3);
                VectorV vR = vectorCalculate.vectorDot();
                magnitudeR.setText(f.format(vR.getMag()));
                angleR.setText("N/A");
                vec_Rx.setText("N/A");
                vec_Ry.setText("N/A");
            }
        });

        vToM = (Button) findViewById(R.id.vToM);
        vToM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(MainActivity2.class);
            }
        });
    }
    private void openActivity(Class c){
        Intent intent = new Intent(VectorMain.this, c);
        startActivity(intent);
    }
}