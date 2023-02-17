package com.nmtc9zz;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] array = {1,3,5,8,9,10,11};
        int target = 6;
        System.out.println(searchInsert(array, target));
    }

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length;

        while(left < right){
            int mid = left + (right - left) / 2;
            if(nums[mid] == target){
                return mid;
            }else if (nums[mid] < target){
                left = mid+1;
            }else {
                right = mid;
            }
        }
        return left;
    }

}
