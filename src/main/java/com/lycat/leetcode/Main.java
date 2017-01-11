package com.lycat.leetcode;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args)  {
//        int[] nums = new int[]{2,7,12,13};
//        int[] result = twoSum(nums, 15);

//        System.out.println(result[0] + "," +result[1]);
        int a = 11 / 2;
        System.out.println(a);

        long lastTime = new Date().getTime();

        long base = new GregorianCalendar(0,0,0,0,0,0).getTime().getTime();
        DateFormat df = new SimpleDateFormat("HH:mm:ss");
        for (int t = 0; t < 60 * 60 * 12 * 2; t++) {
            int locHourHand = Math.round((t % (60 * 60 * 12)) / (60 * 12));
            int locMinuteHand = Math.round((t % (60 * 60)) / 60);
            int locSecondHand = t % 60;
            if (locHourHand == locMinuteHand && locHourHand == locSecondHand) {
                Date date = new Date(base + t * 1000);
                System.out.println(df.format(date));
            }
        }
    }

    private static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] res = new int[2];

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                res[0] = map.get(target - nums[i]);
                res[1] = i;
            }
            map.put(nums[i],i);
        }

        return res;

    }

}
