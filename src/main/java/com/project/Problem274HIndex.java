package com.project;

import java.util.Arrays;

public class Problem274HIndex {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 1};
        Solution274HIndex sol = new Solution274HIndex();
        System.out.println(sol.hIndex(nums));
    }
}

class Solution274HIndex {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int[] count = new int[n + 1];

        for (int citation : citations) {
            if (citation >= n) {
                count[n]++;
            } else {
                count[citation]++;
            }
        }

        int total = 0;
        for (int i = n; i >= 0; i--) {
            total += count[i];
            if (total >= i) {
                return i;
            }
        }
        return 0;
    }
}
