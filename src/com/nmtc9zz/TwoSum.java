package com.nmtc9zz;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] array = {2,7,11,15};
        int target = 9;
        int[] result = twoSum(array,target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int[] result = new int[2];
        for(int i = 0;i < nums.length; i++){
            int secondNumber = target - nums[i];
            if(hashMap.containsKey(secondNumber)){
                result[0] = i;
                result[1] = hashMap.get(secondNumber);
                return result;
            }else {
                hashMap.put(nums[i], i);
            }
        }
        return result;
    }
}
