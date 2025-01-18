package com.nmtc9zz;

import java.util.Arrays;
import java.util.HashMap;

public class MaxNumberOfKSumPairs {
    public static void main(String[] args) {
        System.out.println(maxOperationsUseHashMap(new int[]{1,2,3,4}, 5));
        System.out.println(maxOperationsUseHashMap(new int[]{3,1,3,4,3}, 6));
        System.out.println(maxOperationsUseHashMap(new int[]{2,5,4,4,1,3,4,4,1,4,4,1,2,1,2,2,3,2,4,2}, 3));

        System.out.println(maxOperationsUseTwoPointer(new int[]{1,2,3,4}, 5));
        System.out.println(maxOperationsUseTwoPointer(new int[]{3,1,3,4,3}, 6));
        System.out.println(maxOperationsUseTwoPointer(new int[]{2,5,4,4,1,3,4,4,1,4,4,1,2,1,2,2,3,2,4,2}, 3));
    }

    // Use Hash Map
    public static int maxOperationsUseHashMap(int[] nums, int k) {
        long startTime = System.nanoTime();
        HashMap<Integer, Integer> map = new HashMap<>();
        int res = 0;

        for (int num : nums) {
            int compensation = k - num;

            if (map.containsKey(compensation) && map.get(compensation) > 0) {
                res++;
                map.put(compensation, map.get(compensation) - 1);
            } else {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }
        long endTime = System.nanoTime();
        System.out.println("maxOperationsUseHashMap:" + (endTime - startTime));
        return res;
    }

    // Use Algo Two Pointer
    public static int maxOperationsUseTwoPointer(int[] nums, int k) {
        long startTime = System.nanoTime();
        Arrays.sort(nums);
        int left = 0, right = nums.length - 1;
        int res = 0;

        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == k) {
                res++;
                left++;
                right--;
            } else if (sum < k) {
                left++;
            } else {
                right--;
            }
        }
        long endTime = System.nanoTime();
        System.out.println("maxOperationsUseTwoPointer:" + (endTime - startTime));
        return res;
    }
}
