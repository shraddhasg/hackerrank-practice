package com.shraddha;

public class CommonChild {
    public static int findCommonChild(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();

        int[][] t = new int[n + 1][m + 1];

        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < m + 1; j++) {
                if (i == 0 || j == 0) t[i][j] = 0;
            }
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) t[i][j] = 1 + t[i - 1][j - 1];
                else t[i][j] = Math.max(t[i][j - 1], t[i - 1][j]);
            }
        }
        return t[n][m];
    }

    public static void main(String[] args) {
        String str1 = "SHINCHAN";
        String str2 = "NOHARAAA";
        System.out.println("String1 = " + str1 + "\n" + "string2=" + str2);
        int numberOfCommonClids = findCommonChild(str1, str2);
        System.out.println("Number of common childs = " + numberOfCommonClids);
    }
}
