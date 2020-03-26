package cn.quesview40;

import java.util.Arrays;

public class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
        Arrays.sort(arr);
        int[] k_arr = new int[k];
        for (int i = 0; i < k_arr.length; i++) {
            k_arr[i] = arr[i];
        }
        return k_arr;
    }
}
