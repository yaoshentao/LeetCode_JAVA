package cn.quesview17;

public class Solution {
        public int massage(int[] nums) {
            int a = 0, b = 0;
            for (int i = 0; i < nums.length; i++) {
                int c = Math.max(b, a + nums[i]);
                a = b;
                b = c;
            }
            return b;
        }
}
