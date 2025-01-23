package com.nmtc9zz;

public class GreatestCommonDivisorOfStrings {
    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABCABC", "ABC"));
    }

    public static String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        for (int i = Math.min(str1.length(), str2.length()); i > 0; i--) {
            if (checkSubStrMatched(str1, str2, i)) {
                return str1.substring(0, i);
            }
        }
        return "";
    }

    public static boolean checkSubStrMatched(String str1, String str2, int k) {
        int len1 = str1.length(), len2 = str2.length();
        if (len1 % k > 0 || len2 % k > 0) {
            return false;
        } else {
            String base = str1.substring(0, k);
            return str1.replace(base, "").isEmpty() && str2.replace(base, "").isEmpty();
        }
    }
}
