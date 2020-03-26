package cn.ques22;

import java.util.ArrayList;
import java.util.List;

/*我的解法
class Solution {
    public List<String> vec = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        IterDeep(n, n, "");
        return vec;
    }
    public void IterDeep(int left, int right, String ep)
    {
        if (left > right) return;
        if (right == 0){
            vec.add(ep);
            return;
        }
        if(left > 0)
            IterDeep(left - 1, right, ep+'(');
        if (left < right)
            IterDeep(left, right - 1, ep+')');
    }
}*/

//最优解法
class Solution {
    private List<String> result = new ArrayList();

    public List<String> generateParenthesis(int n) {
        if(n<0){
            return new ArrayList();
        }
        dfs(0,0,0,n,new char[2*n]); //使用字符作为栈，重复利用空间！！！！不需要额外内存消耗
        return result;
    }

    private void dfs(int pos,int left,int right,int total,char[] value){
        if(pos == 2*total){
            result.add(String.valueOf(value));
            return;
        }
        if(left<total){
            value[pos] = '(';
            dfs(pos+1,left+1,right,total,value);
        }
        if(right<left){
            value[pos] = ')';
            dfs(pos+1,left,right+1,total,value);
        }
    }
}
