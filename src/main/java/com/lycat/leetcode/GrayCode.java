package com.lycat.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liuyang on 16/12/28.
 */
public class GrayCode {
    public List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<Integer>();

        if (n == 0) {
            result.add(0);
            return result;
        }

        result.add(0);
        result.add(1);

        for (int i = 2; i <= n; i++) {
            int addNumber = 1 << (i-1);
            for (int j = result.size() - 1; j >= 0; j--) {
                result.add(addNumber + result.get(j));
            }
        }

        return result;
    }
}
