package com.sosky;

import java.util.*;

/**
 * 给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。
 * <p>
 * 注意：答案中不可以包含重复的三元组。
 */
public class Solution15 {
    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Set<String> added = new HashSet<>();
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = i + 2; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        String str1 = nums[i] + "," + nums[j] + "," + nums[k];
                        String str2 = nums[i] + "," + nums[k] + "," + nums[j];
                        String str3 = nums[j] + "," + nums[i] + "," + nums[k];
                        String str4 = nums[j] + "," + nums[k] + "," + nums[i];
                        String str5 = nums[k] + "," + nums[i] + "," + nums[j];
                        String str6 = nums[k] + "," + nums[j] + "," + nums[i];
                        if (!added.contains(str1) && !added.contains(str2) && !added.contains(str3) && !added.contains(str4)
                                && !added.contains(str5) && !added.contains(str6)) {
                            List<Integer> ints = new ArrayList();
                            ints.add(nums[i]);
                            ints.add(nums[j]);
                            ints.add(nums[k]);
                            Collections.sort(ints);
                            result.add(ints);
                            added.add(str1);
                            added.add(str2);
                            added.add(str3);
                            added.add(str4);
                            added.add(str5);
                            added.add(str6);
                        }
                    }
                }
            }
        }
        return result;
    }
}
