package com.sosky;

/**
 * 对于字符串 S 和 T，只有在 S = T + ... + T（T 与自身连接 1 次或多次）时，我们才认定 “T 能除尽 S”。
 * <p>
 * 返回最长字符串 X，要求满足 X 能除尽 str1 且 X 能除尽 str2。
 */
public class Solution1071 {
    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABCABC", "ABC"));
        System.out.println(gcdOfStrings("ABABAB", "ABAB"));
        System.out.println(gcdOfStrings("LEET", "CODE"));
    }

    public static String gcdOfStrings(String str1, String str2) {
        String result = "";
        if (str1 != null && str2 != null) {
            for (int i = str2.length(); i > 0; i--) {
                String sub = str2.substring(0, i);
                if (str1.equals(sub.repeat(str1.length() / i)) && str2.equals(sub.repeat(str2.length() / i))) {
                    result = sub;
                }
                if (!"".equals(result)) {
                    break;
                }
            }
        }
        return result;
    }
}
