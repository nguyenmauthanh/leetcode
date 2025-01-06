package com.nmtc9zz;

public class MoveZeroes {
    public static void main(String[] args) {
        moveZeroes(new int[]{0, 1, 0, 3, 2});
    }

    public static void moveZeroes(int[] nums){
        int index = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] != 0){
                nums[index++] = nums[i];
            }
        }

        for(int i = index; i < nums.length ; i++){
            nums[i] = 0;
        }
    }
}
