package com.sosky;

import java.util.Scanner;

public class Solution {

    private static int sum = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int b = in.nextInt();
            sum = 0;
            count(b);
            System.out.println(sum);
        }
    }

    private static int count(int initNum) {
        if (initNum >= 3) {
            int x = initNum / 3;
            int y = initNum % 3;
            sum += x;
            System.out.println("initNum = " + initNum + ", sum = " + sum + ", x= " + x + ", y = " + y);
            int z = (x + y);
            if (z >= 3) {
                count(z);
            } else if (z == 2) {
                sum++;
            }
        }
        return sum;
    }
}
