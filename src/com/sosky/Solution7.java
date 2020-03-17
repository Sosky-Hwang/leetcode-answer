package com.sosky;

/**
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 */
public class Solution7 {
    public static void main(String[] args) {
        System.out.println(reverse(123));
        System.out.println(reverse(-123));
        System.out.println(reverse(120));
        System.out.println(reverse(1534236469));
    }

    private static int reverse(int x) {
        if (x == 0) {
            return 0;
        }
        String num = String.valueOf(x);
        char sign = '+';
        if (x < 0) {
            sign = num.charAt(0);
        } else {
            num = sign + num;
        }
        char[] chars = num.toCharArray();
        char[] result = new char[chars.length];
        result[0] = sign;
        final boolean allBigger = false;
        for (int i = chars.length - 1; i > 0; i--) {
            result[chars.length - i] = chars[i];
        }
        String result2 = String.valueOf(result);
        try {
            return Integer.parseInt(result2);
        } catch (Exception e) {
            return 0;
        }

    }
}
