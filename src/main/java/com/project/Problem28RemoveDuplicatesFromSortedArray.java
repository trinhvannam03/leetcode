package com.project;


import java.util.Arrays;

public class Problem28RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        SolutionForProblem28RemoveDuplicatesFromSortedArray solution = new SolutionForProblem28RemoveDuplicatesFromSortedArray();
        int[] nums = new int[]{1, 1, 2, 2, 3, 3, 3, 6, 8, 9, 10, 10, 10, 12, 13};
        solution.removeDuplicates(nums);
        System.out.println(Arrays.toString(nums));
    }
}

class SolutionForProblem28RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int len = nums.length;
        int count = 1;
        if (len == 1 || len == 0) return len;
        int prev = nums[i] + 1;
        for (int j = 0; j < nums.length; j++) {
            if (prev != nums[j]) {
                prev = nums[j];
                nums[i++] = prev;
                count = 1;
                continue;
            }
            if (count == 1) {
                prev = nums[j];
                nums[i++] = prev;
                count++;
            }
        }
        return i;
    }
}
