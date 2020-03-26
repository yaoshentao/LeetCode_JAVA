package cn.ques40;
import cn.ques40.Solution;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution su = new Solution();
        int[] candidates = new int[]{10,1,2,7,6,1,5};
        int target = 8;
        List<List<Integer>> vec = su.combinationSum2(candidates, target);
        target = 9;
    }
}
