package cn.ques39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Optim {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates, target,0 , res, new ArrayList<>());
        return res;

    }

    public static void backtrack(int[] candidates, int target, int i, List<List<Integer>> res, ArrayList<Integer> list) {
        if (0 == target) {
            res.add(new ArrayList<>(list));
            return;
        }
        for (int start = i; start < candidates.length ; start++) {
            if (start>i&&candidates[start]==candidates[start-1]) continue;
            if (target-candidates[start]>=0) {
                list.add(candidates[start]);
                backtrack(candidates, target - candidates[start], start, res, list);
                list.remove(list.size() - 1);
            }else return;
        }
    }
}
