package com.sosky;

import java.util.Arrays;

/**
 * 给定两个排序后的数组 A 和 B，其中 A 的末端有足够的缓冲空间容纳 B。 编写一个方法，将 B 合并入 A 并排序。
 * <p>
 * 初始化 A 和 B 的元素数量分别为 m 和 n。
 * <p>
 * 示例:
 * <p>
 * 输入:
 * A = [1,2,3,0,0,0], m = 3
 * B = [2,5,6],       n = 3
 * <p>
 * 输出: [1,2,2,3,5,6]
 */
public class Solution0303 {
    public static void main(String[] args) {
//        int[] A = new int[]{1, 2, 3, 0, 0, 0};
//        int[] B = new int[]{2, 5, 6};
//        System.out.println(Arrays.toString(A));
//        System.out.println(Arrays.toString(B));
//        merge(A, 3, B, 3);
//        System.out.println(Arrays.toString(A));

        int[] A = new int[]{-1, 0, 0, 3, 3, 3, 0, 0, 0};
        int[] B = new int[]{1, 2, 2};
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));
        merge(A, 6, B, 3);
        System.out.println(Arrays.toString(A));
    }

    public static void merge(int[] A, int m, int[] B, int n) {
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < A.length; j++) {
                if (A[j] > B[i]) {
                    int x = A[j];
                    A[j] = B[i];
                    B[i] = x;
                }
                if (j == m + i && A[j] == 0) {
                    A[j] = B[i];
                    break;
                }
            }
        }
    }
}
