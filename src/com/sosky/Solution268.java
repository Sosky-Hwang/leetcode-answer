package com.sosky;

import java.util.Arrays;

public class Solution268 {
    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{3, 0, 1}));
        System.out.println(missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}));
    }

    private static int missingNumber(int[] nums) {
        int missNum = 0;
        Arrays.sort(nums);
        if (nums.length > 1) {
            for (int i = 0; i < nums.length; i++) {
                if (i != nums[i]) {
                    missNum = i;
                }
            }
        } else if (nums.length == 1) {
            missNum = nums[0] + 1;
        }
        return missNum;
    }
}
