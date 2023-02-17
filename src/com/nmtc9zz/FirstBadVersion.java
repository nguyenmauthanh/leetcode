package com.nmtc9zz;


public class FirstBadVersion {
    public static void main(String[] args) {

    }
    public int firstBadVersion(int n) {
        int left = 0;
        int right = n;

        while(left<=right){
            int mid = left + (right-left)/2;
            if(isBadVersion(mid)==true && isBadVersion(mid-1)==false)   return mid;
            else if(isBadVersion(mid)==false ) left = mid+1;
            else right= mid;
        }
        return -1;
    }

    private boolean isBadVersion(int mid) {
        return true;
    }
}
