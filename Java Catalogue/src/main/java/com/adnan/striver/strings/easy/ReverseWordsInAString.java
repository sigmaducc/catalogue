package com.adnan.striver.strings.easy;

// LeetCode 151: MEDIUM
// https://leetcode.com/problems/reverse-words-in-a-string/

// Approach 1: Use string build-ins to first replace all the spaces with only
// one space. Then split the string using " " as delimiter that would give
// all the words. We then iterate over this array from back and add into
// our string builder and after each element we add a space. In the end
// we return this string builder in string form and strip the spaces.

// Approach 2: We use reverse integer array trick here. We get the char array
// from string. We first reverse the whole array. Then we reverse words of
// array to actually reverse the whole sentence.
// The trick here is to clean spaces. Every other part is easy.
// To clean the array of extra spaces, we keep 2 pointers one to
// go through the array and other to keep track of where we wrote last.
// So there are 2 scenarios:
// 1. When the sentence starts with spaces
// 2. When the array starts with words
// When the array starts with spaces we need to go to the first non-space
// char. j pointer remains at 0. So once i encounters non-space chars we
// start writing it at j. Then we may encounter space within sentence in
// which case we add one space at j position and keep i moving until we
// find non-space char. This would handle all the scenarios.
// At last before returning we need to make sure there are no trailing spaces.
// So we reduce j until we find that prev element is not space.

public class ReverseWordsInAString {

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public String reverseWords(String s) {
        char[] chars = s.toCharArray();
        int length = cleanSpace(chars);

        int prevSpace = -1;
        reverse(chars, 0, length-1);
        for(int i = 0; i <= length-1; i++) {
            if(chars[i] == ' ') {
                reverse(chars, prevSpace+1, i-1);
                prevSpace = i;
            }
        }
        reverse(chars, prevSpace+1, length-1);

        return new String(chars, 0, length);
    }

    private void reverse(char[] chars, int low, int high) {
        char temp;
        while(low <= high) {
            temp = chars[low];
            chars[low] = chars[high];
            chars[high] = temp;

            low++;
            high--;
        }
    }

    private int cleanSpace(char[] chars) {
        int i = 0; // First non-space
        int j = 0; // write position always lesser than i

        while(i <= chars.length - 1 && chars[i] == ' ') i++;

        while(j <= i && i <= chars.length - 1) {
            if(chars[i] != ' ') {
                chars[j++] = chars[i++];
            } else {
                chars[j++] = ' ';
                while(i <= chars.length - 1 && chars[i] == ' ') i++;
            }
        }

        while(j > 0 && chars[j-1] == ' ') j--;

        return j;
    }

    // Time Complexity: O(n)
    // Space Complexity: O(n)
//    public String reverseWords(String s) {
//        String[] str = s.replaceAll(" +", " ")
//                        .split(" ");
//        int n = str.length;
//        StringBuilder sb = new StringBuilder();
//        for(int i = n-1; i >= 0; i--) {
//            sb.append(str[i]).append(" ");
//        }
//
//        return sb.toString().strip();
//    }

}
