package com.sosky;

/**
 * 给定长度为 n 的整数数组 nums，其中 n > 1，返回输出数组 output ，其中 output[i] 等于 nums 中除 nums[i] 之外其余各元素的乘积。
 * <p>
 * 示例:
 * <p>
 * 输入: [1,2,3,4]
 * 输出: [24,12,8,6]
 * 说明: 请不要使用除法，且在 O(n) 时间复杂度内完成此题。
 */
public class Solution238 {
    public static void main(String[] args) {
        System.out.println(productExceptSelf(new int[]{1, 2, 3, 4}));
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int sum = 1;
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    sum *= nums[j];
                }
            }
            result[i] = sum;
        }
        return result;
    }
}
