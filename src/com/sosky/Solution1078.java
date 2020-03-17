package com.sosky;

import java.util.ArrayList;
import java.util.List;

/**
 * 给出第一个词 first 和第二个词 second，考虑在某些文本 text 中可能以 "first second third" 形式出现的情况，其中 second 紧随 first 出现，third 紧随 second 出现。
 * <p>
 * 对于每种这样的情况，将第三个词 "third" 添加到答案中，并返回答案。
 */
public class Solution1078 {
    public static void main(String[] args) {
        //System.out.println(findOcurrences("alice is a good girl she is a good student", "a", "good"));
        //System.out.println(findOcurrences("we will we will rock you", "we", "will"));
        System.out.println(findOcurrences("obo jvezipre obo jnvavldde jvezipre jvezipre jnvavldde jvezipre jvezipre jvezipre y jnvavldde jnvavldde obo jnvavldde jnvavldde obo jnvavldde jnvavldde jvezipre", "jnvavldde", "y"));
    }

    private static String[] findOcurrences(String text, String first, String second) {
        List<String> result = new ArrayList<>();
        String[] words = text.split(" ");
        int matchCount = 0;
        for (int i = 0; i < words.length; i++) {
            if (matchCount == 0 && first.equals(words[i])) {
                matchCount++;
                continue;
            }
            if (matchCount == 1) {
                if (second.equals(words[i])) {
                    matchCount++;
                    continue;
                } else {
                    matchCount = 0;
                    if (first.equals(words[i])) {
                        matchCount++;
                    }
                }
            }
            if (matchCount == 2) {
                result.add(words[i]);
                matchCount = 0;
                if (first.equals(words[i])) {
                    matchCount++;
                }
            }
        }
        return result.toArray(new String[result.size()]);
    }
}
