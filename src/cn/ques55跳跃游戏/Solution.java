package cn.ques55跳跃游戏;

public class Solution {
    public boolean canJump(int[] nums) {
        int len = nums.length;
        int[] condition = new int[len];
        condition[0] = 1;
        for (int i = 0; i < len; i++) {
            if(condition[i]==1)
            {
                for (int j = 1; j <= nums[i]&&i+j<len; j++) {
                    condition[i+j]=1;
                }
            }
        }
        return condition[len-1]==1;
    }
}
