package cn.ques47;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int[] visited = new int[nums.length];
        backtrack(res, nums, visited, new ArrayList<Integer>());
        return res;

    }

    private void backtrack(List<List<Integer>> res, int[] nums, int[] visited, ArrayList<Integer> tmp) {
        if (tmp.size() == nums.length) {
            res.add(new ArrayList<>(tmp));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            //关键在于如何去掉重复的，使用前一个没有选然后后一个也不选。
            if (visited[i] == 1 || (i > 0 && visited[i - 1] == 0 && nums[i - 1] == nums[i])) continue;
            visited[i] = 1;
            tmp.add(nums[i]);
            backtrack(res, nums, visited, tmp);
            tmp.remove(tmp.size() - 1);
            visited[i] = 0;
        }
    }
}
