package com.sosky;

/**
 * 给定两个整数，被除数 dividend 和除数 divisor。将两数相除，要求不使用乘法、除法和 mod 运算符。
 * <p>
 * 返回被除数 dividend 除以除数 divisor 得到的商。
 */
public class Solution29 {
    public static void main(String[] args) {
        //System.out.println(divide(10, 3));
        //System.out.println(divide(7, -3));
        //System.out.println(divide(-2147483648, -1));
        //System.out.println(divide(-2147483648, 1));
        System.out.println(divide(-2147483648, 2));
    }

    private static int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE) {
            if (divisor == 1) {
                return Integer.MIN_VALUE;
            } else if (divisor == -1) {
                return Integer.MAX_VALUE;
            }
        }
        if (dividend == Integer.MAX_VALUE) {
            if (divisor == 1) {
                return Integer.MAX_VALUE;
            } else if (divisor == -1) {
                return Integer.MIN_VALUE;
            }
        }
        boolean isNegtive = false;
        if (dividend > 0 && divisor < 0) {
            isNegtive = true;
        }
        if (dividend < 0 && divisor > 0) {
            isNegtive = true;
        }
        dividend = dividend < 0 ? (0 - dividend) : dividend;
        divisor = divisor < 0 ? (0 - divisor) : divisor;
        if (dividend == Integer.MIN_VALUE && divisor > 0) {
            divisor = (0 - divisor);
        }
        int result = 0;
        if (divisor > 1) {
            while (dividend >= divisor || dividend <= divisor) {
                dividend -= divisor;
                result++;
            }
        } else {
            result = dividend;
        }
        return isNegtive ? (0 - result) : result;
    }

}
