package com.danei;

import java.util.Arrays;
import java.util.Random;

public class MaopaoSort {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            Random ran = new Random();
            arr[i] = ran.nextInt(101) + 30;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("冒泡开始-----------------");
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
        System.out.println("冒泡结束-----------------");
        System.out.println(Arrays.toString(arr));
    }
}