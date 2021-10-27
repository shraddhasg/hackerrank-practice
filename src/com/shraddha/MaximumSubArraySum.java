package com.shraddha;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaximumSubArraySum {
    public static long findMax(long[][] t) {
        for (int i = 0; i < t.length; i++) Arrays.sort(t[i]);
        System.out.println("Sorted matrix= ");
        for (int i = 0; i < t.length; i++) System.out.println(Arrays.toString(t[i]));
        long max = t[0][t[0].length - 1];
        for (int i = 1; i < t.length; i++) max = Math.max(max, t[i][t[0].length - 1]);
        return max;
    }

    public static long fillArray(ArrayList<Long> list, long m) {
        long[][] t = new long[list.size()][list.size()];
        long sum = 0l;

        for (int i = 0; i < t.length; i++) {
            for (int j = i; j < t[i].length; j++) {
                if (i == j) {
                    sum = list.get(i);
                } else {
                    sum = list.get(i) + list.get(j);
                }
                t[i][j] = sum % m;
            }
        }

        System.out.println("Matrix = ");
        for (int i = 0; i < t.length; i++) System.out.println(Arrays.toString(t[i]));
        return findMax(t);

    }

    public static long maximumSum(List<Long> a, long m) {
        ArrayList<Long> list = new ArrayList<>(a);
        return fillArray(list, m);
    }

    public static void main(String[] args) {
        List<Long> list = Arrays.asList(1l, 5l, 9l);
        long m = 5l;
        long max = maximumSum(list, m);
        System.out.println("List = " + list + "\n" + "M = " + m);
        System.out.println("Maximum sum = " + max);
    }
}
/*
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
*/