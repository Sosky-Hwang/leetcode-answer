package com.sosky;

/**
 * 给定两个字符串, A 和 B。
 * <p>
 * A 的旋转操作就是将 A 最左边的字符移动到最右边。 例如, 若 A = 'abcde'，在移动一次之后结果就是'bcdea' 。如果在若干次旋转操作之后，A 能变成B，那么返回True。
 */
public class Solution796 {
    public static void main(String[] args) {
        System.out.println(rotateString("abcde", "cdeab"));
        System.out.println(rotateString("abcde", "abced"));
    }

    private static boolean rotateString(String A, String B) {
        boolean result = false;
        if (!A.equals(B)) {
            for (int i = 0; i < A.length(); i++) {
                char first = A.charAt(0);
                A = A.substring(1).concat(String.valueOf(first));
                if (A.equals(B)) {
                    result = true;
                    break;
                }
            }
        } else {
            result = true;
        }
        return result;
    }

}
