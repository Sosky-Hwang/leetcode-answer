package com.sosky;

/**
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 * <p>
 * 如果你最多只允许完成一笔交易（即买入和卖出一支股票），设计一个算法来计算你所能获取的最大利润。
 * <p>
 * 注意你不能在买入股票前卖出股票。
 */
public class Solution121 {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{2, 4, 1}));
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(maxProfit(new int[]{7, 6, 4, 3, 1}));
    }

    public static int maxProfit(int[] prices) {
        int result = 0;
        if (prices != null && prices.length > 1) {
            int min = prices[0];
            int minIdx = 0;
            int max = 0;
            int maxIdx = 0;
            for (int i = 0; i < prices.length; i++) {
                if (min > prices[i]) {
                    min = prices[i];
                    minIdx = i;
                } else {
                    maxIdx = i;
                }
                if (minIdx < maxIdx) {
                    break;
                }
            }
            if (minIdx < prices.length - 1) {
                for (int i = minIdx; i < prices.length; i++) {
                    if (max < prices[i]) {
                        max = prices[i];
                    }
                }
                result = max - min;
            }
        }
        return result;
    }
}
