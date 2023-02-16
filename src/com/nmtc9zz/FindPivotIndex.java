package com.nmtc9zz;

public class FindPivotIndex {
    public static void main(String[] args) {
        int[] array = {1,7,3,6,5,6};
        System.out.println(pivotIndex(array));
    }

    public static int pivotIndex(int[] nums){
        int totalNums = 0;
        int leftTotalNums = 0;

        for(int element : nums){
            totalNums += element;
        }
        for(int i = 0; i < nums.length ; leftTotalNums += nums[i++]){
            if(leftTotalNums * 2 == (totalNums - nums[i])){
                return i;
            }
        }
        return -1;
    }
}
