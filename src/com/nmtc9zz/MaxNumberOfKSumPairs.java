package com.nmtc9zz;

import java.util.HashMap;

public class MaxNumberOfKSumPairs {
    public static void main(String[] args) {
        System.out.println(maxOperations(new int[]{1,2,3,4}, 5));
        System.out.println(maxOperations(new int[]{3,1,3,4,3}, 6));
        System.out.println(maxOperations(new int[]{2,5,4,4,1,3,4,4,1,4,4,1,2,1,2,2,3,2,4,2}, 3));
    }

    public static int maxOperations(int[] nums, int k) {
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

        return res;
    }
}
