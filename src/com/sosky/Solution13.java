package com.sosky;

/**
 * 罗马数字包含以下七种字符: I， V， X， L，C，D 和 M。
 * <p>
 * 字符          数值
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * 例如， 罗马数字 2 写做 II ，即为两个并列的 1。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。
 * <p>
 * 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：
 * <p>
 * I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
 * X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
 * C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
 * 给定一个罗马数字，将其转换成整数。输入确保在 1 到 3999 的范围内。
 */
public class Solution13 {
    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("IV"));
        System.out.println(romanToInt("IX"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        char[] chars = s.toCharArray();
        int result = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'M') {
                result += 1000;
                continue;
            }
            if (chars[i] == 'C' && (i + 1) < chars.length && chars[i + 1] == 'M') {
                result += 900;
                i++;
                continue;
            }
            if (chars[i] == 'D') {
                result += 500;
                continue;
            }
            if (chars[i] == 'C' && (i + 1) < chars.length && chars[i + 1] == 'D') {
                result += 400;
                i++;
                continue;
            }
            if (chars[i] == 'C') {
                result += 100;
                continue;
            }
            if (chars[i] == 'X' && (i + 1) < chars.length && chars[i + 1] == 'C') {
                result += 90;
                i++;
                continue;
            }
            if (chars[i] == 'L') {
                result += 50;
                continue;
            }
            if (chars[i] == 'X' && (i + 1) < chars.length && chars[i + 1] == 'L') {
                result += 40;
                i++;
                continue;
            }
            if (chars[i] == 'X') {
                result += 10;
                continue;
            }
            if (chars[i] == 'I' && (i + 1) < chars.length && chars[i + 1] == 'X') {
                result += 9;
                i++;
                continue;
            }
            if (chars[i] == 'V') {
                result += 5;
                continue;
            }
            if (chars[i] == 'I' && (i + 1) < chars.length && chars[i + 1] == 'V') {
                result += 4;
                i++;
                continue;
            }
            if (chars[i] == 'I') {
                result += 1;
            }
        }
        return result;
    }

}
