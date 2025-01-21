package com.nmtc9zz;

public class FindTheHighestAltitude {
    public static void main(String[] args) {
        System.out.println(largestAltitude(new int[]{-5,1,5,0,-7}));
        System.out.println(largestAltitude(new int[]{-4,-3,-2,-1,4,3,2}));
    }

    public static int largestAltitude(int[] gain) {
        int altitudeCurrent = 0;
        int altitudeMax = 0;
        for (int j : gain) {
            altitudeCurrent += j;
            altitudeMax = Math.max(altitudeMax, altitudeCurrent);
        }
        return altitudeMax;
    }
}
