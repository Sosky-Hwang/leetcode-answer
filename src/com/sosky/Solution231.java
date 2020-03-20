package com.sosky;

/**
 * 给定一个整数，编写一个函数来判断它是否是 2 的幂次方。
 */
public class Solution231 {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(1));
        System.out.println(isPowerOfTwo(2));
        System.out.println(isPowerOfTwo(16));
        System.out.println(isPowerOfTwo(218));
    }

    public static boolean isPowerOfTwo(int n) {
        if (n == 0 || n == -2147483648) {
            return false;
        }
        return Integer.highestOneBit(n) == n;

    }
}
