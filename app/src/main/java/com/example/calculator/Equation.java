package com.example.calculator;

public class Equation {
    private double a,b,c,d,e,r;
    public double D;
    private int n;

    Equation(double a, double b, double c, double r){
        this.n = 2; this.a = a; this.b = b; this.c = c; this.r = r;
        this.D = b*b-4*a*(c-r);
    }
    Equation(double a, double b, double c, double d, double r){
        this.n = 3; this.a = a; this.b = b; this.c = c; this.d = d; this.r = r;
        this.D = b*b*c*c-4*b*b*b*(d-r)-4*c*c*c*a+18*a*b*c*(d-r)-27*a*a*(d-r)*(d-r);
    }
    Equation(double a, double b, double c, double d, double k, double r){
        this.n=4; this.a=a; this.b=b; this.c=c; this.d=d; this.e=k-r; this.r=0;
        this.D = (b*b*c*c*d*d)-(b*b*b*4*d*d*d)-(a*c*c*c*4*d*d)+(a*b*c*18*d*d*d)
                -(a*a*27*d*d*d*d)+(a*a*a*256*e*e*e)-(b*b*4*c*c*c)+(b*b*b*c*18*d*e)
                +(a*16*c*c*c*c*e)-(a*b*c*c*80*d*e)-(a*b*b*6*d*d*e)+(a*a*c*144*d*d*e)
                -(27*b*b*b*b*e*e)+(a*b*b*144*c*e*e)-(a*a*128*c*c*e*e)-(a*a*b*192*d*e*e);
    }
    public String[] solvingQuartic(){
        double k = e-r;
        double P = b/(4*a);
        double Q = 2*c/(3*a);
        double R = c*c-3*b*d+12*a*k;
        double S = 2*c*c-9*b*c*d+27*a*d*d+27*k*b*b-72*a*c*k;
        double T = -b*b*b/(a*a*a)+4*b*c/(a*a)-8*d/a;
        Cplx v1 = new Cplx();
        v1.rt(-4*R*R*R+S*S,2);
        v1.add(S,0.0);
        Cplx v2 = new Cplx();
        v2.rt(v1,3); v2.mult(3*a);
        Cplx v4 = new Cplx(Math.cbrt(2)*R,0.0);
        v4.divd(v2);
        Cplx v3 = new Cplx();
        v3.rt(v1, 3); v3.divd(3*Math.cbrt(2)*a);
        Cplx V = new Cplx(v4);
        V.add(v3);

        Cplx p1 = new Cplx(4*P*P-Q, 0.0);
        p1.add(V);
        Cplx p2 = new Cplx();
        p2.rt(p1,2);

        Cplx p3 = new Cplx(p2);
        p3.divd(-2); p3.sub(P);

        Cplx p4 = new Cplx(p2);
        p4.divd(2); p4.sub(P);

        Cplx p5 = new Cplx(8*P*P-2*Q,0.0); p5.sub(V);
        Cplx p5_1 = new Cplx(T,0.0);
        Cplx p5_2 = new Cplx(p2); p5_2.mult(4);
        p5_1.divd(p5_2);
        p5.sub(p5_1);

        Cplx p6 = new Cplx();
        p6.rt(p5,2); p6.divd(2);

        Cplx x1 = new Cplx(p3); x1.sub(p6);
        Cplx x2 = new Cplx(p3); x2.add(p6);
        Cplx x3 = new Cplx(p4); x3.sub(p6);
        Cplx x4 = new Cplx(p4); x4.add(p6);

        String[] result = new String[4];
        result[0] = x1.convert();
        result[1] = x2.convert();
        result[2] = x3.convert();
        result[3] = x4.convert();

        return  result;
    }
    public String[] solvingCubic(){
        String[] result = new String[3];

        double k = d-r;
        double f1 = 2*b*b*b-9*a*b*c+27*a*a*k;
        double f2 = f1*f1-4*(b*b-3*a*c)*(b*b-3*a*c)*(b*b-3*a*c);
        Cplx x1_1 = new Cplx();
        x1_1.rt(f2,2);
        Cplx x1_2 = new Cplx(f1,0.0);

        Cplx t1_1 = new Cplx(x1_2);
        t1_1.add(x1_1); t1_1.divd(2);
        Cplx t2_1 = new Cplx(x1_2);
        t2_1.sub(x1_1); t2_1.divd(2);
        Cplx t1 = new Cplx();
        t1.rt(t1_1,3);
        Cplx t2 = new Cplx();
        t2.rt(t2_1,3);

        Cplx p1_1 = new Cplx(t1);
        p1_1.divd(3*a);
        Cplx p1_2 = new Cplx(t2);
        p1_2.divd(3*a);

        Cplx x1 = new Cplx(-b/(3*a),0.0);
        x1.sub(p1_1); x1.sub(p1_2);

        Cplx p2_1 = new Cplx(t1);
        Cplx p2_2 = new Cplx(t2);
        Cplx p2_11 = new Cplx(1/(6*a),Math.sqrt(3)/(6*a));
        Cplx p2_12 = new Cplx(1/(6*a),-Math.sqrt(3)/(6*a));
        p2_1.mult(p2_11); p2_2.mult(p2_12);
        Cplx x2 = new Cplx(-b/(3*a),0.0);
        x2.add(p2_1); x2.add(p2_2);

        Cplx p3_1 = new Cplx(t1);
        Cplx p3_2 = new Cplx(t2);
        p3_1.mult(p2_12); p3_2.mult(p2_11);
        Cplx x3 = new Cplx(-b/(3*a),0.0);
        x3.add(p3_1); x3.add(p3_2);

        result[0] = x1.convert();
        result[1] = x2.convert();
        result[2] = x3.convert();
        return result;
    }
    public String[] solvingQuadratic(){
        Cplx c1_1 = new Cplx();
        c1_1.rt(D,2);
        Cplx c1_2 = new Cplx(-b,0.0);
        Cplx c1_3 = new Cplx(2*a,0.0);
        c1_2.add(c1_1); c1_2.divd(c1_3);

        Cplx c2_1 = new Cplx();
        c2_1.rt(D,2);
        Cplx c2_2 = new Cplx(-b,0.0);
        Cplx c2_3 = new Cplx(2*a,0.0);
        c2_2.sub(c2_1); c2_2.divd(c2_3);


        String[] result = new String[2];
        result[0] = c1_2.convert();
        result[1] = c2_2.convert();

        return result;
    }

    public int examD(double D){
        if(this.D>0){
            return n;
        }
        else if(this.D==0){
            return n-1;
        }
        else{
            return n-2;
        }
    }

}

