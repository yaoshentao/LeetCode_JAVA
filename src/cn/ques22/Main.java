package cn.ques22;
import cn.ques22.Solution;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution su = new Solution();
        List<String> vec = su.generateParenthesis(3);
        for (int i = 0; i < vec.size(); i++) {
            System.out.println(vec.get(i));
        }
    }
}
