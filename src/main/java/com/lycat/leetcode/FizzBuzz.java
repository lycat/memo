package com.lycat.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liuyang on 2016/12/20.
 */
public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<String>();

        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0){
                result.add("FizzBuzz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else if (i % 3 == 0) {
                result.add("Fizz");
            } else {
                result.add(""+i);
            }
        }
        return result;
    }
}
