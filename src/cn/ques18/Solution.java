package cn.ques18;

public class Solution {
        public int romanToInt(String s) {
            int num = 0, left = 0, right =0;
            char[] word = s.toCharArray();
            int len = word.length;
            if (len == 0) return 0;
            if (len == 1) return getValue(word[0]);
            for (int i = 0; i < word.length - 1; i++) {
                left = getValue(word[i]);
                right = getValue(word[i+1]);
                if(left < right)
                {
                    num += right - left;
                    i++;
                }
                else num += left;
            }
            if (getValue(word[len-1]) <= getValue((word[len-2])))
                num += getValue(word[len-1]);
            return num;
        }

        private int getValue(char ch) {
            switch(ch) {
                case 'I': return 1;
                case 'V': return 5;
                case 'X': return 10;
                case 'L': return 50;
                case 'C': return 100;
                case 'D': return 500;
                case 'M': return 1000;
                default: return 0;
            }
        }
}

/*class Solution {
    public int romanToInt(String s) {
        char[] romanMap = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        int[] intMap = {1, 5, 10, 50, 100, 500, 1000};
        int j = 0;
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (romanMap[j] == c){
                count += intMap[j];
            }else if(j>0 && romanMap[j-1] == c){
                count -= intMap[j-1];
            }else if(j>1 && romanMap[j-2] == c){
                count -= intMap[j-2];
            }else {
                j++;
                i++;
            }
        }
        return count;
    }
}*/
