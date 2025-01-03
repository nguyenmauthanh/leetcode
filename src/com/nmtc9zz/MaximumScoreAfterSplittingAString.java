package com.nmtc9zz;

public class MaximumScoreAfterSplittingAString {
    public static void main(String[] args) {
        System.out.println(maxScore("011101"));
    }

    public static int maxScore(String s) {
        int numberOfOnes = 0;
        int numberOfZeros = 0;
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                numberOfOnes++;
            }
        }

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0') {
                numberOfZeros++;
            } else {
                numberOfOnes--;
            }

            result = Math.max(result, numberOfOnes + numberOfZeros);
        }

        return result;
    }
}
