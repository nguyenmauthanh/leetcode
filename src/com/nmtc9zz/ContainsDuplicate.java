package com.nmtc9zz;

import java.util.HashMap;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] array = {1,2,3,1};
        System.out.println(containsDuplicate(array));
    }

    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return true;
            }
            map.put(nums[i],1);
        }
        return false;
    }
}
