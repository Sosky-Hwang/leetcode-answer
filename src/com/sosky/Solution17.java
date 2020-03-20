package com.sosky;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution17 {
    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }

    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        Map<Character, String[]> mapper = new HashMap<>();
        mapper.put('2', new String[]{"a", "b", "c"});
        mapper.put('3', new String[]{"d", "e", "f"});
        mapper.put('4', new String[]{"g", "h", "i"});
        mapper.put('5', new String[]{"j", "k", "l"});
        mapper.put('6', new String[]{"m", "n", "o"});
        mapper.put('7', new String[]{"p", "q", "r", "s"});
        mapper.put('8', new String[]{"t", "u", "v"});
        mapper.put('9', new String[]{"w", "x", "y", "z"});
        char[] chars = digits.toCharArray();
        List<String[]> didi = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            didi.add(mapper.get(chars[i]));
        }
        return result;
    }
}
