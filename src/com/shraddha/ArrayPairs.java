package com.shraddha;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayPairs {
    public static int getMaxInList(List<Integer> arr) {
        Collections.sort(arr);
        return arr.get(arr.size() - 1);
    }

    public static void countPairs(List<Integer> arr) {
        int max = getMaxInList(arr);
        long count = 0;

        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) * arr.get(j) <= max) count++;
            }
        }
        System.out.println("Count = " + count);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 1, 2, 4, 2));
        System.out.println("Input Array = " + arr);
        countPairs(arr);
    }
}