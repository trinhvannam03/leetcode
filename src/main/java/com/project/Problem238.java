package com.project;

import java.util.Arrays;

public class Problem238 {
    public static void main(String[] args) {

    }
}

/**
 * Example 1:
 * Input: nums = [1,2,3,4]
 * Output: [24,12,8,6]
 // *
 * Example 2:
 * Input: nums = [-1,1,0,-3,3]
 * Output: [0,0,9,0,0]
 */

class Solution238 {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int len = nums.length;
        int[] left = new int[len];
        int[] right = new int[len];
        left[0] = 1;
        right[len - 1] = 1;
        for (int i = 1; i < len; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }
        for (int i = len - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }
        for (int i = 0; i < len; i++) {
            res[i] = left[i] * right[i];
        }
        return res;
    }
}
