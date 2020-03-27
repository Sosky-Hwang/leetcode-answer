package com.sosky;

import java.util.Arrays;

/**
 * Project: leetcode-answer
 * FileName:卡牌分组
 * Desc:给定一副牌，每张牌上都写着一个整数。
 * <p>
 * 此时，你需要选定一个数字 X，使我们可以将整副牌按下述规则分成 1 组或更多组：
 * <p>
 * 每组都有 X 张牌。
 * 组内所有的牌上都写着相同的整数。
 * 仅当你可选的 X >= 2 时返回 true。
 * <p>
 * Author: huanghuanlong_kzx
 * Date: 2020/3/27 8:30
 * Version: 1.0.0
 */
public class Solution914 {
    public static void main(String[] args) {
        System.out.println(hasGroupsSizeX(new int[]{1, 2, 3, 4, 4, 3, 2, 1}));
        System.out.println(hasGroupsSizeX(new int[]{1, 1, 1, 2, 2, 2, 3, 3}));
        System.out.println(hasGroupsSizeX(new int[]{1}));
        System.out.println(hasGroupsSizeX(new int[]{1, 1}));
        System.out.println(hasGroupsSizeX(new int[]{1, 1, 2, 2, 2, 2}));
    }

    private static boolean hasGroupsSizeX(int[] deck) {
        boolean result = false;
        if (deck.length > 1) {
            Arrays.sort(deck);
            for (int i = 2; i <= deck.length; i++) {
                if (deck.length % i != 0) {
                    continue;
                }
                boolean allMatch = true;
                for (int j = 0; j < deck.length; j = j + i) {
                    for (int k = j; k < j + i - 1; k++) {
                        if (deck[k] != deck[k + 1]) {
                            allMatch = false;
                            break;
                        }
                    }
                    if (!allMatch) {
                        break;
                    }
                }
                if (allMatch) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }
}
