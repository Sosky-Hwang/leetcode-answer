package com.sosky;

/**
 * 外观数列」是一个整数序列，从数字 1 开始，序列中的每一项都是对前一项的描述。前五项如下：
 * <p>
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 1 被读作  "one 1"  ("一个一") , 即 11。
 * 11 被读作 "two 1s" ("两个一"）, 即 21。
 * 21 被读作 "one 2",  "one 1" （"一个二" ,  "一个一") , 即 1211。
 * <p>
 * 给定一个正整数 n（1 ≤ n ≤ 30），输出外观数列的第 n 项。
 * <p>
 * 注意：整数序列中的每一项将表示为一个字符串。
 */
public class Solution38 {
    public static void main(String[] args) {
        System.out.println(countAndSay(1));
        System.out.println(countAndSay(4));
    }

    public static String countAndSay(int n) {
        StringBuffer result = new StringBuffer();
        result.append(1);
        if (n > 1) {
            for (int i = 2; i <= n; i++) {

            }
        }
        return result.toString();
    }
}
