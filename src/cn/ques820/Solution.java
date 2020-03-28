package cn.ques820;


public class Solution {
    public int minimumLengthEncoding(String[] words) {
        int[] used = new int[words.length];
        String output="";
        for (int j = 0; j < words.length; j++) {
            if(used[j]==1) continue;
            for(int i = 0;i<words.length;++i)
            {
                if(words[j].length()<words[i].length()||i==j)
                    continue;
                boolean index = existStr(words[j],words[i]);
                if(index) used[i]=1;
            }
        }
        int len=0;
        for (int i = 0; i < used.length; i++) {
            if(used[i]==1) continue;
            else len += words[i].length()+1;
        }
        return len;
    }
    public boolean existStr(String str1, String str2)
    {
        int str1_len = str1.length(), str2_len = str2.length();
        for(int i = str1_len-str2_len, j = 0; i<str1_len&&j<str2_len; ++i,++j)
        {
            if(str1.charAt(i)!=str2.charAt(j))
                return false;
        }
        return true;
    }
}
/*
class Solution {
    public int minimumLengthEncoding(String[] words) {
        Node.code_len = 0;
        Node root = new Node();
        for (String w : words) {
            Node.insert(root, w);
        }
        return  Node.code_len;

    }


    static class Node {
        static int code_len = 0;
        Node[] children = new Node[26];
        boolean isLeaf = false;

        Node() {
        }

        static void insert(Node root, String s) {
            Node p = root;
            boolean add_falg = false;
            for (int i = s.length()-1; i >=0; i--) {
                char c = s.charAt(i);
                int key = c - 'a';
                if (p.isLeaf && i < s.length() - 1) {
                    code_len -= (s.length()-1-i) + 1;
                    p.isLeaf = false;
                }
                if (p.children[key] == null) {
                    p.children[key] = new Node();
                    add_falg = true;
                }
                p = p.children[key];
            }
            if (add_falg) {
                code_len += s.length() + 1;
                p.isLeaf = true;
            }
        }
    }
}*/
