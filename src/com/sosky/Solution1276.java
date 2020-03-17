package com.sosky;

import java.util.ArrayList;
import java.util.List;

public class Solution1276 {
    public static void main(String[] args) {
        System.out.println(numOfBurgers(16, 7));
        System.out.println(numOfBurgers(17, 4));
        System.out.println(numOfBurgers(4, 17));
        System.out.println(numOfBurgers(0, 0));
        System.out.println(numOfBurgers(2, 1));
    }

    private static List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
        List<Integer> result = new ArrayList<>();
        int jumboMax = tomatoSlices / 4;
        int smallMax = tomatoSlices / 2;
        for (int i = jumboMax; i >= 0; i--) {
            for (int j = smallMax; j >= 0; j--) {
                if (tomatoSlices == (i * 4 + j * 2) && cheeseSlices == (i + j)) {
                    result.add(i);
                    result.add(j);
                    break;
                }
            }
        }
        return result;
    }

}
