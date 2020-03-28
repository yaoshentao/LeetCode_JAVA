package cn.ques820;

import cn.ques820.Solution;

public class Main {
    public static void main(String[] args) {
        Solution su =new Solution();
        String[] words = new String[]{"time", "me", "bell"};
        int min = su.minimumLengthEncoding(words);
        System.out.println(min);
    }
}
