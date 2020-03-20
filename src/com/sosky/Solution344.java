package com.sosky;

/**
 * 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。
 * <p>
 * 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
 * <p>
 * 你可以假设数组中的所有字符都是 ASCII 码表中的可打印字符。
 */
public class Solution344 {
    public static void main(String[] args) {
        char[] chars1 = new char[]{'h', 'e', 'l', 'l', 'o'};
        System.out.println(chars1);
        reverseString(chars1);
        System.out.println(chars1);
        char[] chars2 = new char[]{'H', 'a', 'n', 'n', 'a', 'h'};
        System.out.println(chars2);
        reverseString(chars2);
        System.out.println(chars2);
    }

    public static void reverseString(char[] s) {
        if (s != null && s.length > 1) {
            int idx = s.length / 2;
            for (int i = 0; i < idx; i++) {
                char x = s[i];
                s[i] = s[s.length - 1 - i];
                s[s.length - 1 - i] = x;
            }
        }
    }
}
