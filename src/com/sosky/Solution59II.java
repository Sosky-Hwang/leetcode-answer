package com.sosky;

import java.util.ArrayList;
import java.util.List;

/**
 * 请定义一个队列并实现函数 max_value 得到队列里的最大值，要求函数max_value、push_back 和 pop_front 的时间复杂度都是O(1)。
 * <p>
 * 若队列为空，pop_front 和 max_value 需要返回 -1
 */
public class Solution59II {
    public static void main(String[] args) {
        MaxQueue obj = new MaxQueue();
        obj.push_back(1);
        obj.push_back(2);
        System.out.println(obj.max_value());
        System.out.println(obj.pop_front());
        System.out.println(obj.max_value());
    }

}

class MaxQueue {

    private List<Integer> maxQueue;

    public MaxQueue() {
        maxQueue = new ArrayList<>();
    }

    public int max_value() {
        if (maxQueue == null || maxQueue.size() == 0) {
            return -1;
        } else {
            int result = 0;
            for (int i = 0; i < maxQueue.size(); i++) {
                if (result < maxQueue.get(i)) {
                    result = maxQueue.get(i);
                }
            }
            return result;
        }
    }

    public void push_back(int value) {
        maxQueue.add(value);
    }

    public int pop_front() {
        if (maxQueue == null || maxQueue.size() == 0) {
            return -1;
        } else {
            int result = maxQueue.get(0);
            maxQueue.remove(0);
            return result;
        }
    }
}