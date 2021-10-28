package com.shraddha;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DynamicArray {
    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        int lastAns = 0;
        ArrayList<Integer> arr = new ArrayList<>();

        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) list.add(new ArrayList<>());

        int index = 0;
        for (int i = 0; i < queries.size(); i++) {
            index = (queries.get(i).get(1) ^ lastAns) % n;
            if (queries.get(i).get(0) == 1) {
                list.get(index).add(queries.get(i).get(2));
            } else if (queries.get(i).get(0) == 2) {
                lastAns = list.get(index).get(queries.get(i).get(2));
                arr.add(lastAns);
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int n = 2;
        List<List<Integer>> queries = new ArrayList<>();
        queries.add(new ArrayList<>(Arrays.asList(1, 0, 5)));
        queries.add(new ArrayList<>(Arrays.asList(1, 1, 7)));
        queries.add(new ArrayList<>(Arrays.asList(1, 0, 3)));
        queries.add(new ArrayList<>(Arrays.asList(2, 1, 0)));
        queries.add(new ArrayList<>(Arrays.asList(2, 1, 1)));
        System.out.println("Input queries = " + queries);

        List<Integer> ans = dynamicArray(n, queries);
        System.out.println("Ans = " + ans);
    }
}
