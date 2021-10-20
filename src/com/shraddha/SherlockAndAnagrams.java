package com.shraddha;

import java.util.ArrayList;
import java.util.Arrays;

public class SherlockAndAnagrams {

    public static int anagrams(ArrayList<String> al) {
        int count = 0;
        char[] temp = {'-'};
        char[][] arr = new char[al.size()][];
        for (int i = 0; i < al.size(); i++) {
            arr[i] = al.get(i).toCharArray();
            Arrays.sort(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    if (Arrays.equals(arr[i], arr[j]) && Arrays.equals(arr[i], temp) == false && Arrays.equals(arr[j], temp) == false)
                        count++;
                }
            }
            arr[i] = temp;
        }
        return count;
    }

    public static ArrayList<String> createSubstringAl(String str) {
        ArrayList<String> al = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                al.add(str.substring(i, j));
            }
        }
        return al;
    }

    public static void main(String[] args) {
        String input = "kkkk";
        System.out.println("Input String =" + input);
        ArrayList<String> al = createSubstringAl(input);
        int numberOfAnagrams = anagrams(al);
        System.out.println("Number of possible anagrams = " + numberOfAnagrams);
    }
}
