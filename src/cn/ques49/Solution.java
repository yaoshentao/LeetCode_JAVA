package cn.ques49;

import java.util.*;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new LinkedList<>();
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);
            map.putIfAbsent(sorted, new LinkedList<>());
            map.get(sorted).add(str);
        }

        for (List<String> value : map.values()) {
            result.add(value);
        }
        return result;
    }
}
