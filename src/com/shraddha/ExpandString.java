package com.shraddha;

import java.util.Arrays;

public class ExpandString {
    public static String expandString(String str){
        str = str.replace('(', ' ');
        str = str.replace(')',' ');

        String[] arr = str.split(" ");

        int count =0;
        String output="";
        for (int i = 0; i < arr.length-1; i+=2) {
            count=0;
                int num = Integer.parseInt(arr[i]);
                while (count<num) {
                    output += arr[i + 1];
                    count++;
                }
        }
//        System.out.println(output);
        return output;
    }

    public static void main(String[] args) {
        // str = 3(ab)4(cd) => output = abababcdcdcdcd
        String inputStr = "3(ab)4(cd)";
        String output = expandString(inputStr);
        System.out.println("Input String = "+inputStr);
        System.out.println("Expanded String = "+output);

    }
}
