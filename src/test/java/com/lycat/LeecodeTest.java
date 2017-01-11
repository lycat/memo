package com.lycat;

import com.lycat.leetcode.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by liuyang on 2016/12/20.
 */
public class LeecodeTest {

    @Test
    public void test_for_hamming_distance() {
        HammingDistance distance = new HammingDistance();
        int result = distance.distance(1,4);
        assertEquals(2,result);
    }

    @Test
    public void test_for_fizz_buzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        List<String> result = fizzBuzz.fizzBuzz(15);
        assertEquals("Fizz", result.get(2).toString());
        assertEquals("Buzz", result.get(4).toString());
        assertEquals("Fizz", result.get(5).toString());
        assertEquals("FizzBuzz", result.get(14).toString());
    }

    @Test
    public void test_for_longest_palindromic_substring() {
        String s = new String("aabbcbba");
        LongestPalindromicSubstring l = new LongestPalindromicSubstring();
        String result = l.longestPalindrome(s);
        assertEquals(result, "abbcbba");
    }

    @Test
    public void test_for_gray_code() {
        GrayCode g = new GrayCode();
        List<Integer> result = g.grayCode(5);
        for (Integer num: result) {
            System.out.println(num);
        }
    }

    @Test
    public void test_for_number_of_islands() {
        char[][] grid = new char[][]{{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};
        NumberOfIslands number = new NumberOfIslands();
        int num = number.numIslands(grid);
        assertEquals(1, num);
    }

    @Test
    public void test_for_factorial() {
        Factorial f = new Factorial();
        int result = f.factorCalc(5);
        assertEquals(120 , result);
    }

    @Test
    public void test_for_sub_set() {
        SubSet s = new SubSet();
        ArrayList<ArrayList<Integer>> result = s.subsets(new int[]{1,2,3});
    }

    @Test
    public void test_for_shortest_words_distance() {
        ShortestWordDistance s = new ShortestWordDistance();
        String[] words = new String[] {"practice", "makes", "perfect", "coding", "makes"};
        int min = s.shortestDistance(words,"makes","coding");
        assertEquals(1, min);
    }

}