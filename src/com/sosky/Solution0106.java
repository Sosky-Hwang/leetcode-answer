package com.sosky;

/**
 * 字符串压缩。利用字符重复出现的次数，编写一种方法，实现基本的字符串压缩功能。比如，字符串aabcccccaaa会变为a2b1c5a3。若“压缩”后的字符串没有变短，则返回原先的字符串。你可以假设字符串中只包含大小写英文字母（a至z）。
 */
public class Solution0106 {
    public static void main(String[] args) {
        System.out.println(compressString("aabcccccaaa"));
        System.out.println(compressString("abbccd"));
    }

    public static String compressString(String S) {
        if (S == null || "".equals(S)) {
            return "";
        }
        StringBuffer sb = new StringBuffer();
        char[] chars = S.toCharArray();
        char target = chars[0];
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == target) {
                count++;
            } else {
                sb.append(target).append(count);
                target = chars[i];
                count = 1;
            }
            if (i == chars.length - 1) {
                sb.append(target).append(count);
            }
        }

        return S.length() > sb.length() ? sb.toString() : S;
    }
}
