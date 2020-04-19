package cn.ques33;
//使用二分的方法，取得中间值以后，如果左边是一个完整的序列那么判断是否在左边，
// 右边是一个完整的序列则放在右边。不断迭代得到最优解。这个是无重复的序列，
// 有重复的序列无法判断结果是怎么样的。
public class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1, mid = -1;

        while (left <= right) {
            mid  = (left + right) / 2;

            if(nums[left] == target) return left;
            if(nums[right] == target) return right;
            if(nums[mid] == target) return mid;

            if(nums[mid] >= nums[left]) {
                if(target <= nums[mid] && nums[left] <= target) {
                    right = mid - 1;
                }
                else {
                    left = mid + 1;
                }
            }
            else {
                if(nums[right] >= target && nums[mid] <= target) {
                    left = mid + 1;
                }
                else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }
}
