package com.nmtc9zz;


import java.util.Arrays;

public class ProductAfArrayExceptSelf {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.toString(productExceptSelf(array)));
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int[] multiplicationOfPrefixValues = new int[nums.length];
        Arrays.fill(multiplicationOfPrefixValues, 1);

        for (int i = 1; i < nums.length; i++) {
            multiplicationOfPrefixValues[i] = multiplicationOfPrefixValues[i-1] * nums[i - 1];
        }

        int multiplicationOfSuffixValues = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            res[i] = multiplicationOfPrefixValues[i] * multiplicationOfSuffixValues;
            multiplicationOfSuffixValues = multiplicationOfSuffixValues * nums[i];
        }

        return res;
    }
}
