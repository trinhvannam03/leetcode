package com.project;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem169MajorityElement {
    public static void main(String[] args) {
        SolutionForProblem169MajorityElement solution = new SolutionForProblem169MajorityElement();
        int[] nums = new int[]{3, 2};
        int majority = solution.majorityElement(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(majority);
    }
}

class SolutionForProblem169MajorityElement {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int majority = 0;
        for (int num : nums) {
            int count = map.getOrDefault(num, 0);
            if (count == max) {
                max = count + 1;
                majority = num;
            }
            if (max > nums.length / 2) {
                return majority;
            }
            map.put(num, count + 1);
        }
        return majority;
    }
}