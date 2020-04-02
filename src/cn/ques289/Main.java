package cn.ques289;
import cn.ques289.Solution;

public class Main {
    public static void main(String[] args) {
        Solution su = new Solution();
        int[][] board = new int[][]{
                {0, 1, 0},
                {0, 0, 1},
                {1, 1, 1},
                {0, 0, 0}
        };
        su.gameOfLife(board);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]);
            }
        }
    }
}
