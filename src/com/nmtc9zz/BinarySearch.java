package com.nmtc9zz;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        int target = 7;
        System.out.println(search(array, target));
    }

    public static int search(int[] nums, int target) {

        int low=0,high=nums.length-1;


        while(low<=high)
        {
            int mid =(low+high)/2;
            if(nums[mid]==target)
                return mid;

            if(nums[mid]<target)
                low=mid+1;
            else
                high=mid-1;

        }

        return -1;
    }
}
