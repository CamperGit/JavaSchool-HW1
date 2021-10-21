package ru.dataart.academy.java;

import java.util.Arrays;

public class TwoSums {
    /**
     * @param nums   - sorted in ascending order array of integer values >=0
     * @param target - integer value >= 0
     * @return - array of two numbers from nums which sum equals to target
     * Example: nums = [1, 4, 6, 7, 10], target = 10
     * Result - [4, 6]
     * Example: nums = [1, 4, 6, 7, 10], target = 2
     * Result - []
     */
    public int[] getTwoSum(int[] nums, int target) {
        // Task implementation
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1 + i; j < nums.length; j++) {
                int firstNum = nums[i];
                int secondNum = nums[j];
                if (firstNum + secondNum == target) {
                    return new int[]{firstNum, secondNum};
                }
            }
        }
        return new int[] {};
    }
}
