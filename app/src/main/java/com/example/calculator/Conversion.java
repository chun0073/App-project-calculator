package com.example.calculator;

public class Conversion {
    private String before, after;
    private String num;

    Conversion(String num, String before, String after){
        this.num = num;
        this.before = before;
        this.after = after;
    }

    public String execution(){
        String result = "";
        switch(before){
            case "Decimal":
                if(after.equals("Hexadecimal")){
                    result = dTo(num,16);
                    break;
                }
                else if(after.equals("Octal")){
                    result = dTo(num,8);
                    break;
                }
                else if(after.equals("Binary")){
                    result = dTo(num,2);
                    break;
                }else{
                    result = num;
                    break;
                }

            case "Hexadecimal":
                if(after.equals("Decimal")){
                    result = toDecimal(16,num);
                    break;
                }
                else if(after.equals("Octal")){
                    String cont = toDecimal(16,num);
                    Conversion container = new Conversion(cont,"Hexadecimal","Octal");
                    result = container.dTo(cont,8);
                    break;
                }
                else if(after.equals("Binary")){
                    String cont = toDecimal(16,num);
                    Conversion container = new Conversion(cont,"Hexadecimal","Binary");
                    result = container.dTo(cont,2);
                    break;
                }else{
                    result = num;
                    break;
                }
            case "Octal":
                if(after.equals("Hexadecimal")){
                    String cont = toDecimal(8,num);
                    Conversion container = new Conversion(cont,"Octal","Hexadecimal");
                    result = container.dTo(cont,16);
                }
                else if(after.equals("Decimal")){
                    result = toDecimal(8,num);
                }
                else if(after.equals("Binary")){
                    String cont = toDecimal(8,num);
                    Conversion container = new Conversion(cont,"Octal","Binary");
                    result = container.dTo(cont,2);
                }else{
                    result = num;
                }
                break;
            case "Binary":
                if(after.equals("Hexadecimal")){
                    String cont = toDecimal(2,num);
                    Conversion container = new Conversion(cont,"Binary","Hexadecimal");
                    result = container.dTo(cont,16);
                }
                else if(after.equals("Octal")){
                    String cont = toDecimal(2,num);
                    Conversion container = new Conversion(cont,"Binary","Octal");
                    result = container.dTo(cont,8);
                }
                else if(after.equals("Decimal")){
                    result = toDecimal(2,num);
                }else{
                    result = num;
                }
                break;
            default:
                break;
        }
        return result;
    }

    private String dTo(String number, int base){
        return dTo_Integer(num,base)+dTo_Fraction(num,base);
    }
    private String dTo_Integer(String number, int base){
        double cont = Double.parseDouble(number);
        int container = (int)(Math.abs(cont));
        String result = "";
        while(container>=base){
            int k = container % base;
            container = (int)(container/base);
            result = abcdef(k) + result;
        }
        if(cont<0.0){
            result = "-"+abcdef(container)+result;
            return result;
        }
        else {
            return abcdef(container) + result;
        }
    }
    private String dTo_Fraction(String number, int base){
        String result="";
        double container = Double.parseDouble(number);
        if(container<0.0){
            container = - container;
        }
        double fraction = container - (int)container;
        if(fraction!=0.0) {
            for (int i = 0; i < 12; i++) {
                fraction = fraction * base;
                int digit = (int) fraction;
                fraction = fraction - digit;
                result += (abcdef(digit));
            }
            result = "."+result;
        }
        else{

        }
        return result;
    }
    private String abcdef(int x){
        String result = "";
        switch(x){
            case 10:
                result = "A";
                break;
            case 11:
                result = "B";
                break;
            case 12:
                result = "C";
                break;
            case 13:
                result = "D";
                break;
            case 14:
                result = "E";
                break;
            case 15:
                result = "F";
                break;
            default:
                result = String.valueOf(x);
        }
        return result;
    }
    //---------------------------------------------------------------------------------------------
    private String toDecimal(int base, String number){
        String result = "";
        int intlen = -1;
        int fralen = -1;
        String sign = ""+number.charAt(0);
        if(sign.equals("-")){
            number = number.substring(1);
        }

        if(number.contains(".")) {
            for(int i=0; i<number.length(); i++){
                intlen++;
                String k = ""+number.charAt(i);
                if(k.equals(".")){
                    break;
                }
            }
            fralen = number.length()-1-intlen;
        }
        else{
            intlen = number.length();
            fralen = 0;
        }

        double intvalue = 0.0;
        if(intlen>1) {
            for (int i = 0; i < intlen; i++) {
                intvalue += fedcba(""+number.charAt(i)) * Math.pow(base, intlen-1-i);
            }
        }
        else if(intlen==1){
            intvalue = fedcba(""+number.charAt(0));
        }
        else{
            intvalue = 0.0;
        }

        double fracValue = 0.0;
        if(fralen>0){
            for(int i=0; i<fralen; i++){
                fracValue += fedcba(""+number.charAt(intlen+1+i))/Math.pow(base,1+i);
            }
        }
        else{
            fracValue = 0.0;
        }

        result = String.valueOf(intvalue+fracValue);
        return result;
    }

    private int fedcba(String c){
        int result = 0;
        switch(c.toUpperCase()){
            case "A":
                result = 10;
                break;
            case "B":
                result = 11;
                break;
            case "C":
                result = 12;
                break;
            case "D":
                result = 13;
                break;
            case "E":
                result = 14;
                break;
            case "F":
                result = 15;
                break;
            default:
                result = Integer.parseInt(c);
                break;
        }
        return result;
    }
    public String display(){
        return num +"TESTING";
    }
}
