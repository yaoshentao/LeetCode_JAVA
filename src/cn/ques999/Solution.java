package cn.ques999;

public class Solution {
    public int numRookCaptures(char[][] board) {
        int sum=0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if(board[i][j] == 'R')
                {
                    for (int x = i-1; x >= 0&&board[x][j]!='B'&&board[x][j]!='R'; x--)
                        if(board[x][j]=='p') sum++;
                    for (int x = i+1; x<board.length&&board[x][j]!='B'&&board[x][j]!='R'; x++)
                        if(board[x][j]=='p') sum++;
                    for (int y = j-1; y>=0&&board[i][y]!='B'&&board[i][y]!='R'; y--)
                        if(board[i][y]=='p') sum++;
                    for (int y = j+1; y<board[i].length&&board[i][y]!='B'&&board[i][y]!='R'; y++)
                        if(board[i][y]=='p') sum++;
                }
            }
        }
        return sum;
    }
}
