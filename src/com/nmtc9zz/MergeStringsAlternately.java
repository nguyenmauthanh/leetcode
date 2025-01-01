package com.nmtc9zz;

public class MergeStringsAlternately {
    public static void main(String[] args) {
        System.out.println(mergeAlternately("abc", "1234"));
    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder mergedStr = new StringBuilder();
        int i = 0, j = 0;
        while (i < word1.length() || j < word2.length()) {
            if (i < word1.length()) {
                mergedStr.append(word1.charAt(i++));
            }

            if (j < word2.length()) {
                mergedStr.append(word2.charAt(j++));
            }
        }
        return mergedStr.toString();
    }
}
