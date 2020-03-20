package com.sosky;

/**
 * 实现 strStr() 函数。
 * <p>
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 */
public class Solution28 {
    public static void main(String[] args) {
        System.out.println(strStr("mississippi", "a"));
        System.out.println(strStr("hello", "ll"));
        System.out.println(strStr("aaaaa", "bba"));
    }

    public static int strStr(String haystack, String needle) {
        if ((haystack == null || haystack.length() == 0) && needle.length() > 0) {
            return -1;
        } else if (needle.length() == 0) {
            return 0;
        }
        int result = 0;
        char[] haystacks = haystack.toCharArray();
        char[] needles = needle.toCharArray();
        boolean allMatch = true;
        for (int i = 0; i < haystacks.length; i++) {
            if (i <= haystacks.length - needles.length) {
                for (int j = 0; j < needles.length; j++) {
                    if (haystacks[i + j] != needles[j]) {
                        allMatch = false;
                        break;
                    }
                }
                if (!allMatch) {
                    if (i == haystacks.length - 1) {
                        result = -1;
                        break;
                    }
                    allMatch = true;
                    continue;
                } else {
                    result = i;
                    break;
                }
            } else {
                result = -1;
                break;
            }
        }
        return result;
    }
}
