package com.nmtc9zz;

public class RunningSumof1dArray {
    public static void main(String[] args) {
        int[] array = {1,1,1,1,1};
        runningSum(array);
    }

    public static int[] runningSum(int[] nums) {
        int sum = nums[0];
        for(int i = 1; i < nums.length ; i++){
            nums[i] = nums[i] + sum;
            sum = nums[i];
        }
        return nums;
    }
}
