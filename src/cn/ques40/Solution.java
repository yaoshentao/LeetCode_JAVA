package cn.ques40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    boolean[] used;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        used = new boolean[candidates.length];
        Arrays.sort(candidates);
        dfs(candidates, 0, target);
        return res;
    }

    private void dfs(int[] arr, int start, int target){
        if(target == 0){
            res.add(new ArrayList<>(list));
            return;
        }

        for(int i=start; i<arr.length; i++){
            if(target-arr[i] < 0) break;
            if(i-1>=0 && arr[i] == arr[i-1] && !used[i-1]) continue;
            list.add(arr[i]);
            used[i] = true;
            dfs(arr, i+1, target-arr[i]);
            list.remove(list.size()-1);
            used[i] = false;
        }
    }
}