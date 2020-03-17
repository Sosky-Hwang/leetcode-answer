package com.sosky;

import java.util.ArrayList;
import java.util.List;

public class Solution4 {
    public static void main(String[] args) {
        //System.out.println(jump(new int[]{1, 1, 1, 1}));
        //System.out.println(jump(new int[]{0}));
        //System.out.println(jump(new int[]{1}));
        System.out.println(jump(new int[]{2, 3, 1, 1, 4}));
        //System.out.println(jump(new int[]{3, 2, 1}));
    }

    private static int jump(int[] nums) {
        List<Integer> result = new ArrayList<>();
        if (nums.length > 1) {
            result.add(0);
            int maxVal = 0;
            int maxIdx = 0;
            for (int i = 0; i < nums.length; i++) {
                if (i < maxIdx || i == nums.length - 1) {
                    continue;
                }
                int val = nums[i];
                boolean done = false;
                if (val > 0 && (i + val <= nums.length - 1)) {
                    for (int j = 1; j <= val; j++) {
                        if ((i + j) > nums.length - 1) {
                            done = true;
                            break;
                        } else if ((i + j) == nums.length - 1) {
                            maxIdx = i + j;
                            maxVal = nums[j];
                            result.add(maxIdx);
                        }
                        if (maxVal < nums[i + j]) {
                            maxIdx = i + j;
                            maxVal = nums[j];
                            result.add(maxIdx);
                        }
                    }
                } else {
                    done = true;
                }
                if (done) {
                    break;
                }
            }
        }
        System.out.println(result);
        return result.size();
    }
}
