package com.sosky;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * <p>
 * 如果不存在公共前缀，返回空字符串 ""。
 */
public class Solution14 {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"c", "c"}));
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        System.out.println(longestCommonPrefix(new String[]{"dog", "racecar", "car"}));

    }

    private static String longestCommonPrefix(String[] strs) {
        String result = "";
        if (strs != null && strs.length > 0) {
            if (strs.length > 1) {
                for (int i = 1; i <= strs[0].length(); i++) {
                    String commonPrefix = strs[0].substring(0, i);
                    boolean allMatched = true;
                    for (int j = 1; j < strs.length; j++) {
                        if (!strs[j].startsWith(commonPrefix)) {
                            allMatched = false;
                            break;
                        }
                    }
                    if (allMatched) {
                        result = commonPrefix;
                    }
                }
            } else {
                result = strs[0];
            }
        }
        return result;
    }
}
