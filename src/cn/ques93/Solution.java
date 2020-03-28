package cn.ques93;

import java.util.ArrayList;
import java.util.List;

class Solution {
    List<String> result = new ArrayList<>();
    char[] currentResult;
    public List<String> restoreIpAddresses(String s) {
        currentResult = new char[s.length() + 3];
        backtrace(s, 0, 0);
        return result;
    }

    private void backtrace(String s, int part, int startPos) {
        if (s.length() - startPos < (4 - part) * 1 ||
                s.length() - startPos > (4 - part) * 3) {
            return;
        }

        if (part == 4) {
            result.add(new String(currentResult));
            return;
        }
        if (part != 0) {
            currentResult[startPos + part - 1] = '.';
        }

        // this part has 1 digit
        char first = s.charAt(startPos);
        currentResult[startPos + part] = first;
        backtrace(s, part + 1, startPos + 1);

        // this part has 2 digit
        if (first == '0') {
            return;
        }
        if (startPos + 1 >= s.length()) return;
        char second = s.charAt(startPos + 1);
        currentResult[startPos + part + 1] = second;
        backtrace(s, part + 1, startPos + 2);

        // this part has 3 digit
        if (startPos + 2 >= s.length()) return;
        char third = s.charAt(startPos + 2);
        currentResult[startPos + part + 2] = third;
        if (first == '1') {
            backtrace(s, part + 1, startPos + 3);
        } else if (first == '2') {
            if (second < '5') {
                backtrace(s, part + 1, startPos + 3);
            } else if (second == '5' && third <= '5') {
                backtrace(s, part + 1, startPos + 3);
            }
        }
    }
}