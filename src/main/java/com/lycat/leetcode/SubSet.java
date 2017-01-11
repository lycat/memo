package com.lycat.leetcode;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by liuyang on 16/12/30.
 */
public class SubSet {

    public ArrayList<ArrayList<Integer>> subsets(int[] S) {
        Arrays.sort(S);
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        result.add(new ArrayList<Integer>());
        for (int i = 0; i < S.length; i++) {
            int n = result.size();
            for (int j = 0; j <  n; j++) {
                ArrayList<Integer> temp = new ArrayList<Integer>(result.get(j));
                temp.add(S[i]);
                result.add(temp);
            }
        }
        return result;
    }
}
