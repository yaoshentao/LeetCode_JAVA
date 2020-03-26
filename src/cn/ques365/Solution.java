package cn.ques365;

public class Solution {
    public boolean canMeasureWater(int x, int y, int z) {
        int res = 1;
        while (res != 0)
        {
            res = x % y;
            x = y;
            y = res;
        }
         if (z % x == 0)
             return true;
         else return false;
    }
}
