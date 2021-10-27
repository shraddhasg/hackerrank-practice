package com.shraddha;

import java.util.Locale;

public class Abbreviation {
    public static boolean capitalLettersMatch(String a, String b) {
        String temp = "";
        for (int i = 0; i < a.length(); i++)
            if ((int) a.charAt(i) >= 65 && (int) a.charAt(i) <= 90) temp += a.charAt(i);
        System.out.println(temp);
        for (int i = 0; i < temp.length(); i++) if (b.indexOf(temp.charAt(i)) < 0) return false;
        return true;
    }

    public static boolean longestCommonSubstring(String a, String b) {
        int m = a.length();
        int n = b.length();
        int[][] t = new int[m + 1][n + 1];

        for (int i = 0; i < m + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                if (i == 0 || j == 0) t[i][j] = 0;
            }
        }

        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (a.charAt(i - 1) == b.charAt(j - 1)) t[i][j] = 1 + t[i - 1][j - 1];
                else t[i][j] = Math.max(t[i - 1][j], t[i][j - 1]);
            }
        }

        if (t[m][n] == b.length()) return true;
        return false;
    }

    public static String abbreviation(String a, String b) {
        if (capitalLettersMatch(a, b)) {
            a = a.toLowerCase();
            b = b.toLowerCase();
            if (longestCommonSubstring(a, b)) return "YES";
            return "NO";
        }
        return "NO";
    }

    public static void main(String[] args) {
        String a = "AfPZN";
        String b = "APZNC";
        System.out.println("String one = " + a + "\n" + "String two = " + b);
        String status = abbreviation(a, b);
        System.out.println("status= " + status);
    }
}
