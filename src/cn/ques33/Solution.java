package cn.ques33;

public class Solution {
    public int search(int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        }

        // find pivot
        int index = 0;
        while (index < nums.length - 1) {
            if (nums[index] > nums[index + 1]) {
                index++;
                break;
            }
            index++;
        }

        // System.out.println(mid);
        int result = binarySearch(nums, 0, index - 1, target);
        if (result == -1) {
            result = binarySearch(nums, index, nums.length - 1, target);
        }
        return result;
    }

    private int binarySearch(int[] nums, int from, int end, int target) {
        int left = from;
        int right = end;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

}
