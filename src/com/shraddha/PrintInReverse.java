package com.shraddha;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class PrintInReverse {
    public static void printReverse(List<Integer> list) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < list.size(); i++) stack.add(list.get(i));

        for (int i = stack.size(); i > 0; i--) System.out.println(stack.pop());

  
//        System.out.println(stack);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
        printReverse(list);
    }
}
