package com.shraddha;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountTriplets {
    public static int findIndex(long val, List<Long> arr, int index) {
        for (int i = index; i < arr.size(); i++) {
            if (arr.get(i) == val) return i;
        }
        return Integer.MIN_VALUE;
    }

    public static void findTriplet(List<Long> arr, long r) {
        int index = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            long one = arr.get(i) * r;
//            System.out.println(one);
            index = findIndex(one, arr, i + 1);
            if (index > 0) {
                arr.add(index, );
            }
        }
    }

    public static void main(String[] args) {
        List<Long> arr = Arrays.asList(1L, 5L, 5L, 25L, 125L);
        System.out.println(arr);
        findTriplet(arr, 5);
    }
}
