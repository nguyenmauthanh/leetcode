package com.nmtc9zz;

import java.util.HashSet;
import java.util.Set;

public class CanPlaceFlowers {
    public static void main(String[] args) {
        int[] placeFlowers = {0, 0 , 1, 0 , 0};
        int n = 1;
        System.out.println(canPlaceFlowers(placeFlowers, n));
    }

    /**
     * You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.
     *
     * Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n,
     * return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.
     * @param flowerbed
     * @param n
     * @return
     */
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                boolean leftValid = i == 0 || flowerbed[i - 1] == 0;
                boolean rightValid = i == flowerbed.length - 1 || flowerbed[i + 1] == 0;

                if (leftValid && rightValid) {
                    flowerbed[i] = 1;
                    n--;
                }
            }
        }
        return n <= 0;
    }
}
