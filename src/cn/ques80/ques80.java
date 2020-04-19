package cn.ques80;

public class ques80 {
    public int removeDuplicates(int[] nums) {
        int new_index = 0, count = 0, last_value=-1000000;
        for (int num : nums) {
            if(last_value==num)
            {
                if(count<2)
                {
                    count++;
                    nums[new_index++] = num;
                }
            }
            else{
                count = 0;
                nums[new_index++] = num;
            }
        }
        return new_index;
    }
}
//直接使用判断，不需要用额外的东西代替，因为此处的大小是固定的（不是固定大小也可以）
/*
class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int n : nums) {
            if (i < 2 || n > nums[i-2]) nums[i++] = n;
        }
        return i;
    }
}*/