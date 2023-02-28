package com.nmtc9zz;

import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        int[] array = {2,1,2,2,1,1,1};
        System.out.println(majorityElement(array));
    }

    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            hashMap.put(nums[i], hashMap.getOrDefault(nums[i], 0) + 1);
        }
        for(Integer x : hashMap.keySet()){
            if(hashMap.get(x) > nums.length / 2){
                return x;
            }
        }
        return -1;
    }

}
