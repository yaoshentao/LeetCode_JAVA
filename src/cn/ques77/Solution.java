package cn.ques77;

import java.util.ArrayList;
import java.util.List;

class Solution {
    private List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        getCombine(n,k,1,new ArrayList<>());
        return ans;
    }
    private void getCombine(int n, int k, int start, List<Integer> list){
        if(k == 0){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i = start;i <= n - k + 1;i++){   //使用小于n-k+1可以有效的减少个数不够的情况！！！！！
            list.add(i);
            getCombine(n,k - 1,i + 1,list);
            list.remove(list.size() - 1);
        }
    }
}