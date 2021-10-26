package com.shraddha;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FraudulentActivityNotifications {
    //    public static int[] createArray(ArrayList<Integer> expenditures, int d, int current) {
//        ArrayList<Integer> arr = new ArrayList<>();
//        for (int i = current - d; i < current; i++) arr.add(expenditures.get(i));
//        Collections.sort(arr);
//        int[] array = new int[d];
//        for (int i = 0; i < array.length; i++) array[i] = arr.get(i);
//        return array;
//    }
    public static float findMedian(ArrayList<Integer> expenditures, int d, int current) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = current - d; i < current; i++) arr.add(expenditures.get(i));
        Collections.sort(arr);
        int val = (d + 1) / 2;
        if (d % 2 == 0) {
            float a = arr.get(val - 1) + arr.get(val);
            return a / 2;
        }

        return arr.get(val - 1);
//        float val = arr.get(arr.size() / 2) + arr.get(arr.size() / 2 - 1);
//        if (arr.size() % 2 == 0) return val / 2;
//        return arr.get((arr.size() - 1) / 2);

    }

//    static int a, b;
//
//    static int[] swap(int[] arr, int i, int j) {
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//        return arr;
//    }
//
//
//    static int Partition(int arr[], int l, int r) {
//        int lst = arr[r], i = l, j = l;
//        while (j < r) {
//            if (arr[j] < lst) {
//                arr = swap(arr, i, j);
//                i++;
//            }
//            j++;
//        }
//        arr = swap(arr, i, r);
//        return i;
//    }
//
//
//    static int randomPartition(int arr[], int l, int r) {
//        int n = r - l + 1;
//        int pivot = (int) (Math.random() % n);
//        arr = swap(arr, l + pivot, r);
//        return Partition(arr, l, r);
//    }
//
//    static int MedianUtil(int arr[], int l, int r, int k) {
//
//        // if l < r
//        if (l <= r) {
//
//            // Find the partition index
//            int partitionIndex = randomPartition(arr, l, r);
//
//            // If partition index = k, then
//            // we found the median of odd
//            // number element in arr[]
//            if (partitionIndex == k) {
//                b = arr[partitionIndex];
//                if (a != -1)
//                    return Integer.MIN_VALUE;
//            }
//
//            // If index = k - 1, then we get
//            // a & b as middle element of
//            // arr[]
//            else if (partitionIndex == k - 1) {
//                a = arr[partitionIndex];
//                if (b != -1)
//                    return Integer.MIN_VALUE;
//            }
//
//            // If partitionIndex >= k then
//            // find the index in first half
//            // of the arr[]
//            if (partitionIndex >= k)
//                return MedianUtil(arr, l, partitionIndex - 1, k);
//
//                // If partitionIndex <= k then
//                // find the index in second half
//                // of the arr[]
//            else
//                return MedianUtil(arr, partitionIndex + 1, r, k);
//        }
//
//        return Integer.MIN_VALUE;
//    }
//
//    public static float findMedian(int arr[], int n) {
//        float ans;
//        a = -1;
//        b = -1;
//
//        // If n is odd
//        if (n % 2 == 1) {
//            MedianUtil(arr, 0, n - 1, n / 2);
//            ans = b;
//        }
//
//        // If n is even
//        else {
//            MedianUtil(arr, 0, n - 1, n / 2);
//            ans = (a + b) / 2;
//        }
//
//        // Print the Median of arr[]
////        System.out.print("Median = " + ans);
//        return ans;
//    }


    public static int activityNotifications(List<Integer> list, int d) {
        int count = 0;
        int[] arr = new int[d];
        ArrayList<Integer> expenditures = new ArrayList<>(list);
        float median = 0.0F;
        for (int i = d; i < expenditures.size(); i++) {
            median = findMedian(expenditures, d, i);
//            arr = createArray(expenditures, d, i);
//            median = findMedian(arr, arr.length);
            System.out.println(median);
            if (expenditures.get(i) >= median * 2) count++;
        }
        return count;
    }

    public static void main(String[] args) {

        ArrayList<Integer> expenditures = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 4));
        int d = 4;
        int count = activityNotifications(expenditures, d);
        System.out.println("no notification is sent = " + count);
    }
}
