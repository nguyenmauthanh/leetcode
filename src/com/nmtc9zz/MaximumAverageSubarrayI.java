package com.nmtc9zz;

public class MaximumAverageSubarrayI {
    public static void main(String[] args) {
        System.out.println(findMaxAverage(new int[]{1,12,-5,-6,50,3}, 4));
    }

    public static double findMaxAverage(int[] nums, int k) {
        int currentSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }

        int maxSum = currentSum;
        for (int i = k; i < nums.length; i++) {
            currentSum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, currentSum);
        }

        return (double) maxSum / k;
    }
}

