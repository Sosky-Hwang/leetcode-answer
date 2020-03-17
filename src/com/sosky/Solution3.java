package com.sosky;

public class Solution3 {
    public static void main(String[] args) {
        System.out.println(removeDuplicateLetters("bcabc"));
        System.out.println(removeDuplicateLetters("cbacdcbc"));
    }

    private static String removeDuplicateLetters(String s) {
        char[] chars = s.toCharArray();
        char[] chars1 = chars.clone();
        for (int i = 0; i < chars.length; i++) {
            boolean removeFlag = false;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] < chars[j]) {
                    removeFlag = true;
                } else if (chars[i] == chars[j]) {
                    if (removeFlag) {
                        chars1[j] = ' ';
                    } else {

                    }
                } else {

                }
            }
        }
        return "";
    }
}
