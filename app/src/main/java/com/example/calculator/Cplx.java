package com.example.calculator;

import java.text.DecimalFormat;

public class Cplx {
    public double r,i;
    private DecimalFormat f = new DecimalFormat("0.######");

    public Cplx(){}

    public Cplx(double r, double i){
        this.r = r;
        this.i = i;
    }
    public Cplx(Cplx c){
        this.r = c.r;
        this.i = c.i;
    }

    public void rt(double k, int a){
        switch(a){
            case 2:
                if(k<0){
                    this.i=Math.sqrt(-k);
                    this.r=0.0;
                }
                else if(k==0.0){
                    this.r=0.0;
                    this.i=0.0;
                }
                else{
                    this.r=Math.sqrt(k);
                    this.i=0.0;
                }
                break;
            case 3:
                this.i=0.0;
                this.r=Math.cbrt(k);
                break;
            default:
                this.r=k;
                this.i=0.0;
                break;
        }
    }

    public void rt(Cplx c, int a){
        double abs = Math.sqrt(c.r*c.r + c.i*c.i);
        double angle;
        switch(a){
            case 2:
                if(c.i==0.0){
                    this.r = Math.sqrt(c.r);
                    this.i = 0.0;
                }
                else if(c.r==0.0){
                    this.r = Math.sqrt(c.i/2);
                    this.i = Math.sqrt(c.i/2);
                }
                else{
                    angle = Math.atan(c.i/c.r)*180/Math.PI;
                    // Might have problems in decision of angle, angle can be two.
                    this.r = Math.sqrt(abs)*Math.cos(angle/2);
                    this.i = Math.sqrt(abs)*Math.sin(angle/2);
                }
                break;
            case 3:
                if(c.i==0.0){
                    this.r = Math.cbrt(c.r);
                    this.i = 0.0;
                }
                else if(c.r==0.0){
                    // Sign can be different with below, should figure out how to define the signs.
                    this.r = Math.sqrt(3)*Math.cbrt(c.i)/2;
                    this.i = Math.cbrt(c.i)/2;
                }
                else{
                    angle = Math.atan(c.i/c.r)*180/Math.PI;
                    // Might have problems in decision of angle, angle can be three.
                    this.r = Math.cbrt(abs)*Math.cos(angle/3);
                    this.i = Math.cbrt(abs)*Math.sin(angle/3);
                }
                break;
        }
    }

    public void add(Cplx c){
        this.r += c.r;
        this.i += c.i;
    }
    public void add(double r, double i){
        this.r += r;
        this.i += i;
    }

    public void sub(Cplx c){
        this.r -= c.r;
        this.i -= c.i;
    }
    public void sub(double x){
        this.r = this.r-x;
    }

    public void mult(Cplx c){
        this.r = this.r*c.r-this.i*c.i;
        this.i = this.r*c.i+this.i*c.r;
    }
    public void mult(double x){
        this.r = this.r*x;
        this.i = this.i*x;
    }

    public void divd(Cplx c){
        if(c.r==0.0){

        }
        else{
            this.r = (this.r*c.r+this.i*c.i)/(c.r*c.r+c.i*c.i);
            this.i = (this.i*c.r-this.r*c.i)/(c.r*c.r+c.i*c.i);
        }
    }
    public void divd(double x){
        if(x!=0.0){
            this.r = this.r/x;
            this.i = this.i/x;
        }
    }

    public String convert(){
        String result;

        if(this.i==0.0){
            result = f.format(r);
        }
        else{
            result = f.format(r)+"+"+" "+f.format(i)+"i";
        }

        return result;
    }
}
