package cn.ques1162;
import cn.ques1162.Solution;
public class Main {
    public static void main(String[] args) {
        Solution su = new Solution();
        int[][] grids =new int[][]{{1,0,1},{0,0,0},{1,0,1}};
        System.out.println(su.maxDistance(grids));
    }
}
