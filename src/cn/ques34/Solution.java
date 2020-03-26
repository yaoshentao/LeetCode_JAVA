package cn.ques34;

public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) >>> 1;
            if (nums[mid] == target) {
                int i = mid, j = mid;
                while (--i >= left && nums[i] == target) ;
                while (++j <= right && nums[j] == target) ;
                return new int[]{i + 1, j - 1};
            }
            if (nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return new int[]{-1, -1};
    }
}
