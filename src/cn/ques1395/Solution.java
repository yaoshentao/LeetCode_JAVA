package cn.ques1395;

import java.util.Arrays;

public class Solution {
    public int nums = 0 ;
    public int numTeams(int[] rating) {
        dfs(rating, 0, 0, 0, 0);
        return nums;
    }
    void dfs(int[] arr, int ind, int deep, int last_index, int up_or_down)
    {
        if(ind>=arr.length) return;
        if(deep == 3)
        {
            nums++;
            return;
        }
        if(up_or_down ==1)
        {
            if(arr[ind]>arr[last_index])
                dfs(arr,ind + 1,deep+1, ind, 1);
            else dfs(arr,ind + 1,deep, last_index, 1);
        }
        else if(up_or_down ==-1){
            if(arr[ind]<arr[last_index])
                dfs(arr,ind + 1,deep+1, ind, -1);
            else dfs(arr,ind + 1,deep, last_index, -1);
        }
        else
        {
            dfs(arr,ind + 1,deep, ind, 0);
            dfs(arr,ind + 1,deep + 1, ind, 1);
            dfs(arr,ind + 1,deep + 1, ind, -1);
        }
    }
}
