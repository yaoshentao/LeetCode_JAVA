package cn.ques17;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> vec = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0) return vec;
        char[] ch = digits.toCharArray();
        dfs(0, ch, digits);
        return vec;
    }

    public void dfs(int deep, char[] arr, String str) {
        if (deep == str.length()) {
            vec.add(String.valueOf(arr));
            return;
        }
        switch (str.charAt(deep)) {
            case '1':return;
            case '2': {
                char[] two = {'a', 'b', 'c'};
                for (int i = 0; i < two.length; i++) {
                    arr[deep] = two[i];
                    dfs(deep+1, arr, str);
                }
                return;
            }
            case '3': {
                char[] two = {'d', 'e', 'f'};
                for (int i = 0; i < two.length; i++) {
                    arr[deep] = two[i];
                    dfs(deep+1, arr, str);
                }
                return;
            }
            case '4': {
                char[] two = {'g', 'h', 'i'};
                for (int i = 0; i < two.length; i++) {
                    arr[deep] = two[i];
                    dfs(deep+1, arr, str);
                }
                return;
            }
            case '5': {
                char[] two = {'j', 'k', 'l'};
                for (int i = 0; i < two.length; i++) {
                    arr[deep] = two[i];
                    dfs(deep+1, arr, str);
                }
                return;
            }
            case '6': {
                char[] two = {'m', 'n', 'o'};
                for (int i = 0; i < two.length; i++) {
                    arr[deep] = two[i];
                    dfs(deep+1, arr, str);
                }
                return;
            }
            case '7': {
                char[] two = {'p', 'q', 'r','s'};
                for (int i = 0; i < two.length; i++) {
                    arr[deep] = two[i];
                    dfs(deep+1, arr, str);
                }
                return;
            }
            case '8': {
                char[] two = {'t', 'u', 'v'};
                for (int i = 0; i < two.length; i++) {
                    arr[deep] = two[i];
                    dfs(deep+1, arr, str);
                }
                return;
            }
            case '9': {
                char[] two = {'w','x', 'y', 'z'};
                for (int i = 0; i < two.length; i++) {
                    arr[deep] = two[i];
                    dfs(deep+1, arr, str);
                }
                return;
            }
            default: return;
        }
    }
}

/*
class Solution {
    private static final String[] keys = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs",
            "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();
        if(digits==null || digits.length()==0) return combinations;
        helper(new StringBuilder(), combinations, digits);
        return combinations;
    }
    private void helper(StringBuilder prefix, List<String> combinations, String digits){
        if(prefix.length()==digits.length()){
            combinations.add(prefix.toString());
            return;
        }
        int num = digits.charAt(prefix.length())-'0';
        String str = keys[num];
        for(char c : str.toCharArray()){
            prefix.append(c);
            helper(prefix, combinations, digits);
            prefix.deleteCharAt(prefix.length()-1);
        }
    }
}*/
