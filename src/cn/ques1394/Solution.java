package cn.ques1394;

import java.util.Arrays;

public class Solution {
    public int findLucky(int[] arr) {
        int[] ind = new int[501];
        int len = 0;
        for (int i = 0; i < arr.length; i++) {
            ind[arr[i]]++;
        }
        int i = 500;
        for (;i>0&&ind[i]!=i;i--);
        if(i==0) return -1;
        else return i;
    }
}
