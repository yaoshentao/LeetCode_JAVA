package cn.ques79;

public class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        char first = word.charAt(0);
        for (int i = 0; i < m; i ++) {
            for (int j = 0; j < n; j ++) {
                if (board[i][j] == first) {
                    if (goNext(board, m, n, i, j, 1, word)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean goNext(char[][] board, int m, int n, int i, int j, int index, String word) {
        if (index == word.length()) {
            return true;
        }
        char now = board[i][j];
        board[i][j] = ' ';  //此处是为了防止往回走，比如ACCA
        char c = word.charAt(index);
        if (j + 1 < n && board[i][j + 1] == c) {
            if (goNext(board, m, n, i, j + 1, index + 1, word)) {
                return true;
            }
        }
        if (i + 1 < m && board[i + 1][j] == c) {
            if (goNext(board, m, n, i + 1, j, index + 1, word)) {
                return true;
            }
        }
        if (j - 1 >= 0 && board[i][j - 1] == c) {
            if (goNext(board, m, n, i, j - 1, index + 1, word)) {
                return true;
            }
        }
        if (i - 1 >= 0 && board[i - 1][j] == c) {
            if (goNext(board, m, n, i - 1, j, index + 1, word)) {
                return true;
            }
        }
        board[i][j] = now;
        return false;
    }
}
