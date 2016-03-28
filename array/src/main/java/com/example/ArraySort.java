package com.example;

public class ArraySort {
    public static void main(String[] args) {
        int arr[] = new int[]{24, 23, 16, 45, 32};
        System.out.println("未排序前");
        printArray(arr);
        paiXu(arr);
        System.out.println("排序后");
        printArray(arr);

    }

    public static void printArray(int[] arr) {
        for (int x = 0; x < arr.length; x++) {
            if (x != arr.length - 1) {
                System.out.print(arr[x] + ",");
            } else {
                System.out.println(arr[x]);
            }
        }
    }

    public static void paiXu(int[] arr) {
        for (int x = 0; x < arr.length - 1; x++) {
            for (int y = 1 + x; y < arr.length; y++) {
                if (arr[x] > arr[y]) {
                    int temp = arr[x];
                    arr[x] = arr[y];
                    arr[y] = temp;
                }
            }
        }
    }
}
