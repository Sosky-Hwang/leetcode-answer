package com.sosky;

import java.util.Arrays;

/**
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 */
public class Solution136 {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{2, 2, 1}));
        System.out.println(singleNumber(new int[]{4, 1, 2, 1, 2}));
    }

    public static int singleNumber(int[] nums) {
        int result = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i += 2) {
            if (nums.length > (i + 1) && nums[i] != nums[i + 1]) {
                result = nums[i];
                break;
            } else if (nums.length == (i + 1)) {
                result = nums[i];
            }
        }
        return result;
    }
}
