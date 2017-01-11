package com.lycat.leetcode;

/**
 * Created by liuyang on 2017/1/3.
 *
 */
/*
 Given a string S, you are allowed to convert it to a palindrome by adding characters in front of it.
 Find and return the shortest palindrome you can find by performing this transformation.
 For example:

 Given "aacecaaa", return "aaacecaaa".

 Given "abcd", return "dcbabcd".

 Difficulty: Hard
*/
public class ShortestPalindrome {
    public String findShortest(String s) {
        if (s.isEmpty()) return "";
        if (s.length() == 1) return s;
        int i = 0;
        int end = s.length() - 1;
        int j = end;
        char[] arr = s.toCharArray();
        while (i < j) {
            if (arr[i] == arr[j]) {
                i++;
                j--;
            } else {
                i = 0;
                --end;
                j = end;
            }
        }

        return new StringBuilder(s.substring(end+1)).reverse() + s;
    }
}
