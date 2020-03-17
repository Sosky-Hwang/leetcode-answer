package com.sosky;

import java.util.ArrayList;
import java.util.List;

/**
 * 在给定的网格中，每个单元格可以有以下三个值之一：
 * <p>
 * 值 0 代表空单元格；
 * 值 1 代表新鲜橘子；
 * 值 2 代表腐烂的橘子。
 * 每分钟，任何与腐烂的橘子（在 4 个正方向上）相邻的新鲜橘子都会腐烂。
 * <p>
 * 返回直到单元格中没有新鲜橘子为止所必须经过的最小分钟数。如果不可能，返回 -1。
 */
public class Solution994 {
    public static void main(String[] args) {
        System.out.println(orangesRotting(new int[][]{{0, 1}, {2, 0}}));
        System.out.println(orangesRotting(new int[][]{{0, 2, 2}}));
        System.out.println(orangesRotting(new int[][]{{1, 2}}));
        System.out.println(orangesRotting(new int[][]{{0, 1}}));
        System.out.println(orangesRotting(new int[][]{{2, 1, 1}, {1, 1, 0}, {0, 1, 1}}));
        System.out.println(orangesRotting(new int[][]{{2, 1, 1}, {0, 1, 1}, {1, 0, 1}}));
        System.out.println(orangesRotting(new int[][]{{0, 2}}));
    }

    public static int orangesRotting(int[][] grid) {
        int result = 0;
        boolean done = false;
        while (!done) {
            List<int[]> rottingIdx = new ArrayList<>();
            int xx = 0;
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[i].length; j++) {
                    if (grid[i][j] == 2) {
                        int[] arr = {i, j};
                        rottingIdx.add(arr);
                        xx++;
                    }
                }
            }
            int spreadCount = 0;
            if (rottingIdx != null && rottingIdx.size() > 0) {
                for (int i = 0; i < rottingIdx.size(); i++) {
                    if (rottingIdx.get(i)[0] - 1 >= 0 && grid[rottingIdx.get(i)[0] - 1][rottingIdx.get(i)[1]] == 1) {
                        spreadCount++;
                        grid[rottingIdx.get(i)[0] - 1][rottingIdx.get(i)[1]] = 2;
                    }
                    if (rottingIdx.get(i)[0] + 1 < grid.length && grid[rottingIdx.get(i)[0] + 1][rottingIdx.get(i)[1]] == 1) {
                        spreadCount++;
                        grid[rottingIdx.get(i)[0] + 1][rottingIdx.get(i)[1]] = 2;
                    }
                    if (rottingIdx.get(i)[1] - 1 >= 0 && grid[rottingIdx.get(i)[0]][rottingIdx.get(i)[1] - 1] == 1) {
                        spreadCount++;
                        grid[rottingIdx.get(i)[0]][rottingIdx.get(i)[1] - 1] = 2;
                    }
                    if (rottingIdx.get(i)[1] + 1 < grid[0].length && grid[rottingIdx.get(i)[0]][rottingIdx.get(i)[1] + 1] == 1) {
                        spreadCount++;
                        grid[rottingIdx.get(i)[0]][rottingIdx.get(i)[1] + 1] = 2;
                    }
                }
            }
            if (spreadCount == 0) {
                int yy = 0;
                for (int i = 0; i < grid.length; i++) {
                    for (int j = 0; j < grid[i].length; j++) {
                        if (grid[i][j] == 1) {
                            yy++;
                        }
                    }
                }
                if (yy > 0) {
                    result = -1;
                }
                done = true;
                break;
            }
            result++;
            int zz = 0;
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[i].length; j++) {
                    if (grid[i][j] == 1) {
                        zz++;
                    }
                }
            }
            if (zz == 0) {
                done = true;
            }
        }
        return result;
    }
}
