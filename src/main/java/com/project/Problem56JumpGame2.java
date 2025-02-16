package com.project;

public class Problem56JumpGame2 {
    public static void main(String[] args) {
        SolutionFor56JumpGame2 solution = new SolutionFor56JumpGame2();
        int[] nums = new int[]{2, 3, 1, 1, 4};
        System.out.println(solution.jump(nums));
    }
}

class SolutionFor56JumpGame2 {
    public int jump(int[] nums) {
        int len = nums.length;
        int lastNode = len - 1;
        int stepCount = 0;
        while (lastNode != 0) {
            for (int i = 0; i <= lastNode; i++) {
                if (nums[i] >= lastNode - i) {
                    lastNode = i;
                    stepCount++;
                    break;
                }
            }
        }
        return stepCount;
    }
}
