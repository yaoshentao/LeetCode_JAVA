package cn.ques73;
//空间复杂度 O(2) ，用两个布尔变量就可以解决。方法就是利用数组的首行和首列来记录 0 值。
//从数组下标的 A[1][1] 开始遍历，两个布尔值记录首行首列是否需要置0
public class Solution {
    public void setZeroes(int[][] matrix) {
        if (matrix.length == 0) {
            return;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean firstRowAllZero = false;
        boolean firstColumnAllZero = false;

        if (matrix[0][0] == 0) {
            firstRowAllZero = true;
            firstColumnAllZero = true;
        }

        if (!firstRowAllZero) {
            for (int i = 1; i < cols; i++) {
                if (matrix[0][i] == 0) {
                    firstRowAllZero = true;
                    break;
                }
            }
        }

        if (!firstColumnAllZero) {
            for (int i = 1; i < rows; i++) {
                if (matrix[i][0] == 0) {
                    firstColumnAllZero = true;
                    break;
                }
            }
        }

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for (int i = 1; i < rows; i++) {
            if (matrix[i][0] == 0) {
                for (int j = 1; j < cols; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        for (int i = 1; i < cols; i++) {
            if (matrix[0][i] == 0) {
                for (int j = 1; j < rows; j++) {
                    matrix[j][i] = 0;
                }
            }
        }

        if (firstRowAllZero) {
            for (int i = 0; i < cols; i++) {
                matrix[0][i] = 0;
            }
        }

        if (firstColumnAllZero) {
            for (int i = 0; i < rows; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
