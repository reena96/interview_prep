package com.company.Threads;

import java.lang.*;

public class SystemExit {

    public static void main(String[] args) {

        int arr1[] = { 0, 1, 2, 3, 4, 5 };
        int arr2[] = { 0, 10, 20, 30, 40, 50 };
        int i;

        // copies an array from the specified source array
        System.arraycopy(arr1, 0, arr2, 0, 1);
        System.out.print("array2 = ");
        System.out.print(arr2[0] + " ");
        System.out.print(arr2[1] + " ");
        System.out.println(arr2[2] + " ");

        for(i = 0;i < 3;i++) {
            if(arr2[i] >= 20) {
                System.out.println("exit...");
                System.exit(2);
            } else {
                System.out.println("arr2["+i+"] = " + arr2[i]);
            }
        }
    }
}