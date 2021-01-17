package com.example.calculator;

public class VectorCalculate {
    private VectorV v1,v2,v3;

    VectorCalculate(){}
    VectorCalculate(VectorV v1, VectorV v2, VectorV v3){
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public VectorV vectorAdd(){
        VectorV vR = new VectorV();
        double x = v1.getX()+v2.getX()+v3.getX();
        double y = v1.getY()+v2.getY()+v3.getY();
        vR.setValue(x, y);
        return vR;
    }
    public VectorV vectorDot(){
        VectorV container = new VectorV();
        VectorV vR = new VectorV();
        if(v1.getMag()!=0.0&&v2.getMag()!=0.0&&v3.getMag()!=0.0){
            container = dot(v1,v2);
            vR = dot(container,v3);
        }
        else if(v1.getMag()!=0.0&&v2.getMag()!=0.0&&v3.getMag()==0.0){
            vR = dot(v1,v2);
        }
        else if(v1.getMag()!=0.0&&v2.getMag()==0.0&&v3.getMag()!=0.0){
            vR = dot(v1,v3);
        }
        else if(v1.getMag()==0.0&&v2.getMag()!=0.0&&v3.getMag()==0.0){
            vR = dot(v2,v3);
        }
        else{

        }
        return vR;
    }
    public VectorV dot(VectorV v1, VectorV v2){
        VectorV vR = new VectorV();
        double x = v1.getX()*v2.getX();
        double y = v1.getY()*v2.getY();
        vR.setValue(x,y);
        return vR;
    }
}
