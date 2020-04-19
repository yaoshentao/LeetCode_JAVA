package cn.ques11盛最多的水的容器;

public class Solution {
    // //最宽->最窄
    // public int maxArea2(int[] height) {
    //     int l = 0;
    //     int r = height.length - 1;
    //     int max = 0;
    //     while (l < r) {
    //         int min = height[l] < height[r] ? height[l++]:height[r--];
    //         max = Math.max(max, min * (r-l+1));
    //     }
    //     return max;
    // }

    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int max = 0;
        while (l < r) {
            int min = height[l] < height[r] ? height[l]:height[r];
            max = Math.max(max, min * (r-l));
            while (l<r && height[l] <= min) l++;
            while (l< r && height[r] <= min) r--;

        }
        return max;
    }
}
