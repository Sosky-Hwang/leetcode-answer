package com.sosky;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个机票的字符串二维数组 [from, to]，子数组中的两个成员分别表示飞机出发和降落的机场地点，对该行程进行重新规划排序。所有这些机票都属于一个从JFK（肯尼迪国际机场）出发的先生，所以该行程必须从 JFK 出发。
 * <p>
 * 说明:
 * 如果存在多种有效的行程，你可以按字符自然排序返回最小的行程组合。例如，行程 ["JFK", "LGA"] 与 ["JFK", "LGB"] 相比就更小，排序更靠前
 * 所有的机场都用三个大写字母表示（机场代码）。
 * 假定所有机票至少存在一种合理的行程。
 */
public class Solution332 {
    public static void main(String[] args) {
        List<List<String>> data1 = new ArrayList<>();
        List<String> data11 = new ArrayList<>();
        data11.add("MUC");
        data11.add("LHR");
        data1.add(data11);
        List<String> data12 = new ArrayList<>();
        data12.add("JFK");
        data12.add("MUC");
        data1.add(data12);
        List<String> data13 = new ArrayList<>();
        data13.add("SFO");
        data13.add("SJC");
        data1.add(data13);
        List<String> data14 = new ArrayList<>();
        data14.add("LHR");
        data14.add("SFO");
        data1.add(data14);
        //System.out.println(findItinerary(data1));

        List<List<String>> data2 = new ArrayList<>();
        List<String> data21 = new ArrayList<>();
        data21.add("JFK");
        data21.add("SFO");
        data2.add(data21);
        List<String> data22 = new ArrayList<>();
        data22.add("JFK");
        data22.add("ATL");
        data2.add(data22);
        List<String> data23 = new ArrayList<>();
        data23.add("SFO");
        data23.add("ATL");
        data2.add(data23);
        List<String> data24 = new ArrayList<>();
        data24.add("ATL");
        data24.add("JFK");
        data2.add(data24);
        List<String> data25 = new ArrayList<>();
        data25.add("ATL");
        data25.add("SFO");
        data2.add(data25);
        System.out.println(findItinerary(data2));
    }

    private static List<String> findItinerary(List<List<String>> tickets) {
        List<String> result = new ArrayList<>();
        String start = "JFK";
        result.add(start);
        boolean flag = true;
        while (flag) {
            List<String> target = null;
            for (int i = 0; i < tickets.size(); i++) {
                List<String> ticket = tickets.get(i);
                if (start.equals(ticket.get(0))) {
                    if (target == null || target.get(1).compareTo(ticket.get(1)) > 0) {
                        target = ticket;
                    }
                }
            }
            if (target != null) {
                start = target.get(1);
                result.add(start);
                tickets.remove(target);
            } else {
                flag = false;
            }
        }
        return result;
    }
}
