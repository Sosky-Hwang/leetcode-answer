package com.sosky;

import java.util.Arrays;

/**
 * 给定不同面额的硬币 coins 和一个总金额 amount。编写一个函数来计算可以凑成总金额所需的最少的硬币个数。如果没有任何一种硬币组合能组成总金额，返回 -1。
 */
public class Solution322 {
    public static void main(String[] args) {
        System.out.println(coinChange(new int[]{186, 419, 83, 408}, 6249));
        System.out.println(coinChange(new int[]{1, 2, 5}, 11));
        System.out.println(coinChange(new int[]{2}, 3));
    }

    public static int coinChange(int[] coins, int amount) {
        if (amount == 0) {
            return 0;
        }
        int result = 0;
        Arrays.sort(coins);
        int y = coins.length - 1;
        while (true) {
            int amt = amount;
            for (int i = y; i >= 0; i--) {
                int x = amt / coins[i];
                amt -= coins[i] * x;
                result += x;
            }
            if (y > 0 && amt > 0) {
                y--;
                result = 0;
                continue;
            }
            if (result == 0 || amt != 0) {
                result = -1;
                break;
            }
            if (result > 0 && amt == 0) {
                break;
            }
        }
        return result;
    }
}
