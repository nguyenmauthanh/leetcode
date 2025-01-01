package com.nmtc9zz;

public class ReverseVowelsOfAString {
    public static void main(String[] args) {
        System.out.println(reverseVowels("leetcode"));
    }

    public static String reverseVowels(String s) {
        char[] word = s.toCharArray();
        int startIndex = 0;
        int endIndex = s.length() - 1;
        String vowels = "aeiouAEIOU";

        while (startIndex < endIndex) {
            while (startIndex < endIndex && vowels.indexOf(word[startIndex]) == -1) {
                startIndex++;
            }

            while (startIndex < endIndex && vowels.indexOf(word[endIndex]) == -1) {
                endIndex--;
            }

            char temp = word[startIndex];
            word[startIndex] = word[endIndex];
            word[endIndex] = temp;

            startIndex++;
            endIndex--;
        }

        return new String(word);
    }

}
