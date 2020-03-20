package com.sosky;

/**
 * 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "Let's take LeetCode contest"
 * 输出: "s'teL ekat edoCteeL tsetnoc" 
 * 注意：在字符串中，每个单词由单个空格分隔，并且字符串中不会有任何额外的空格。
 */
public class Solution557 {
    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }

    public static String reverseWords(String s) {
        StringBuffer result = new StringBuffer();
        String[] subStrs = s.split(" ");
        for (int i = 0; i < subStrs.length; i++) {
            char[] chars = subStrs[i].toCharArray();
            int idx = chars.length / 2;
            for (int j = 0; j < idx; j++) {
                char x = chars[j];
                chars[j] = chars[chars.length - 1 - j];
                chars[chars.length - 1 - j] = x;
            }
            result.append(chars).append(" ");
        }
        return result.toString().trim();
    }
}
