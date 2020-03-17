package com.sosky;

public class Solution2 {

    public static int sum = 0;

    public static void main(String[] args) {
        System.out.println(diStringMatch("IDDD"));
    }

    private static int[] diStringMatch(String S) {
        int[] arr = new int[S.length() + 1];
        if (S.startsWith("I")) {
            for (int i = 0; i <= S.length(); i++) {
                arr[i] = i;
            }
        } else {
            for (int i = 0; i <= S.length(); i++) {
                arr[i] = S.length() - i;
            }
        }
        printArray(arr);
        char[] chars = S.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'I') {
                if (arr[i] > arr[i + 1]) {
                    int x = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = x;
                }
                for (int j = (i + 1); j < chars.length; j++) {
                    if (chars[j] == 'I' && arr[i] > arr[j + 1]) {
                        int x = arr[i];
                        arr[i] = arr[j + 1];
                        arr[j + 1] = x;
                    } else if (chars[j] == 'D') {
                        break;
                    }
                }
            } else {
                if (arr[i] < arr[i + 1]) {
                    int x = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = x;
                }
                for (int j = (i - 1); j > 0; j--) {
                    if (chars[j] == 'D' && arr[j] < arr[j + 1]) {
                        int x = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = x;
                    } else if (chars[j] == 'I') {
                        break;
                    }
                }
            }
            printArray(arr);
        }
        return arr;
    }

    private static void printArray(int[] aa) {
        for (int i = 0; i < aa.length; i++) {
            System.out.print(aa[i]);
        }
        System.out.println();
    }
}
