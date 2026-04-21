package com.dsa;

import java.util.*;

public class MergeIntervalsSimple {
    public static int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> list = new ArrayList<>();

        int start = intervals[0][0];
        int end = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {

            // if overlapping
            if (intervals[i][0] <= end) {
                end = Math.max(end, intervals[i][1]);
            } else {
                list.add(new int[]{start, end});
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }

        // add last interval
        list.add(new int[]{start, end});

        return list.toArray(new int[list.size()][]);
    }

    public static void main(String[] args) {
        int[][] arr = {{1,3},{2,6},{8,10},{15,18}};

        int[][] result = merge(arr);

        for (int[] i : result) {
            System.out.println(i[0] + " " + i[1]);
        }
    }
}