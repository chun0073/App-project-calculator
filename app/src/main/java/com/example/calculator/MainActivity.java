package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton b;
    private ImageButton c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = (ImageButton) findViewById(R.id.mainB);
        final Animation animation = AnimationUtils.loadAnimation(this, R.anim.fadein);
        b.startAnimation(animation);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation1 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.rotation);
                b.startAnimation(animation1);
                Thread timer =new Thread() {
                    public void run() {
                        try {
                            sleep(400);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        finally {
                            openActivity(MainActivity2.class);
                            finish();
                        }
                    }
                };
                timer.start();
            }
        });

        c = (ImageButton) findViewById(R.id.mainC);
        final Animation animation2 = AnimationUtils.loadAnimation(this, R.anim.fadein);
        c.startAnimation(animation2);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation3 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.rotation);
                c.startAnimation(animation3);
                Thread timer = new Thread() {
                    public void run() {
                        try{
                            sleep(400);
                        } catch (InterruptedException e){
                            e.printStackTrace();
                        }
                        finally {
                            openActivity(Calculator.class);
                            finish();
                        }
                    }
                };
                timer.start();
            }
        });
    }
    private void openActivity(Class c){
        Intent intent = new Intent(MainActivity.this, c);
        startActivity(intent);
    }
}