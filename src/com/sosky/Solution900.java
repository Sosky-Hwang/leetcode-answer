package com.sosky;

import java.util.ArrayList;
import java.util.List;

/**
 * 编写一个遍历游程编码序列的迭代器。
 * <p>
 * 迭代器由 RLEIterator(int[] A) 初始化，其中 A 是某个序列的游程编码。更具体地，对于所有偶数 i，A[i] 告诉我们在序列中重复非负整数值 A[i + 1] 的次数。
 * <p>
 * 迭代器支持一个函数：next(int n)，它耗尽接下来的  n 个元素（n >= 1）并返回以这种方式耗去的最后一个元素。如果没有剩余的元素可供耗尽，则  next 返回 -1 。
 * <p>
 * 例如，我们以 A = [3,8,0,9,2,5] 开始，这是序列 [8,8,8,5,5] 的游程编码。这是因为该序列可以读作 “三个八，零个九，两个五”。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/rle-iterator
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution900 {
    public static void main(String[] args) {
//        RLEIterator obj = new RLEIterator(new int[]{3, 8, 0, 9, 2, 5});
//        int param1 = obj.next(2);
//        int param2 = obj.next(1);
//        int param3 = obj.next(1);
//        int param4 = obj.next(2);
        RLEIterator obj = new RLEIterator(new int[]{784, 303, 477, 583, 909, 505});
        int param1 = obj.next(130);
        int param2 = obj.next(333);
        int param3 = obj.next(238);
        int param4 = obj.next(87);
        int param5 = obj.next(301);
        int param6 = obj.next(276);
    }
}

class RLEIterator {

    private List<Integer> val;

    RLEIterator(int[] A) {
        val = new ArrayList<>();
        for (int i = 0; i < A.length; i += 2) {
            int x = A[i];
            int y = A[i + 1];
            for (int j = 0; j < x; j++) {
                val.add(y);
            }
        }
        System.out.println("SIZE: " + val.size());
        System.out.println(val);
    }

    int next(int n) {
        int lastInt = 0;
        for (int i = 0; i < n; i++) {
            if (val.size() > 0) {
                lastInt = val.get(0);
                val.remove(0);
            } else {
                lastInt = -1;
            }
        }
        System.out.println("SIZE: " + val.size());
        System.out.println(val);
        System.out.println("lastInt: " + lastInt);
        return lastInt;
    }
}
