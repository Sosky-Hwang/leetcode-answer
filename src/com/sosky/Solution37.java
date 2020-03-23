package com.sosky;

/**
 * 编写一个程序，通过已填充的空格来解决数独问题。
 * <p>
 * 一个数独的解法需遵循如下规则：
 * <p>
 * 数字 1-9 在每一行只能出现一次。
 * 数字 1-9 在每一列只能出现一次。
 * 数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。
 * 空白格用 '.' 表示。
 * Note:
 * 给定的数独序列只包含数字 1-9 和字符 '.' 。
 * 你可以假设给定的数独只有唯一解。
 * 给定数独永远是 9x9 形式的。
 */
public class Solution37 {
    public static void main(String[] args) {
        char[][] board = new char[][]{
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        solveSudoku(board);
        //System.out.println(Solution36.isValidSudoku(board));
    }

    private static void solveSudoku(char[][] board) {
        boolean redo = true;
        while (redo) {
            redo = false;
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    if ('.' != board[i][j]) {
                        continue;
                    }
                    boolean allRight = true;
                    int x = 1;
                    for (; x <= 9; x++) {
                        //数字 1-9 在每一行只能出现一次。
                        for (int k = 0; k < 9; k++) {
                            if (k != j && x == board[i][k]) {
                                allRight = false;
                                break;
                            }
                        }
                        if (!allRight) {
                            allRight = true;
                            continue;
                        }
                        //数字 1-9 在每一列只能出现一次。
                        for (int k = 0; k < 9; k++) {
                            if (k != i && x == board[k][j]) {
                                allRight = false;
                                break;
                            }
                        }
                        if (!allRight) {
                            allRight = true;
                            continue;
                        }
                        //数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。
                        int a = i < 3 ? 0 : (i > 5 ? 6 : 3);
                        int b = j < 3 ? 0 : (j > 5 ? 6 : 3);
                        for (int k = a; k < a + 3; k++) {
                            for (int l = b; l < b + 3; l++) {
                                if ((k != i && l != j) && x == board[k][l]) {
                                    allRight = false;
                                    break;
                                }
                            }
                        }
                        if (!allRight) {
                            allRight = true;
                            continue;
                        }
                    }
                    if (allRight) {
                        board[i][j] = (char) (x + '0');
                    } else {

                    }
                }
            }
        }
    }
}
