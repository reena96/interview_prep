package com.company.dynamicProgramming;

public class LongestIncreasingSubsequence {



    public static int[] lisOPT(int[] arr,int n) {

        int[] result = new int[n+1];
        for(int i = 0;i<n;i++)
        {
            result[i]= 0;
        }
        result[1]=1;
        int largest = arr[0];

            for(int i =1;i<n;i++) {

                if (arr[i] > largest) {
                    result[i+1] = result[i] + 1;
                    largest = arr[i];
                } else {
                    result[i+1] = result[i];
                }
            }

        return result;
    }

    public static void main(String[] args){
        int[] arr = {50, 3, 10, 7, 40, 80};
        int n = arr.length;
        System.out.println(lisOPT(arr,n));
        for ( int i: lisOPT(arr,n)){
            System.out.println(i);
        }


    }
}
