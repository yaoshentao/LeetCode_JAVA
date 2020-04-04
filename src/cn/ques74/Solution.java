package cn.ques74;

public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0||matrix[0].length==0) return false;
        int col = matrix.length, row = matrix[0].length;
        if(target<matrix[0][0]||target>matrix[col-1][row-1])
            return false;
        int start = 0, end = col*row-1, mid;
        while (start<=end)
        {
            mid = (start+end)/2;
            int mid_x = mid / col, mid_y = mid % col;
            if(matrix[mid_x][mid_y]==target) return true;
            else if(matrix[mid_x][mid_y]<target) start = mid + 1;
            else end = mid - 1;
        }
        return false;
    }
}
