package cn.quesview62;

public class Solution {
    public int lastRemaining(int n, int m) {
        return n==1?0:(lastRemaining(n-1,m)+m)%n;
    }
}
