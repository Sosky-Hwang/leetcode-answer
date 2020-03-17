package com.sosky;

import java.util.ArrayList;
import java.util.List;

/**
 * 设计一个支持 push，pop，top 操作，并能在常数时间内检索到最小元素的栈。
 * <p>
 * push(x) -- 将元素 x 推入栈中。
 * pop() -- 删除栈顶的元素。
 * top() -- 获取栈顶元素。
 * getMin() -- 检索栈中的最小元素。
 */
public class Solution155 {
    public static void main(String[] args) {
//        MinStack minStack = new MinStack();
//        minStack.push(-2);
//        minStack.push(0);
//        minStack.push(-3);
//        System.out.println(minStack.getMin());
//        minStack.pop();
//        System.out.println(minStack.top());
//        System.out.println(minStack.getMin());

        MinStack minStack = new MinStack();
        minStack.push(2);
        minStack.push(0);
        minStack.push(3);
        minStack.push(0);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
    }
}

class MinStack {
    private List<Integer> minstack = null;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        minstack = new ArrayList<>();
    }

    public void push(int x) {
        minstack.add(x);
    }

    public void pop() {
        if (minstack != null && minstack.size() > 0) {
            minstack.remove(minstack.size() - 1);
        }
    }

    public int top() {
        if (minstack != null && minstack.size() > 0) {
            return minstack.get(minstack.size() - 1);
        } else {
            return 0;
        }
    }

    public int getMin() {
        int minimum = 0;
        if (minstack != null && minstack.size() > 0) {
            minimum = minstack.get(0);
            for (int i = 0; i < minstack.size(); i++) {
                if (minimum > minstack.get(i)) {
                    minimum = minstack.get(i);
                }
            }
        }
        return minimum;
    }
}