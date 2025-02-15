package com.project;

import java.util.*;

public class Problem189RotateArray {
    public static void main(String[] args) {
        Solution189RotateArray solution = new Solution189RotateArray();

        // Test case 1
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        int k1 = 3;
        solution.rotate(nums1, k1);
        System.out.println("Rotated array: " + Arrays.toString(nums1)); // Expected: [5, 6, 7, 1, 2, 3, 4]

        // Test case 2
        int[] nums2 = {-1, -100, 3, 99};
        int k2 = 2;
        solution.rotate(nums2, k2);
        System.out.println("Rotated array: " + Arrays.toString(nums2)); // Expected: [3, 99, -1, -100]

        // Test case 3 (No rotation needed)
        int[] nums3 = {1, 2, 3, 4, 5};
        int k3 = 5;
        solution.rotate(nums3, k3);
        System.out.println("Rotated array: " + Arrays.toString(nums3)); // Expected: [1, 2, 3, 4, 5]
    }
}

class Solution189RotateArray {
    public void rotate(int[] nums, int k) {
        if (k == 0 || k == nums.length) {
            return;
        }
        int len = nums.length;
        int step = k % len;
        int[] ints = new int[k];
        for (int i = 0; i < step; i++) {
            ints[i] = nums[len - step + i];
        }
        for (int i = len - 1; i >= 0; i--) {
            if (i < step) {
                nums[i] = ints[i];
            } else {
                nums[i] = nums[i - step];
            }
        }
    }
}