package com.nmtc9zz;

import java.util.Arrays;

public class SquaresOfaSortedArray {
    public static void main(String[] args) {
        int[] array = {-7,-3,2,3,11};
        int[] result = sortedSquares(array);
        System.out.println(Arrays.toString(result));
    }

    public static int[] sortedSquares(int[] nums){
        int[] result = new int[nums.length];

//        int smallestOfArray = nums[0];
//        int biggestOfArray = nums[nums.length -1];

        int left = 0;
        int right = nums.length - 1;
        int count = right;
        while(left <= right){
            if (Math.abs(nums[left]) < Math.abs(nums[right])) {
                result[count] = nums[right] * nums[right];
                right--;
                count--;
            } else {
                result[count] = nums[left] * nums[left];
                left++;
                count--;
            }
        }
        return result;
    }
}
