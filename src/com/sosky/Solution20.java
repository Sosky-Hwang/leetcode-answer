package com.sosky;

import java.util.LinkedList;
import java.util.List;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * <p>
 * 有效字符串需满足：
 * <p>
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 */
public class Solution20 {
    public static void main(String[] args) {
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
        System.out.println(isValid("([)]"));
        System.out.println(isValid("{[]}"));
    }

    public static boolean isValid(String s) {
        boolean result = true;
        char[] chars = s.toCharArray();
        if (chars.length % 2 == 0) {
            List<Character> stack = new LinkedList<>();
            for (int i = 0; i < chars.length; i++) {
                switch (chars[i]) {
                    case '(': {
                        stack.add(')');
                        break;
                    }
                    case '[': {
                        stack.add(']');
                        break;
                    }
                    case '{': {
                        stack.add('}');
                        break;
                    }
                    case ')': {
                        if (stack.size() > 0 && ')' == stack.get(stack.size() - 1)) {
                            stack.remove(stack.size() - 1);
                        } else {
                            result = false;
                        }
                        break;
                    }
                    case ']': {
                        if (stack.size() > 0 && ']' == stack.get(stack.size() - 1)) {
                            stack.remove(stack.size() - 1);
                        } else {
                            result = false;
                        }
                        break;
                    }
                    case '}': {
                        if (stack.size() > 0 && '}' == stack.get(stack.size() - 1)) {
                            stack.remove(stack.size() - 1);
                        } else {
                            result = false;
                        }
                        break;
                    }
                }
                if (i == chars.length - 1 && stack.size() > 0) {
                    result = false;
                    break;
                }
                if (!result) {
                    break;
                }
            }
        } else {
            result = false;
        }
        return result;
    }
}
