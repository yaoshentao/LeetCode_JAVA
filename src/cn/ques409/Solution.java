package cn.ques409;

class Solution {
    public int longestPalindrome(String s) {
        if (s == null) return 0;

        int[] f = new int[75];
        for (char ch : s.toCharArray()) {
            f[ch - '0']++;
        }
        int res = 0, odd = 0;
        for (int num : f) {
            if (num == 0) continue;
            res += num / 2 * 2;

            if (num % 2 == 1) {
                odd = 1;
            }
        }
        res += odd;
        return res;
    }
}