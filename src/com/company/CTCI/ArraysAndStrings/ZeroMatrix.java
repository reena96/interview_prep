package com.company.CTCI.ArraysAndStrings;

import java.util.HashMap;

public class ZeroMatrix {
    HashMap<Integer,Integer> imap = new HashMap<>();
    HashMap<Integer,Integer> jmap = new HashMap<>();
    public static void main(String[] args){
        int m=5,n = 3;
        int[][] input = new int[m][n];
        for(int i = 0; i < m;i++){
            for (int j = 0; j < n ; j++){
                input[i][j] = (i+2)*(j+1);
               // System.out.print(input[i][j]+" ");
            }
           // System.out.println();
        }
        input[0][0]=0;
        input[1][0]=0;
        ZeroMatrix zm = new ZeroMatrix();
        zm.getPositionsOfZeroes(input, m,n);
        int[][] result = zm.putZeroes(input,m,n);

    }

    private int[][] putZeroes(int[][] input,int m,int n) {
        for(int i = 0; i < imap.keySet().size();i++){
            for (int j = 0; j < n ; j++){
                input[imap.get(i)][j]=0;
            }

        }

        for(int i = 0; i < m;i++){
            for (int j = 0; j < jmap.keySet().size() ; j++){
                input[i][jmap.get(j)]=0;
            }

        }



        for(int i = 0; i < m;i++){
            for (int j = 0; j < n ; j++){
                System.out.print(input[i][j]+" ");
            }
            System.out.println();
        }
        return input;


    }

    private void getPositionsOfZeroes(int[][] input,int m,int n) {
        for(int i = 0; i < m;i++){
            for (int j = 0; j < n ; j++){
                if(input[i][j] == 0){
                    imap.put(i,i);
                    jmap.put(j,j);

                }
            }
        }
    }
}
