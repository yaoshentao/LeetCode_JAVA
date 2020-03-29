package cn.ques43;

public class Solution {
    public String multiply(String num1, String num2) {
        if (num1 == null || num2 == null){
            return null;
        }

        if ("0".equals(num1)|| "0".equals(num2)){
            return "0";
        }

        char large[] = null;
        char small[] = null;
        int time[] = new int[num1.length()+num2.length()];
        if (num1.length() > num2.length()) {
            large = num1.toCharArray();
            small = num2.toCharArray();
        } else {
            large = num2.toCharArray();
            small = num1.toCharArray();
        }

        //遍历相乘
        for (int i = large.length -1; i >=0 ; i--) {
            for (int j = small.length - 1; j >= 0 ; j--) {
                time[(large.length-1-i)+(small.length-1-j)]
                        += (large[i]-'0') * (small[j]-'0');
            }
        }
        //处理进位
        for (int i = 0; i < time.length; i++) {
            if (time[i] > 9) {
                time[i+1] += time[i] / 10;
                time[i] = time[i] %10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = time.length - 1; i>=0;i--) {
            sb.append(time[i]);
        }
        String res = sb.toString();
        if (res.startsWith("0")){
            return res.substring(1);
        }
        return res;
    }
}
