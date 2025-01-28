package com.nmtc9zz;

import java.util.Arrays;

public class ThreeSumClosest {
    public static void main(String[] args) {
        System.out.println(threeSumClosest(new int[]{-1,2,1,-4}, 1));
        System.out.println(threeSumClosest(new int[]{0,0,0,0}, 1));
    }

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int max = Integer.MAX_VALUE;
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1, k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == target) {
                    return sum;
                }

                if (Math.abs(sum - target) < max) {
                    max = Math.abs(sum - target);
                    result = sum;
                }

                if (sum > target) {
                    k--;
                }

                if (sum < target) {
                    j++;
                }
            }
        }
        return result;
    }
}
