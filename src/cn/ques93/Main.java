package cn.ques93;
import cn.ques93.Solution;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution su =new Solution();
        String str = "25525511135";
        List<String> vec=new ArrayList<>();
        vec = su.restoreIpAddresses(str);
    }
}
