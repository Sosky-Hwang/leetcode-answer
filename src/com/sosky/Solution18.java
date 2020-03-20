package com.sosky;

import java.util.*;

/**
 * 给定一个包含 n 个整数的数组 nums 和一个目标值 target，判断 nums 中是否存在四个元素 a，b，c 和 d ，使得 a + b + c + d 的值与 target 相等？找出所有满足条件且不重复的四元组。
 * <p>
 * 注意：
 * <p>
 * 答案中不可以包含重复的四元组。
 */
public class Solution18 {
    public static void main(String[] args) {
        //System.out.println(fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0));
        System.out.println(fourSum(new int[]{-5, 5, 4, -3, 0, 0, 4, -2}, 4));
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Set<String> added = new HashSet<>();
        for (int i = 0; i < nums.length - 3; i++) {
            for (int j = i + 1; j < nums.length - 2; j++) {
                for (int k = j + 1; k < nums.length - 1; k++) {
                    for (int l = k + 1; l < nums.length; l++) {
                        if (nums[i] + nums[j] + nums[k] + nums[l] == target) {
                            String str = nums[i] + "," + nums[j] + "," + nums[k] + "," + nums[l];
                            if (!added.contains(str)) {
                                List<Integer> ints = new ArrayList();
                                ints.add(nums[i]);
                                ints.add(nums[j]);
                                ints.add(nums[k]);
                                ints.add(nums[l]);
                                Collections.sort(ints);
                                result.add(ints);
                                added.add(str);
                            }
                        }
                    }
                }
            }
        }
        return result;
    }
}
