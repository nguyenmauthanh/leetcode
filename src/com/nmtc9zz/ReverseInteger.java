package com.nmtc9zz;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(-123));
    }

    public static int reverse(int x) {
        Integer max = Integer.MAX_VALUE;
        Integer min = Integer.MIN_VALUE;

        int reversedNumber = 0;

        while(x != 0){
            int remainder = x % 10;

            boolean isOutOfUnderBound = (reversedNumber > max / 10) || (reversedNumber == max /10 && remainder > (max % 10));
            boolean isOutOfUpperBound = (reversedNumber < min / 10) || (reversedNumber == min /10 && remainder < (max % 10));

            if(isOutOfUnderBound || isOutOfUpperBound){
                return 0;
            }
            reversedNumber = reversedNumber * 10 + remainder;
            x /= 10;
        }

        return reversedNumber;
    }
}
