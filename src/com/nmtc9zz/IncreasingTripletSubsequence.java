package com.nmtc9zz;


public class IncreasingTripletSubsequence {
    public static void main(String[] args) {
        System.out.println(increasingTriplet(new int[]{1,2,3,4,5}));
        System.out.println(increasingTriplet(new int[]{5,4,3,2,1}));
        System.out.println(increasingTriplet(new int[]{2,1,5,0,4,6}));
        System.out.println(increasingTriplet(new int[]{1,5,0,4,1,3}));
        System.out.println(increasingTriplet(new int[]{1,1,-2,6}));
    }

    public static boolean increasingTriplet(int[] nums) {
        if (nums.length < 3) {
            return false;
        }

        int[] leftMinArr = new int[nums.length];
        int[] rightMaxArr = new int[nums.length];


        // Initialize leftMinArr
        int minLeft = leftMinArr[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < minLeft) {
                minLeft = nums[i];
            }
            leftMinArr[i] = minLeft;
        }

        // Initialize rightMaxArr
        int maxRight = rightMaxArr[nums.length - 1] = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] > maxRight) {
                maxRight = nums[i];
            }
            rightMaxArr[i] = maxRight;
        }

        // Check if there exists a valid triplet
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > leftMinArr[i] && nums[i] < rightMaxArr[i]) {
                return true;
            }
        }

        return false;
    }
}
