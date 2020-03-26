package cn.ques836;

class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {

        if(rec2[1] >= rec1[3] || rec1[1] >= rec2[3]){
            return false;
        }
        if(rec1[0] >= rec2[2] || rec1[2] <= rec2[0]){
            return false;
        }
        return true;
    }
}
