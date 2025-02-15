package com.project;

import java.util.List;
import java.util.Stack;

public class Problem55JumpGame {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 0, 0};
        Solution55JumpGame sol = new Solution55JumpGame();
        System.out.println(
                sol.canJump(nums)
        );
    }
}

class Solution55JumpGame {
    public boolean canJump(int[] nums) {
        int len = nums.length;
        int nearestNode = len - 1;
        for (int i = len - 2; i >= 0; i--) {
            if (nums[i] >= nearestNode - i) {
                nearestNode = i;
            }
        }
        return nearestNode == 0;
    }
}