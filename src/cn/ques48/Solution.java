package cn.ques48;
//name：旋转图像
public class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        // 上下翻转，两种写法
        // 第一种
        //  for (int i =0; i < n /2 ; i++ ){
        //      for (int j =0; j < n; j ++){
        //          int tmp = matrix[i][j];
        //          matrix[i][j] = matrix[n-i-1][j];
        //          matrix[n-i-1][j] = tmp;
        //      }
        //  }
        // 第二种
        for (int i = 0; i < n / 2; i ++){
            int[] tmp = matrix[i];
            matrix[i] = matrix[n - i - 1];
            matrix[n - i - 1] = tmp;
        }
        //System.out.println(Arrays.deepToString(matrix));
        // 对角翻转
        for (int i = 0; i < n; i ++){
            for (int j= i + 1; j < n; j++){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }

    }
}
