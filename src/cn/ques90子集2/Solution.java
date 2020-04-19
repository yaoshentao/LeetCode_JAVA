package cn.ques90子集2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public void helper(int[] nums,List<List<Integer>> res, List<Integer> list, int len, int index)
    {
        res.add(new ArrayList<>(list));
        for(int i=index;i<len;++i)
        {
            if(i-1>=index && nums[i-1]==nums[i])
                continue;
            list.add(nums[i]);
            helper(nums,res,list,len,i+1);
            list.remove(list.size()-1);
        }
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {

        List<List<Integer>> res=new ArrayList<List<Integer>>();
        List<Integer> list=new ArrayList<>();
        Arrays.sort(nums);
        helper(nums, res, list, nums.length, 0);
        return res;
    }
}