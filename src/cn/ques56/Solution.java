package cn.ques56;

import java.util.*;

public class Solution {
    public int[][] merge(int[][] intervals) {
        int m = intervals.length;
        if(m<=1)    return intervals;
        List<int[]> res = new ArrayList<>();
        for(int i = 0;i<m-1;i++)
        {
            if(intervals[i]==null)  continue;
            int low = intervals[i][0];
            int high = intervals[i][1];
            for(int j = i+1;j<m;j++)
            {
                if(intervals[j]==null)  continue;
                if((!(intervals[j][0]>high)) && (!(intervals[j][1]<low)))
                {
                    intervals[j][0] = Math.min(low,intervals[j][0]);
                    intervals[j][1] = Math.max(high,intervals[j][1]);
                    intervals[i] = null;
                    break;
                }
            }
        }
        for(int i = 0;i<m;i++)
        {
            if(intervals[i]!=null)
                res.add(intervals[i]);
        }
        return res.toArray(new int[res.size()][2]);
    }
}