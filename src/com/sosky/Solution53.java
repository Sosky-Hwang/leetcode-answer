package com.sosky;

/**
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * <p>
 * 示例:
 * <p>
 * 输入: [-2,1,-3,4,-1,2,1,-5,4],
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 * 进阶:
 * <p>
 * 如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的分治法求解。
 */
public class Solution53 {
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    public static int maxSubArray(int[] nums) {
        int result = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int sum = nums[i];
            if (sum > result) {
                result = sum;
            }
            for (int j = i + 1; j < nums.length; j++) {
                sum += nums[j];
                if (sum > result) {
                    result = sum;
                }
            }
        }
        return result;
    }
}
