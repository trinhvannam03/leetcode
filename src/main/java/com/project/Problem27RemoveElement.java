package com.project;

import java.util.Arrays;

public class Problem27RemoveElement {
    public static void main(String[] args) {
        SolutionFor27RemoveElement solution = new SolutionFor27RemoveElement();
        int[] target = new int[]{3, 2, 2, 3};
        int count = solution.removeElement(target, 3);
        System.out.println(Arrays.toString(target));
        System.out.println(count);
    }
}


class SolutionFor27RemoveElement {
    public int removeElement(int[] nums, int val) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j++] = nums[i];
            }
        }
        return j; // New length of the modified array
    }
}