package com.lycat.leetcode;

/**
 * Created by liuyang on 2016/12/20.
 */
public class HammingDistance {
    public int distance(int x, int y) {
        int val = x ^ y;
        int dist = 0;
        while (val > 0) {
            ++dist;
            val &= val - 1;
            System.out.println(val);
        }
        return dist;
    }
}


