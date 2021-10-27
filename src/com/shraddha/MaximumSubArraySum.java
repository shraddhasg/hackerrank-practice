package com.shraddha;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaximumSubArraySum {
    public static String createStringOfList(ArrayList<Long> list) {
        String str = "";
        for (int i = 0; i < list.size(); i++) str += list.get(i) + "";
        return str;
    }

    public static long findSum(String str, long m) {
        long sum = 0l;
        for (int i = 0; i < str.length(); i++) sum += Long.parseLong(String.valueOf(str.charAt(i)));
        return sum % m;
    }

    public static long maximumSum(List<Long> a, long m) {
        ArrayList<Long> list = new ArrayList<>(a);
        String str = createStringOfList(list);
        String subString = "";
        long max = Long.MIN_VALUE;
        long modSum = 0l;

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                subString = str.substring(i, j);
                modSum = findSum(subString, m);
                max = Math.max(max, modSum);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        List<Long> list = Arrays.asList(3l, 3l, 9l, 9l, 5l);
        long m = 7l;
        System.out.println(list);
        long max = maximumSum(list, m);
        System.out.println("Output =" + max);
    }
}