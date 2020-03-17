package com.sosky;

import java.util.Arrays;

/**
 * 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 * <p>
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 */
public class Solution169 {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{-1, 1, 1, 1, 2, 1}));
        System.out.println(majorityElement(new int[]{6, 5, 5}));
        System.out.println(majorityElement(new int[]{3, 2, 3}));
        System.out.println(majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }

    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int result = nums[0];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == result) {
                count++;
            } else {
                if (count > nums.length / 2) {
                    break;
                } else {
                    result = nums[i];
                    count = 1;
                }
            }
        }
        return result;
    }
}
