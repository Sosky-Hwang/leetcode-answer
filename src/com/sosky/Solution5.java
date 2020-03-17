package com.sosky;

import java.util.ArrayList;
import java.util.List;

public class Solution5 {
    public static void main(String[] args) {
//        System.out.println(numberToWords(0));
        System.out.println(numberToWords(1000000));
        System.out.println(numberToWords(123));
        System.out.println(numberToWords(12345));
        System.out.println(numberToWords(1234567));
        System.out.println(numberToWords(1234567891));
    }

    private static String numberToWords(int num) {
        String[] NUMBERS = {"Zero", "One ", "Two ", "Three ", "Four ", "Five ", "Six ", "Seven ", "Eight ", "Nine ", "Ten ", "Eleven ", "Twelve ", "Thirteen ", "Fourteen ", "Fifteen ", "Sixteen ", "Seventeen ", "Eighteen ", "Nineteen "};
        String[] SPRITERS2 = {"", "", "Twenty ", "Thirty ", "Forty ", "Fifty ", "Sixty ", "Seventy ", "Eighty ", "Ninety "};
        String[] SPRITERS = {"", "Thousand ", "Million ", "Billion "};
        String numStr = String.valueOf(num);
        int startIdx = numStr.length() % 3;
        int quota = numStr.length() / 3;
        String result = "";
        List<String> xx = new ArrayList<>();
        if (startIdx > 0) {
            xx.add(numStr.substring(0, startIdx));
        }
        for (int i = 0; i < quota; i++) {
            xx.add(numStr.substring(startIdx, startIdx + 3));
            startIdx += 3;
        }
        int curor = xx.size() - 1;
        for (String part : xx) {
            if (!"000".equals(part)) {
                String[] numbers = part.split("");
                if (numbers.length == 3 && Integer.parseInt(numbers[0]) > 0) {
                    result += NUMBERS[Integer.parseInt(numbers[0])] + "Hundred ";
                }
                int lastTwo = 0;
                boolean skipFlag = false;
                if (numbers.length >= 2) {
                    lastTwo = Integer.parseInt(numbers[numbers.length - 2] + numbers[numbers.length - 1]);
                    if (lastTwo >= 20) {
                        result += SPRITERS2[Integer.parseInt(numbers[numbers.length - 2])];
                        if (lastTwo % 10 == 0) {
                            skipFlag = true;
                        }
                    } else if (lastTwo == 0) {
                        skipFlag = true;
                    } else if (lastTwo >= 10) {
                        result += NUMBERS[lastTwo];
                        skipFlag = true;
                    }
                }
                if (numbers.length >= 1 && !skipFlag) {
                    result += NUMBERS[Integer.parseInt(numbers[numbers.length - 1])];
                }
                result += SPRITERS[curor];
            }
            curor--;
        }
        return result.trim();
    }
}
