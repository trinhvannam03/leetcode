package com.project;

import java.util.Arrays;

public class Problem88MergeSortedArray {
    public static void main(String[] args) {
        SolutionFor88MergeSortedArray solution = new SolutionFor88MergeSortedArray();
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        solution.merge(nums1, 3, new int[]{2, 5, 6}, 3);
        System.out.println(Arrays.toString(nums1));
    }
}

//increasing order
class SolutionFor88MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1;
        int last = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[last--] = nums1[i--];
            } else {
                nums1[last--] = nums2[j--];
            }
        }
        if (j >= 0) {
            for (int k = j; k >= 0; k--) {
                nums1[last--] = nums2[k];
            }
        } else {
            for (int k = i; k >= 0; k--) {
                nums1[last--] = nums1[k];
            }
        }
    }
}
