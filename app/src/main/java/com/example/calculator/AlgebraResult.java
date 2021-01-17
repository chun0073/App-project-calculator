package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class AlgebraResult extends AppCompatActivity {
    public static int nColumn;
    public static double[][] value = new double[7][7];
    public static double[][] result = new double[7][1];

    private TextView r1, r2, r3, r4, r5, r6, r7;
    private Button rToLinear, rToMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algebra_result);


        double[][] a1 = dataTrasfer(nColumn, nColumn, value);
        double[][] a2 = dataTrasfer(nColumn, 1, result);

        Matrix n = new Matrix(a1);
        Matrix m = new Matrix(a2);
        Matrix k = n.solve(m);

        DecimalFormat f = new DecimalFormat("0.0000");
        f.setRoundingMode(RoundingMode.HALF_UP);
        r1 = (TextView) findViewById(R.id.r1);
        r2 = (TextView) findViewById(R.id.r2);
        r3 = (TextView) findViewById(R.id.r3);
        r4 = (TextView) findViewById(R.id.r4);
        r5 = (TextView) findViewById(R.id.r5);
        r6 = (TextView) findViewById(R.id.r6);
        r7 = (TextView) findViewById(R.id.r7);
        TextView[] a = new TextView[7];
        a[0] = r1;
        a[1] = r2;
        a[2] = r3;
        a[3] = r4;
        a[4] = r5;
        a[5] = r6;
        a[6] = r7;
        String alphabet = "abcdefg";
        for (int i = 0; i < nColumn; i++) {
            a[i].setText(alphabet.charAt(i) + " = " + String.valueOf(f.format(k.data[i][0])));
        }

        rToLinear = (Button) findViewById(R.id.rToLinear);
        rToLinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(LinearAlgebra.class);
            }
        });
        rToMain = (Button) findViewById(R.id.rToMain);
        rToMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(MainActivity2.class);
            }
        });
    }

    public double[][] dataTrasfer(int rN, int cN, double[][] value) {
        double[][] nValue = new double[rN][cN];
        for (int i = 0; i < rN; i++) {
            for (int j = 0; j < cN; j++) {
                nValue[i][j] = value[i][j];
            }
        }
        return nValue;
    }

    private void openActivity(Class c) {
        Intent intent = new Intent(AlgebraResult.this, c);
        startActivity(intent);
    }
}