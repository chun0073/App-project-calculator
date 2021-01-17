package com.example.calculator;

public class IEEE754 {
    private double num = 0;
    private String mantissa;
    IEEE754(double num) {
        this.num = num;
    }

    public void setNum(double num) {
        this.num = num;
    }

    public String convertDtoB_16bits() {
        return integerNumbers(num) + "." + floatingNumbers(num, 0);
    }

    public String integerNumbers(double num) {
        double decimal = Math.abs(num);
        String result1 = "";
        int container = 0;
        int i = 0;
        for (; i < (int) (Math.log(Math.abs(num)) / Math.log(2)) + 1; i++) {
            container = (int) (decimal % 2);
            decimal = decimal / 2;
            result1 = String.valueOf(container) + result1;
        }
        return result1;
    }

    private String floatingNumbers(double num, int k) {
        double decimal = Math.abs(num);
        double remainder = decimal - (int) decimal;
        String result2 = "";
        int i = (int) (Math.log(Math.abs(num)) / Math.log(2)) + 1;
        int u = k > 1 ? k : 15 - i;

        for (int j = 0; j < u; j++) {
            remainder = remainder * 2;
            int y = (int) remainder;
            if (remainder >= 1) {
                remainder = remainder - 1;
            }
            result2 = result2 + y;
        }
        return result2;
    }

    public String iEEE754Binary() {
        int sign2 = num < 0 ? 1 : 0;
        String binary = integerNumbers(num) + floatingNumbers(num, 26);
        int bit_8 = 128;
        int k = floatingNumbers(num,26).indexOf("1");

        mantissa = binary.substring(1);

        if (num >= 0.1 && num < 1) {
            bit_8 = 127 - k-1;
            mantissa = binary.substring(k+1);
        }
        else if(num <0.1&& num>0){
            bit_8 = 127-k-1;
            mantissa = binary.substring(k-1);
        }
        else {
            bit_8 = 127 + integerNumbers(num).length() - 1;
        }
        int bit8format = Integer.valueOf(integerNumbers(bit_8));

        String format = String.format("%d"+"%08d"+"%S",sign2,bit8format,mantissa);
        return format.substring(0,32);

    }

    public String iEEE754Hexa(){
        String container = iEEE754Binary();
        String hexa1 = hexaConvert(container.substring(0,4));
        String hexa2 = hexaConvert(container.substring(4,8));
        String hexa3 = hexaConvert(container.substring(8,12));
        String hexa4 = hexaConvert(container.substring(12,16));
        String hexa5 = hexaConvert(container.substring(16,20));
        String hexa6 = hexaConvert(container.substring(20,24));
        String hexa7 = hexaConvert(container.substring(24,28));
        String hexa8 = hexaConvert(container.substring(28,32));

        return (hexa1+hexa2+hexa3+hexa4+hexa5+hexa6+hexa7+hexa8);
    }
    private String hexaConvert(String hexa){
        String container = "";
        switch(hexa){
            case "0000":
                container = "0";
                break;
            case "0001":
                container = "1";
                break;
            case "0010":
                container = "2";
                break;
            case "0011":
                container = "3";
                break;
            case "0100":
                container = "4";
                break;
            case "0101":
                container = "5";
                break;
            case "0110":
                container = "6";
                break;
            case "0111":
                container = "7";
                break;
            case "1000":
                container = "8";
                break;
            case "1001":
                container = "9";
                break;
            case "1010":
                container = "A";
                break;
            case "1011":
                container = "B";
                break;
            case "1100":
                container = "C";
                break;
            case "1101":
                container = "D";
                break;
            case "1110":
                container = "E";
                break;
            case "1111":
                container = "F";
                break;
        }
        return container;
    }
}