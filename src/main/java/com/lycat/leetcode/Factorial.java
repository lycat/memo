package com.lycat.leetcode;

/**
 * Created by liuyang on 16/12/29.
 */
public class Factorial {
    public int factorCalc(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        if (n == 0 || n == 1) return 1;
        return n * factorCalc(n-1);
    }
}
