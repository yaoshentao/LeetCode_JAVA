package cn.ques78;

import java.util.ArrayList;
import java.util.List;
//将前面的元素加上新到的元素，然后继续加入进去构成新的集合。
public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        ans.add(new ArrayList<>());
        for (int num : nums) {
            List<List<Integer>> element = new ArrayList<List<Integer>>();
            for (List<Integer> an : ans) {
                List<Integer> tmp = new ArrayList<>(an);
                tmp.add(num);
                element.add(tmp);
            }
            List<Integer> val = new ArrayList<>();
            val.add(num);
            ans.addAll(element);
            ans.add(val);
        }
        return ans;
    }
}
