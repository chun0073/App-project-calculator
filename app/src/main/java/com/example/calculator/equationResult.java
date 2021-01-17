package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.audiofx.DynamicsProcessing;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class equationResult extends AppCompatActivity {
    private Button erToE, erToMain;
    private TextView er1,er2,er3,er4, eException;
    public static double a,b,c,d,e,r;
    public static int n;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equation_result);

        erToE = (Button) findViewById(R.id.erToE);
        erToE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(equationMain.class);
            }
        });
        erToMain = (Button) findViewById(R.id.erToMain);
        erToMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(MainActivity2.class);
            }
        });

        eException = (TextView) findViewById(R.id.eException);

        er1 = (TextView) findViewById(R.id.er1);
        er2 = (TextView) findViewById(R.id.er2);
        er3 = (TextView) findViewById(R.id.er3);
        er4 = (TextView) findViewById(R.id.er4);
        TextView[] t = new TextView[4];
        t[0] = er1;
        t[1] = er2;
        t[2] = er3;
        t[3] = er4;
        String alphabet = "XXXX";
        String[] k = new String[2];
        String[] y = new String[3];
        String[] z = new String[4];

        switch(n){
            case 2:
                Equation quadratic = new Equation(a, b, c, r);
                k = quadratic.solvingQuadratic();
                if(quadratic.examD(quadratic.D)==0){eException.setText("Imaginary roots");}

                for (int i = 0; i < k.length; i++) {
                    t[i].setText(alphabet.charAt(i) + " = " + k[i]);
                }
                break;
            case 3:
                Equation cubic = new Equation(a,b,c,d,r);
                y = cubic.solvingCubic();
                for (int i = 0; i < y.length; i++) {
                    t[i].setText(alphabet.charAt(i) + " = " + y[i]);
                }
                break;
            case 4:
                Equation quartic = new Equation(a,b,c,d,e,r);
                z = quartic.solvingQuartic();
                for (int i = 0; i < z.length; i++) {
                    t[i].setText(alphabet.charAt(i) + " = " + z[i]);
                }
                break;
            default:
                break;
        }

    }
    private void openActivity(Class c) {
        Intent intent = new Intent(equationResult.this, c);
        startActivity(intent);
    }
}

/*What I have to fix in this section
*
* 1. increase accuracy of calculated numbers
*       - edit the number format
*
* 2. apply complex i rotation
*       ex) x^3 -> three different values exist
*       - write methods for applying the requirement separately
*
*
* */