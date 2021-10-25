package com.shraddha;

public class SpecialStringAgain {
    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        char checkChar = str.charAt(left);
        while (left < right) {
            if (str.charAt(left) == str.charAt(right) && str.charAt(right) == checkChar) {
                left++;
                right--;
            } else return false;
        }
        return true;
    }

    public static long specialStringAgainCount(String str) {
        long count = str.length();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length() + 1; j++) {
                String subString = str.substring(i, j);
                if (subString.length() > 1) {
                    if (isPalindrome(subString)) count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String input = "aaaa";
        System.out.println("Input String = " + input);
        System.out.println("Number of special strings = " + specialStringAgainCount(input));
    }
}
