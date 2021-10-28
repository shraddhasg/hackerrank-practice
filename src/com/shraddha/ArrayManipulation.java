package com.shraddha;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayManipulation {
    public static int[] fillArray(int[] arr, int start, int end, int val) {
        for (int i = start - 1; i < end; i++) arr[i] += val;
        return arr;
    }

    public static long findMax(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    public static long arrayManipulation(int n, List<List<Integer>> queries) {
        int[] arr = new int[n];
        int start = 0, end = 0, val = 0;
        for (int i = 0; i < queries.size(); i++) {
            start = queries.get(i).get(0);
            end = queries.get(i).get(1);
            val = queries.get(i).get(2);
            arr = fillArray(arr, start, end, val);
            System.out.println(Arrays.toString(arr));
        }
//        long max = 0;
//        int prevStart = 0, prevEnd = 0, currentStart = 0;
//        long sum = 0l;
//        max = queries.get(0).get(2);
//        for (int i = 1; i < queries.size(); i++) {
//            currentStart = queries.get(i).get(0);
//            prevStart = queries.get(i - 1).get(0);
//            prevEnd = queries.get(i - 1).get(1);
//            System.out.println(currentStart + "--" + prevEnd + "--" + prevStart);
//            if (currentStart <= prevEnd && currentStart >= prevStart) {
////                sum = queries.get(i - 1).get(2) + queries.get(i).get(2);
////                System.out.println("Sum = " + sum);
////                max = Math.max(max, sum);
//                System.out.println(max);
//                max += queries.get(i).get(2);
//                System.out.println("max = " + max);
//
//            }
//        }
//        return max;
        return findMax(arr);
    }

    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> queries = new ArrayList<>();
        queries.add(new ArrayList<Integer>(Arrays.asList(1, 2, 100)));
        queries.add(new ArrayList<Integer>(Arrays.asList(2, 5, 100)));
        queries.add(new ArrayList<Integer>(Arrays.asList(3, 4, 100)));
//        queries.add(new ArrayList<Integer>(Arrays.asList(5, 9, 15)));
        System.out.println("Queries = " + queries);
//        int[] arr = new int[10];
//        arr = fillArray(arr, 3, 5, 1);
//        System.out.println(Arrays.toString(arr));
        long ans = arrayManipulation(n, queries);
        System.out.println("Max in arr = " + ans);

//        arrayManipulation(n, queries);
    }
}
