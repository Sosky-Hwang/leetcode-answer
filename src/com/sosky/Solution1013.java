package com.sosky;

/**
 * 给你一个整数数组 A，只有可以将其划分为三个和相等的非空部分时才返回 true，否则返回 false。
 * <p>
 * 形式上，如果可以找出索引 i+1 < j 且满足 (A[0] + A[1] + ... + A[i] == A[i+1] + A[i+2] + ... + A[j-1] == A[j] + A[j-1] + ... + A[A.length - 1]) 就可以将数组三等分。
 */
public class Solution1013 {
    public static void main(String[] args) {
        System.out.println(canThreePartsEqualSum(new int[]{0, 2, 1, -6, 6, -7, 9, 1, 2, 0, 1}));
        System.out.println(canThreePartsEqualSum(new int[]{0, 2, 1, -6, 6, 7, 9, -1, 2, 0, 1}));
        System.out.println(canThreePartsEqualSum(new int[]{3, 3, 6, 5, -2, 2, 5, 1, -9, 4}));
    }

    public static boolean canThreePartsEqualSum(int[] A) {
        boolean result = false;
        int sum1 = 0;
        for (int i = 0; i < A.length - 2; i++) {
            sum1 += A[i];
            int sum2 = 0;
            for (int j = i + 1; j < A.length - 1; j++) {
                sum2 += A[j];
                int sum3 = 0;
                for (int k = j + 1; k < A.length; k++) {
                    sum3 += A[k];
                }
                if (sum1 == sum2 && sum2 == sum3) {
                    result = true;
                    break;
                }
            }
            if (result) {
                break;
            }
        }
        return result;
    }
}
