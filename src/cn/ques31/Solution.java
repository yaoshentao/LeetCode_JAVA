package cn.ques31;

public class Solution {
    public void nextPermutation(int[] nums) {
        int i=nums.length-1;
        while (i>0 && nums[i-1]>=nums[i]){
            i--;
        }
        if (i>0){
            int k =nums.length-1;
            while (k>0 && nums[i-1]>=nums[k]){
                k--;
            }
            int moment = nums[k];
            nums[k]=nums[i-1];
            nums[i-1]=moment;
        }

        int end = nums.length-1;
        while (i<end){
            int moment = nums[end];
            nums[end]=nums[i];
            nums[i]=moment;
            i++;
            end--;
        }
    }
}
