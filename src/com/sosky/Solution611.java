package com.sosky;

import java.util.ArrayList;
import java.util.List;

public class Solution611 {
    public static void main(String[] args) {
        System.out.println(triangleNumber(new int[]{2, 2, 3, 4}));
    }

    private static int triangleNumber(int[] nums) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int x = nums[i - 1];
                int y = nums[i];
                int z = nums[j];
                if ((x + y) > z && (x + z) > y && (y + z) > x) {
                    result.add(x + "," + y + "," + z);
                }
            }
        }
        for (String str : result
        ) {
            System.out.println(str);
        }
        return result.size();
    }

}
