package com.shraddha;

import java.util.*;

public class SherlockAndValidString {
    public static HashMap<Character, Integer> createMap(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                int val = map.get(str.charAt(i));
                map.put(str.charAt(i), val + 1);
            } else map.put(str.charAt(i), 1);
        }
        return map;
    }

    public static String isValid(String arrayListStr) {
        HashMap<Character, Integer> map = createMap(arrayListStr);
        if (map.size() == 1) return "YES";
        if (map.size() > 2) return "NO";
        Collection<Integer> values = map.values();
        if (!values.contains(1)) return "NO";
        Set<Character> keySet = map.keySet();
        ArrayList<Character> keyAl = new ArrayList<>(keySet);
        if (Math.abs(Integer.parseInt(keyAl.get(0) + "") - Integer.parseInt(keyAl.get(1) + "")) != 1) return "NO";
        return "YES";
    }

    public static String countValidSherlockValidStrings(String str) {
        HashMap<Character, Integer> map = createMap(str);
        Collection<Integer> mapValues = map.values();
        ArrayList<Integer> mapValuesAl = new ArrayList<>(mapValues);
        Collections.sort(mapValuesAl);
        int val = mapValuesAl.get(0);
        String arrayListStr = "";
        for (int i = 0; i < mapValuesAl.size(); i++) {
            mapValuesAl.set(i, mapValuesAl.get(i) - val);
            arrayListStr += mapValuesAl.get(i);
        }
//        HashMap<Character, Integer> alMap = createMap(arrayListStr);
        return isValid(arrayListStr);
    }

    public static void main(String[] args) {
        String input = "abcdefghhgfedecba";
        System.out.println("Input String = " + input);
        System.out.println("Is this string is sherlock valid string or not? " + countValidSherlockValidStrings(input));
    }
}
