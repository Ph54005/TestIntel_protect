package com.example.demo;

public class ArraySume {
    public static int sum(int[] arr) {
        if(arr == null || arr.length == 0){
            throw new IllegalArgumentException("không được để trống ");
        }
        int total = 0;
        for (int num : arr) {
            total += num;
        }
        return total;
    }
}

