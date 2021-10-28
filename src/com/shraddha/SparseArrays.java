package com.shraddha;

import java.util.*;

public class SparseArrays {
    public static HashMap<String, Integer> createMap(List<String> strings) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.size(); i++) {
            if (map.containsKey(strings.get(i))) map.put(strings.get(i), map.get(strings.get(i)) + 1);
            else map.put(strings.get(i), 1);
        }
        return map;
    }

    public static ArrayList<Integer> getMatchingStringsCount(HashMap<String, Integer> map, List<String> queries) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < queries.size(); i++) {
            if (map.containsKey(queries.get(i))) arr.add(map.get(queries.get(i)));
            else arr.add(0);
        }
        return arr;
    }

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        HashMap<String, Integer> map = createMap(strings);
        System.out.println(map);
        return getMatchingStringsCount(map, queries);
    }

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(Arrays.asList("aba", "baba", "aba", "xzxb"));
        List<String> queries = new ArrayList<>(Arrays.asList("aba", "xzxb", "ab"));
        System.out.println("String List = " + strings + "\n" + "Queries List = " + queries);
        List ans = matchingStrings(strings, queries);
        System.out.println("Matching Strings Count = " + ans);
    }
}
