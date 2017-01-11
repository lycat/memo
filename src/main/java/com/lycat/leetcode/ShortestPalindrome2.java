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

public class ShortestPalindrome2 {
    public String findShortest(String s) {
        String rev = new StringBuilder(s).reverse().toString();

        String temp = s + "@" + rev;

        int[] next = new int[temp.length()];

        for (int i = 1; i < temp.length(); i++) {
            int j = next[i - 1];
            while (j > 0 && temp.charAt(i) != temp.charAt(j)) j = next[j-1];
            j += temp.charAt(i) == temp.charAt(j) ? 1 : 0;
            next[i] = j;
        }

        return rev.substring(0, s.length() - next[temp.length() -1]) + s;
    }
}
