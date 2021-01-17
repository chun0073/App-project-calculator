package com.example.calculator;

import java.text.DecimalFormat;

public class VectorV {
    private double mag, angle, angle_v;
    private double x, y;
    private int n;

    VectorV(){}
    VectorV(VectorV v){
        this.mag = v.getMag();
        this.angle = v.getAngle();
        this.angle_v = v.getAngle_v();
        decompose();
    }
    VectorV(String magnitude, String angle){
        try {
            this.mag = Double.parseDouble(magnitude);
            this.angle = Double.parseDouble(angle);
            if(this.angle>360){
                this.angle = this.angle - 360;
            }
            else if(this.angle<0.0){
                this.angle = 360+this.angle;
            }
        }
        catch (NumberFormatException e){
            this.mag = 0.0;
            this.angle = 0.0;
        }
        decompose();
    }

    public void decompose(){
        determineN();
        switch(this.n){
            case 1:
                x = this.mag * Math.cos(Math.toRadians(angle_v));
                y = this.mag * Math.sin(Math.toRadians(angle_v));
                break;
            case 2:
                x = -this.mag * Math.sin(Math.toRadians(angle_v));
                y = this.mag * Math.cos(Math.toRadians(angle_v));
                break;
            case 3:
                x = -this.mag * Math.cos(Math.toRadians(angle_v));
                y = -this.mag * Math.sin(Math.toRadians(angle_v));
                break;
            case 4:
                x = this.mag * Math.sin(Math.toRadians(angle_v));
                y = -this.mag * Math.cos(Math.toRadians(angle_v));
                break;
            case 5:
                x = this.mag;
                y = 0.0;
                break;
            case 6:
                x = 0.0;
                y = this.mag;
                break;
            case 7:
                x = -this.mag;
                y = 0.0;
                break;
            case 8:
                x = 0.0;
                y = -this.mag;
            default:
                break;
        }
    }

    private void determineN(){
        if(angle>0&&angle<90){
            n = 1;
            this.angle_v = this.angle;
        }
        else if(angle>90&&angle<180){
            n = 2;
            this.angle_v = this.angle-90;
        }
        else if(angle>180&&angle<270){
            n = 3;
            this.angle_v = this.angle-180;
        }
        else if(angle>270&&angle<360){
            n = 4;
            this.angle_v = this.angle-270;
        }
        else if(angle==0.0){
            n = 5;
            this.angle_v = 0.0;
        }
        else if(angle==90.0){
            n = 6;
            this.angle_v = 90.0;
        }
        else if(angle==180.0){
            n = 7;
            this.angle_v = 0.0;
        }
        else if(angle==270.0){
            n = 8;
            this.angle_v = -90.0;
        }
    }

    public double getMag(){
        return mag;
    }
    public double getAngle(){
        return angle;
    }
    public double getAngle_v(){
        return angle_v;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public int getN(){
        return n;
    }

    public void setValue(double x, double y){
        this.x = x;
        this.y = y;
        this.mag = Math.sqrt(x*x+y*y);
        if(this.x<0.0&&this.y<0.0){
            this.n=3;
            this.angle = 180+Math.toDegrees(Math.atan(Math.abs(y/x)));
        }
        else if(this.x>0.0&&this.y>0.0){
            this.n=1;
            this.angle = Math.toDegrees(Math.atan(Math.abs(y/x)));
        }
        else if(this.x<0.0&&this.y>0.0){
            this.n=2;
            this.angle = 180-Math.toDegrees(Math.atan(Math.abs(y/x)));
        }
        else if(this.x>0.0&&this.y<0.0){
            this.n=4;
            this.angle = 360-Math.toDegrees(Math.atan(Math.abs(y/x)));
        }
        else if(this.x==0.0){
            this.n=0;
            this.angle = 90.0;
        }
        else if(this.y==0.0){
            this.n=0;
            this.angle=0.0;
        }

    }
}
