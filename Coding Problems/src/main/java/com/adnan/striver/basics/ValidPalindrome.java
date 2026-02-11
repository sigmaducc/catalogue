package com.adnan.striver.basics;

// Leetcode: 125 (EASY)
// https://leetcode.com/problems/valid-palindrome/description/
// 
// Note: Could use two pointer approach to avoid rebuilding the string again. Simply move pointer if it is 
// non-alphanumeric character from both ends. If both pointers are alphanumeric only then compare and then 
// move both pointers again.
// 
// Revisit: Java Character/String concepts

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {
            if(Character.isLetterOrDigit(ch)) {
                sb.append(ch);
            }
        }

        String str = sb.toString();
        int lastIndex = str.length() - 1;

        for(int i = 0; i < str.length() / 2; i++) {
            char startChar = Character.toLowerCase(str.charAt(i));
            char endChar = Character.toLowerCase(str.charAt(lastIndex - i));

            if(startChar != endChar) 
                return false;
        }

        return true;
    }
}