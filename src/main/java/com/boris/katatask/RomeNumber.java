package com.boris.katatask;

public class RomeNumber {
    public static String romeNumber(int number) {

        StringBuilder romeNumber = new StringBuilder();

        switch (number/10) {
            case 10:
                romeNumber.append("C");
                break;
            case 9:
                romeNumber.append("XC");
                break;
            case 8:
                romeNumber.append("LXXX");
                break;
            case 7:
                romeNumber.append("LXX");
                break;
            case 6:
                romeNumber.append("LX");
                break;
            case 5:
                romeNumber.append("L");
                break;
            case 4:
                romeNumber.append("XL");
                break;
            case 3:
                romeNumber.append("XXX");
                break;
            case 2:
                romeNumber.append("XX");
                break;
            case 1:
                romeNumber.append("X");
                break;
        }
        switch (number%10) {
            case 9:
                romeNumber.append("IX");
                break;
            case 8:
                romeNumber.append("VIII");
                break;
            case 7:
                romeNumber.append("VII");
                break;
            case 6:
                romeNumber.append("VI");
                break;
            case 5:
                romeNumber.append("V");
                break;
            case 4:
                romeNumber.append("IV");
                break;
            case 3:
                romeNumber.append("III");
                break;
            case 2:
                romeNumber.append("II");
                break;
            case 1:
                romeNumber.append("I");
                break;
        }

        return romeNumber.toString();
    }
}