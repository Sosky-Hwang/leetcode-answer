package com.sosky;

import java.util.Arrays;

/**
 * 给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
 * <p>
 * 说明:
 * <p>
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
 * 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
 * 示例:
 * <p>
 * 输入:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 * <p>
 * 输出: [1,2,2,3,5,6]
 */
public class Solution88 {
    public static void main(String[] args) {
        int[] A = new int[]{1, 2, 3, 0, 0, 0};
        int[] B = new int[]{2, 5, 6};
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));
        merge(A, 3, B, 3);
        System.out.println(Arrays.toString(A));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < nums2.length; i++) {
            for (int j = 0; j < nums1.length; j++) {
                if (nums1[j] > nums2[i]) {
                    int x = nums1[j];
                    nums1[j] = nums2[i];
                    nums2[i] = x;
                }
                if (j == m + i && nums1[j] == 0) {
                    nums1[j] = nums2[i];
                    break;
                }
            }
        }
    }
}
