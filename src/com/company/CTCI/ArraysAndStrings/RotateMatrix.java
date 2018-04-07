package com.company.CTCI.ArraysAndStrings;

public class RotateMatrix {
    public static void main(String[] args){
        int n = 3;
        int[][] input = new int[n][n];
        for(int i = 0; i < n;i++){
            for (int j = 0; j < n ; j++){
                input[i][j] = (i+2)*(j+1);
            }
        }

        for(int i = 0; i < n;i++){
            for (int j = 0; j < n ; j++){
                System.out.print(input[i][j]+" ");
            }
            System.out.println();
        }

        int[][] result = rotateMatrix(input,n);
        for(int i = 0; i < n;i++){
            for (int j = 0; j < n ; j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }


    }

    private static int[][] rotateMatrix(int[][] input, int n) {
        int[][] result = new int[n][n];
        int I=0,J=0;
        for(int i = 0;    i < n; i++){
                for (int j = 0; j < n; j++) {
                        result[i][j] = input[j][n-1-i] ;
                    }

                }

    return result;
    }



}
