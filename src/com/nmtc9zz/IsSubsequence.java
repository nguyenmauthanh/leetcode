package com.nmtc9zz;

public class IsSubsequence {
    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgdc"));
    }

    public static boolean isSubsequence(String s, String t){
        int j = 0;
        for(int i = 0; j < s.length() && i < t.length() ; i++){
            if(s.charAt(j) == t.charAt(i)){
                j++;
            }
        }

        if(j == s.length()){
            return true;
        }
        return false;
    }
}
