package com.project;

import java.util.Arrays;

public class Problem26RemoveDuplicates {
    public static void main(String[] args) {
        SolutionFor26RemoveDuplicates solution = new SolutionFor26RemoveDuplicates();
        int[] nums = new int[]{1, 1, 2};
        solution.removeDuplicates(nums);
        System.out.println(Arrays.toString(nums));
    }
}

class SolutionFor26RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int len = nums.length;
        if (len == 1 || len == 0) return len;
        int prev = nums[i] + 1;
        for (int j = 0; j < nums.length; j++) {
            if (prev != nums[j]) {
                prev = nums[j];
                nums[i++] = prev;
            }
        }
        return i;
    }
}