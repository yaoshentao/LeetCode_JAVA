package cn.ques31;
import cn.ques31.Solution;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution su = new Solution();
        int[] nums = {1,2};
        su.nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
}
