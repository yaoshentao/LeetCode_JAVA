package cn.ques999;

public class Solution {
    public int numRookCaptures(char[][] board) {
        int sum=0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if(board[i][j] == 'R')
                {
                    for (int x = i-1; x >= 0&&board[x][j]!='B'&&board[x][j]!='R'; x--)
                        if(board[x][j]=='p'){
                            sum++;
                            break;
                        }
                    for (int x = i+1; x<board.length&&board[x][j]!='B'&&board[x][j]!='R'; x++)
                        if(board[x][j]=='p') {
                            sum++;
                            break;
                        }
                    for (int y = j-1; y>=0&&board[i][y]!='B'&&board[i][y]!='R'; y--)
                        if(board[i][y]=='p') {
                            sum++;
                            break;
                        }
                    for (int y = j+1; y<board[i].length&&board[i][y]!='B'&&board[i][y]!='R'; y++)
                        if(board[i][y]=='p') {
                            sum++;
                            break;
                        }
                }
            }
        }
        return sum;
    }
}

/*
class Solution {
    */
/*
     * 增长量级：Θ(n^2)
     * 最大最小：Θ(2n^2)
     *//*


    private int getNumRook(int x, int y, char[][] board) {
        int count = 0;
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        for (int i = 0; i < 4; i++) {
            for (int tx = x, ty = y; tx < board.length && tx >= 0
                    && ty < board.length && ty >= 0; tx += dx[i], ty += dy[i]) {
                if (board[tx][ty] == 'p') {
                    count++;
                    break;
                }
                if (board[tx][ty] == 'B')
                    break;
            }
        }

        return count;
    }

    public int numRookCaptures(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j  = 0; j < board.length; j++) {
                if (board[i][j] == 'R')
                    return getNumRook(i, j, board);
            }
        }

        return -1;
    }
}
*/
