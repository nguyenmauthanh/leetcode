package com.nmtc9zz;

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("race a car"));
    }

    public static boolean isPalindrome(String s){
        if(s.isEmpty()){
            return true;
        }

        int start = 0;
        int end = s.length() -1;

        while(start <= end){
            char currentCharFirst = s.charAt(start);
            char currentCharLast = s.charAt(end);

            if(!Character.isLetterOrDigit(currentCharFirst)){
                start++;
            } else if(!Character.isLetterOrDigit(currentCharLast)){
                end--;
            } else{
                if(Character.toUpperCase(currentCharFirst) != Character.toUpperCase(currentCharLast)){
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;
    }
}
