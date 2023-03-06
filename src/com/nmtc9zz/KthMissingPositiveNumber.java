package com.nmtc9zz;

public class KthMissingPositiveNumber {
    public static void main(String[] args) {
        int[] array = {2,3,4,7,11};
        System.out.println(findKthPositive(array, 5));
    }

    public static int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int start = 0, end = n-1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] - (mid + 1) < k)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return start + k;
    }
}
