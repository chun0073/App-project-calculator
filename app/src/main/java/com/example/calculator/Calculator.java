package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Calculator extends AppCompatActivity {
    private Button calButt0, calButt1, calButt2, calButt3, calButt4, calButt5,calButt6,calButt7,calButt8,calButt9;
    private Button calButtDot, calButtE, calButtplus, calButtminus, calButtmultiply, calButtdivide, calButtp1, calButtp2, calButtpi, calButtback;
    private Button calButtsin, calButtcos, calButttan, calButtlog, calButtswitch, calButtxsquare, calButtxpown, calButtsqrt, calButtclear, calButtmore;
    private EditText e1,e2;
    private String expression = "";
    private String text = "";
    private double result = 0.0;
    private int switchMode = 1;
    private int angleMode = 1;
    private int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        calButt0 = (Button) findViewById(R.id.calButt0);
        calButt1 = (Button) findViewById(R.id.calButt1);
        calButt2 = (Button) findViewById(R.id.calButt2);
        calButt3 = (Button) findViewById(R.id.calButt3);
        calButt4 = (Button) findViewById(R.id.calButt4);
        calButt5 = (Button) findViewById(R.id.calButt5);
        calButt6 = (Button) findViewById(R.id.calButt6);
        calButt7 = (Button) findViewById(R.id.calButt7);
        calButt8 = (Button) findViewById(R.id.calButt8);
        calButt9 = (Button) findViewById(R.id.calButt9);
        calButtxsquare = (Button) findViewById(R.id.calButtxsquare);
        calButtxpown = (Button) findViewById(R.id.calButtxpown);
        calButtsqrt = (Button) findViewById(R.id.calButtsqrt);
        calButtclear = (Button) findViewById(R.id.calButtclear);
        calButtmore = (Button) findViewById(R.id.calButtmore);
        calButtDot = (Button) findViewById(R.id.calButtDot);
        calButtE = (Button) findViewById(R.id.calButtE);
        calButtplus = (Button) findViewById(R.id.calButtplus);
        calButtminus = (Button) findViewById(R.id.calButtminus);
        calButtmultiply = (Button) findViewById(R.id.calButtmultiply);
        calButtdivide = (Button) findViewById(R.id.calButtdivide);
        calButtp1 = (Button) findViewById(R.id.calButtp1);
        calButtp2 = (Button) findViewById(R.id.calButtp2);
        calButtpi = (Button) findViewById(R.id.calButtpi);
        calButtback =  (Button) findViewById(R.id.calButtback);
        calButtsin = (Button) findViewById(R.id.calButtsin);
        calButtcos = (Button) findViewById(R.id.calButtcos);
        calButttan = (Button) findViewById(R.id.calButttan);
        calButtlog = (Button) findViewById(R.id.calButtlog);
        calButtswitch = (Button) findViewById(R.id.calButtswitch);

        e1 = (EditText) findViewById(R.id.calText1);
        e2 = (EditText) findViewById(R.id.calText2);
        e2.setText("0");
        calButtswitch.setTag(0);

        calButt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calculator.this.onClick(calButt0);
            }
        });
        calButt1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Calculator.this.onClick(calButt1);
            }
        });
        calButt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calculator.this.onClick(calButt2);
            }
        });
        calButt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calculator.this.onClick(calButt3);
            }
        });
        calButt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calculator.this.onClick(calButt4);
            }
        });
        calButt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calculator.this.onClick(calButt5);
            }
        });
        calButt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calculator.this.onClick(calButt6);
            }
        });
        calButt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calculator.this.onClick(calButt7);
            }
        });
        calButt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calculator.this.onClick(calButt8);
            }
        });
        calButt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calculator.this.onClick(calButt9);
            }
        });
        calButtswitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calculator.this.onClick(calButtswitch);
            }
        });
        calButtxpown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calculator.this.onClick(calButtxpown);
            }
        });
        calButtxsquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calculator.this.onClick(calButtxsquare);
            }
        });
        calButtlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calculator.this.onClick(calButtlog);
            }
        });
        calButtplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calculator.this.onClick(calButtplus);
            }
        });
        calButtclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calculator.this.onClick(calButtclear);
            }
        });
        calButtsqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calculator.this.onClick(calButtsqrt);
            }
        });
        calButtback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calculator.this.onClick(calButtback);
            }
        });
        calButtdivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calculator.this.onClick(calButtdivide);
            }
        });
        calButtmultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calculator.this.onClick(calButtmultiply);
            }
        });
        calButtminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calculator.this.onClick(calButtminus);
            }
        });
        calButtcos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calculator.this.onClick(calButtcos);
            }
        });
        calButtDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calculator.this.onClick(calButtDot);
            }
        });
        calButtE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calculator.this.onClick(calButtE);
            }
        });
        calButtp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calculator.this.onClick(calButtp1);
            }
        });
        calButtp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calculator.this.onClick(calButtp2);
            }
        });
        calButtpi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calculator.this.onClick(calButtpi);
            }
        });
        calButtsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calculator.this.onClick(calButtsin);
            }
        });
        calButttan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calculator.this.onClick(calButttan);
            }
        });
        calButtmore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Calculator.this, MainActivity2.class);
                startActivity(intent);
            }
        });
    }

    public void onClick(View v){
        switchMode=(int)calButtswitch.getTag();

        switch (v.getId()) {

            case R.id.calButtswitch:
                //change the button text if switch button is clicked
                /*if(switchMode==1)
                {
                    calButtswitch.setTag(2);
                    calButtxsquare.setText(R.string.cube);
                    calButtxpown.setText(R.string.tenpow);
                    calButtlog.setText(R.string.naturalLog);
                    calButtsin.setText(R.string.sininv);
                    calButtcos.setText(R.string.cosinv);
                    calButttan.setText(R.string.taninv);
                    calButtsqrt.setText(R.string.cuberoot);

                }
                else if(switchMode==2)
                {
                    calButtswitch.setTag(3);
                    calButtxsquare.setText(R.string.square);
                    calButtxpown.setText(R.string.epown);
                    calButtlog.setText(R.string.log);
                    calButtsin.setText(R.string.hyperbolicSine);
                    calButtcos.setText(R.string.hyperbolicCosine);
                    calButttan.setText(R.string.hyperbolicTan);
                    calButtsqrt.setText(R.string.inverse);

                }
                else if(switchMode==3)
                {
                    calButtswitch.setTag(1);
                    calButtsin.setText(R.string.sin);
                    calButtcos.setText(R.string.cos);
                    calButttan.setText(R.string.tan);
                    calButtsqrt.setText(R.string.sqrt);
                    calButtxpown.setText(R.string.xpown);
                }*/
                break;

            case R.id.calButt0:
                e2.setText(e2.getText() + "0");
                break;

            case R.id.calButt1:
                e2.setText(e2.getText() + "1");
                break;

            case R.id.calButt2:
                e2.setText(e2.getText() + "2");
                break;

            case R.id.calButt3:
                e2.setText(e2.getText() + "3");
                break;


            case R.id.calButt4:
                e2.setText(e2.getText() + "4");
                break;

            case R.id.calButt5:
                e2.setText(e2.getText() + "5");
                break;

            case R.id.calButt6:
                e2.setText(e2.getText() + "6");
                break;

            case R.id.calButt7:
                e2.setText(e2.getText() + "7");
                break;

            case R.id.calButt8:
                e2.setText(e2.getText() + "8");
                break;

            case R.id.calButt9:
                e2.setText(e2.getText() + "9");
                break;

            case R.id.calButtpi:
                e2.setText(e2.getText() + "pi");
                break;

            case R.id.calButtDot:
                if (count == 0 && e2.length() != 0) {
                    e2.setText(e2.getText() + ".");
                    count++;
                }
                break;

            case R.id.calButtclear:
                e1.setText("");
                e2.setText("");
                count = 0;
                expression = "";
                break;

            case R.id.calButtback:
                text=e2.getText().toString();
                if(text.length()>0)
                {
                    if(text.endsWith("."))
                    {
                        count=0;
                    }
                    String newText=text.substring(0,text.length()-1);
                    //to delete the data contained in the brackets at once
                    if(text.endsWith(")"))
                    {
                        char []a=text.toCharArray();
                        int pos=a.length-2;
                        int counter=1;
                        //to find the opening bracket position
                        for(int i=a.length-2;i>=0;i--)
                        {
                            if(a[i]==')')
                            {
                                counter++;
                            }
                            else if(a[i]=='(')
                            {
                                counter--;
                            }
                            //if decimal is deleted b/w brackets then count should be zero
                            else if(a[i]=='.')
                            {
                                count=0;
                            }
                            //if opening bracket pair for the last bracket is found
                            if(counter==0)
                            {
                                pos=i;
                                break;
                            }
                        }
                        newText=text.substring(0,pos);
                    }
                    //if e2 edit text contains only - sign or sqrt or any other text functions
                    // at last then clear the edit text e2
                    if(newText.equals("-")||newText.endsWith("sqrt")||newText.endsWith("log")||newText.endsWith("ln")
                            ||newText.endsWith("sin")||newText.endsWith("asin")||newText.endsWith("asind")||newText.endsWith("sinh")
                            ||newText.endsWith("cos")||newText.endsWith("acos")||newText.endsWith("acosd")||newText.endsWith("cosh")
                            ||newText.endsWith("tan")||newText.endsWith("atan")||newText.endsWith("atand")||newText.endsWith("tanh")
                            ||newText.endsWith("cbrt"))
                    {
                        newText="";
                    }
                    //if pow sign is left at the last or divide sign
                    else if(newText.endsWith("^")||newText.endsWith("/"))
                        newText=newText.substring(0,newText.length()-1);
                    else if(newText.endsWith("pi")||newText.endsWith("e^"))
                        newText=newText.substring(0,newText.length()-2);
                    e2.setText(newText);
                }
                break;

            case R.id.calButtplus:
                operationClicked("+");
                break;

            case R.id.calButtminus:
                operationClicked("-");
                break;

            case R.id.calButtdivide:
                operationClicked("/");
                break;

            case R.id.calButtmultiply:
                operationClicked("*");
                break;

            case R.id.calButtsqrt:
                if (e2.length() != 0) {
                    text = e2.getText().toString();
                    switchMode=(int)calButtswitch.getTag();
                    e2.setText("sqrt(" + text + ")");
                    /*if(switchMode==1)
                        e2.setText("sqrt(" + text + ")");
                    else if(switchMode==2)
                        e2.setText("cbrt(" + text + ")");
                    else
                        e2.setText("1/(" + text + ")");*/
                }
                break;

            case R.id.calButtxsquare:
                if (e2.length() != 0) {
                    text = e2.getText().toString();
                    e2.setText("(" + text + ")^2");
                    /*if(switchMode==2)
                        e2.setText("(" + text + ")^3");
                    else
                        e2.setText("(" + text + ")^2");*/
                }
                break;

            case R.id.calButtxpown:
                if (e2.length() != 0) {
                    text = e2.getText().toString();
                    e2.setText("(" + text + ")^");
                    /*if(switchMode==1)
                        e2.setText("(" + text + ")^");
                    else if(switchMode==2)
                        e2.setText("10^(" + text + ")");
                    else
                        e2.setText("e^(" + text + ")");*/
                }
                break;

            case R.id.calButtlog:
                if (e2.length() != 0) {
                    text = e2.getText().toString();
                    if(switchMode==2)
                        e2.setText("ln(" + text + ")");
                    else
                        e2.setText("log(" + text + ")");
                }
                break;

            case R.id.calButtsin:
                if (e2.length() != 0) {

                    text = e2.getText().toString();
                    double angle=Math.toRadians(new ExtendedDoubleEvaluator().evaluate(text));
                    //---edit
                    e2.setText("sin(" + angle + ")");
                    /*if(angleMode==1)
                    {

                        if(switchMode==1)
                            e2.setText("sin(" + angle + ")");
                        else if(switchMode==2)
                            e2.setText("asind(" + text + ")");
                        else
                            e2.setText("sinh(" + text + ")");
                    }
                    else
                    {
                        if(switchMode==1)
                            e2.setText("sin(" + text + ")");
                        else if(switchMode==2)
                            e2.setText("asin(" + text + ")");
                        else
                            e2.setText("sinh(" + text + ")");
                    }*/
                }
                break;

            case R.id.calButtcos:
                if (e2.length() != 0) {
                    text = e2.getText().toString();
                    double angle=Math.toRadians(new ExtendedDoubleEvaluator().evaluate(text));
                    //--edit
                    e2.setText("cos(" + angle + ")");
                    /*if(angleMode==1)
                    {
                        double angle=Math.toRadians(new ExtendedDoubleEvaluator().evaluate(text));

                        if(switchMode==1)
                            e2.setText("cos(" + angle + ")");
                        else if(switchMode==2)
                            e2.setText("acosd(" + text + ")");
                        else
                            e2.setText("cosh(" + text + ")");
                    }
                    else
                    {
                        if(switchMode==1)
                            e2.setText("cos(" + text + ")");
                        else if(switchMode==2)
                            e2.setText("acos(" + text + ")");
                        else
                            e2.setText("cosh(" + text + ")");
                    }*/
                }
                break;

            case R.id.calButttan:
                if (e2.length() != 0) {
                    text = e2.getText().toString();
                    double angle=Math.toRadians(new ExtendedDoubleEvaluator().evaluate(text));
                    //--edit
                    e2.setText("tan(" + angle + ")");
                    /*if(angleMode==1)
                    {
                        double angle=Math.toRadians(new ExtendedDoubleEvaluator().evaluate(text));

                        if(switchMode==1)
                            e2.setText("tan(" + angle + ")");
                        else if(switchMode==2)
                            e2.setText("atand(" + text + ")");
                        else
                            e2.setText("tanh(" + text + ")");
                    }
                    else
                    {
                        if(switchMode==1)
                            e2.setText("tan(" + text + ")");
                        else if(switchMode==2)
                            e2.setText("atan(" + text + ")");
                        else
                            e2.setText("tanh(" + text + ")");
                    }*/
                }
                break;

            case R.id.calButtE:
                /*for more knowledge on DoubleEvaluator and its tutorial go to the below link
                http://javaluator.sourceforge.net/en/home/*/
                if (e2.length() != 0) {
                    text = e2.getText().toString();
                    expression = e1.getText().toString() + text;
                }
                e1.setText("");
                if (expression.length() == 0)
                    expression = "0.0";
                try {
                    //evaluate the expression
                    result = new ExtendedDoubleEvaluator().evaluate(expression);
                    //insert expression and result in sqlite database if expression is valid and not 0.0
                    if (String.valueOf(result).equals("6.123233995736766E-17"))
                    {
                        result=0.0;
                        e2.setText(result + "");
                    }
                    else if(String.valueOf(result).equals("1.633123935319537E16"))
                        e2.setText("infinity");
                    else
                        e2.setText(result + "");
                    //if (!expression.equals("0.0"))
                    //    dbHelper.insert("SCIENTIFIC", expression + " = " + result);
                } catch (Exception e) {
                    e2.setText("Invalid Expression");
                    e1.setText("");
                    expression = "";
                    e.printStackTrace();
                }
                break;

            case R.id.calButtp1:
                e1.setText(e1.getText() + "(");
                break;

            case R.id.calButtp2:
                if(e2.length()!=0)
                    e1.setText(e1.getText() +e2.getText().toString()+ ")");
                else
                    e1.setText(e1.getText() + ")");
                break;

        }
    }

    private void operationClicked(String op) {
        if (e2.length() != 0) {
            String text = e2.getText().toString();
            e1.setText(e1.getText() + text + op);
            e2.setText("");
            count = 0;
        } else {
            String text = e1.getText().toString();
            if (text.length() > 0) {
                String newText = text.substring(0, text.length() - 1) + op;
                e1.setText(newText);
            }
        }
    }
}