package com.shraddha;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeftRotation {
    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        ArrayList<Integer> firstPartitionList = new ArrayList<>(arr.subList(0, d));
        ArrayList<Integer> secondPartitionList = new ArrayList<>(arr.subList(d, arr.size()));
        secondPartitionList.addAll(firstPartitionList);
        return secondPartitionList;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        int d = 2;
        List<Integer> rotatedList = rotateLeft(d, list);
        System.out.println("List = " + list + "\n" + "D = " + d);
        System.out.println("Roteds list = " + rotatedList);
    }
}
