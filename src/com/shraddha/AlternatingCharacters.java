package com.shraddha;

public class AlternatingCharacters {
    public static int countAlternatingCharacters(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) if (str.charAt(i) == str.charAt(i + 1)) count++;
        return count;
    }

    public static void main(String[] args) {
        String input = "BABB";
        System.out.println("Input string = " + input);
        System.out.println("Nubner of required deletions = " + countAlternatingCharacters(input));
    }
}
