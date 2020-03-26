package cn.ques39;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> vec = new ArrayList<List<Integer>>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        dfs(candidates, target, 0, arr, 0);
        return vec;
    }
    public void dfs(int[] candidates, int target, int value, ArrayList<Integer> arr, int deep){
        if(value > target) return;
        if(value == target){
            ArrayList<Integer> save = (ArrayList<Integer>) arr.clone();
            vec.add(save);
        }
        for (int i = deep; i < candidates.length; i++) {
            value += candidates[i];
            arr.add(candidates[i]);
            dfs(candidates, target, value, arr, i);
            value -= candidates[i];
            arr.remove(arr.size()-1);
        }
    }
}
