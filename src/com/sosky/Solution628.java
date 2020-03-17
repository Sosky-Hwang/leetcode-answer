package com.sosky;

import java.util.Arrays;

/**
 * 给定一个整型数组，在数组中找出由三个数组成的最大乘积，并输出这个乘积。
 */
public class Solution628 {
    public static void main(String[] args) {
        System.out.println(maximumProduct(new int[]{1, 2, 3}));
        System.out.println(maximumProduct(new int[]{1, 2, 3, 4}));
        System.out.println(maximumProduct(new int[]{-4, -3, -2, -1, 60}));
        System.out.println(maximumProduct(new int[]{-3, -2, -1}));
        System.out.println(maximumProduct(new int[]{-710, -107, -851, 657, -14, -859, 278, -182, -749, 718, -640, 127, -930, -462, 694, 969, 143, 309, 904, -651, 160, 451, -159, -316, 844, -60, 611, -169, -73, 721, -902, 338, -20, -890, -819, -644, 107, 404, 150, -219, 459, -324, -385, -118, -307, 993, 202, -147, 62, -94, -976, -329, 689, 870, 532, -686, 371, -850, -186, 87, 878, 989, -822, -350, -948, -412, 161, -88, -509, 836, -207, -60, 771, 516, -287, -366, -512, 509, 904, -459, 683, -563, -766, -837, -333, 93, 893, 303, 908, 532, -206, 990, 280, 826, -13, 115, -732, 525, -939, -787}));
    }

    private static int maximumProduct(int[] nums) {
        int result = 0;
        if (nums != null && nums.length >= 3) {
            boolean negtive = false;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] < 0) {
                    negtive = true;
                    break;
                }
            }
            Arrays.sort(nums);
            if (negtive) {
                result = nums[nums.length - 1] * nums[0] * nums[1];
            }
            int ex = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
            if (ex > result) {
                result = ex;
            }
        }
        return result;
    }

}
