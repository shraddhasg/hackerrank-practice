package com.shraddha;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RansomsNote {
    public static void checkMagazine(List<String> magazine, List<String> note) {
        // Write your code here
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < magazine.size(); i++) {
            if (map.containsKey(magazine.get(i))) {
                int val = map.get(magazine.get(i));
                map.put(magazine.get(i), val + 1);
            } else map.put(magazine.get(i), 1);
        }

        for (int i = 0; i < note.size(); i++) {
            if (map.containsKey(note.get(i))) {
                map.put(note.get(i), map.get(note.get(i)) - 1);
                if (map.get(note.get(i)) < 0) {
                    System.out.println("No");
                    return;
                }
            } else {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");

    }

    public static List<String> createList(String str) {
        String[] arr = str.split(" ");
        List<String> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) list.add(arr[i]);

        return list;
    }

    public static void main(String[] args) {
        String str1 = "give me one grand today night";
        String str2 = "give one grand today";
        System.out.println("magazine = " + str1 + "\n" + "Note = " + str2);
        List<String> magazine = createList(str1);
        List<String> note = createList(str2);

        checkMagazine(magazine, note);
    }
}
