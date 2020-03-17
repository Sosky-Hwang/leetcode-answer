package com.sosky;

public class Solution6 {
    public static void main(String[] args) {
        System.out.println(intToRoman(3));
        System.out.println(intToRoman(4));
        System.out.println(intToRoman(9));
        System.out.println(intToRoman(58));
        System.out.println(intToRoman(1994));
    }

    private static String intToRoman(int num) {
        boolean flag = true;
        StringBuffer result = new StringBuffer();
        while (flag) {
            if (num >= 1000) {
                result.append("M");
                num -= 1000;
            } else if (num >= 900) {
                result.append("CM");
                num -= 900;
            } else if (num >= 500) {
                result.append("D");
                num -= 500;
            } else if (num >= 400) {
                result.append("CD");
                num -= 400;
            } else if (num >= 100) {
                result.append("C");
                num -= 100;
            } else if (num >= 90) {
                result.append("XC");
                num -= 90;
            } else if (num >= 50) {
                result.append("L");
                num -= 50;
            } else if (num >= 40) {
                result.append("XL");
                num -= 40;
            } else if (num >= 10) {
                result.append("X");
                num -= 10;
            } else if (num >= 9) {
                result.append("IX");
                num -= 9;
            } else if (num >= 5) {
                result.append("V");
                num -= 5;
            } else if (num >= 4) {
                result.append("IV");
                num -= 4;
            } else if (num == 3) {
                result.append("III");
                num -= 3;
            } else if (num == 2) {
                result.append("II");
                num -= 2;
            } else if (num == 1) {
                result.append("I");
                num -= 3;
            }
            if (num == 0) {
                flag = false;
            }
        }
        return result.toString();
    }
}
