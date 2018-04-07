package com.company.divideAndConquer;
import java.util.Scanner;

public class Strassens
{
    /** Function to multiply matrices **/
    public void printGrid(int[][] S)
    {
        int[][] SD = S;
        System.out.println(SD.length);
        for(int i = 0; i < SD.length; i++)
        {
            for(int j = 0; j < SD.length; j++)
            {
                System.out.print(SD[i][j]+" ");
            }
            System.out.println();
        }
    }
    public int[][] multiply(int[][] A, int[][] B)
    {
        int n = A.length;
        int[][] R = new int[n][n];
        /** base case **/
        if (n == 1)
            R[0][0] = A[0][0] * B[0][0];
        else
        {
            int[][] A11 = new int[n/2][n/2];
            int[][] A12 = new int[n/2][n/2];
            int[][] A21 = new int[n/2][n/2];
            int[][] A22 = new int[n/2][n/2];
            int[][] B11 = new int[n/2][n/2];
            int[][] B12 = new int[n/2][n/2];
            int[][] B21 = new int[n/2][n/2];
            int[][] B22 = new int[n/2][n/2];

            /** Dividing matrix A into 4 halves **/
            split(A, A11, 0 , 0);
            split(A, A12, 0 , n/2);
            split(A, A21, n/2, 0);
            split(A, A22, n/2, n/2);
            /** Dividing matrix B into 4 halves **/
            split(B, B11, 0 , 0);
            split(B, B12, 0 , n/2);
            split(B, B21, n/2, 0);
            split(B, B22, n/2, n/2);

            /**
             M1 = (A11 + A22)(B11 + B22)
             M2 = (A21 + A22) B11
             M3 = A11 (B12 - B22)
             M4 = A22 (B21 - B11)
             M5 = (A11 + A12) B22
             M6 = (A21 - A11) (B11 + B12)
             M7 = (A12 - A22) (B21 + B22)
             **/


            System.out.println("sub(B12, B22)");
            sub(B12, B22);
            System.out.println(" add(A11, A12);");
            add(A11, A12);
            add(A21,A22);
            sub(B21,B11);
            add(A11,A22);
            add(B11,B22);
            sub(A12,A22);
            add(B21,B22);
            sub(A11,A21);
            add(B11,B12);




            //System.out.println(add(A11, A12));
            //System.out.println(add(A21, A22));


            int [][] M1 = multiply(add(A11, A22), add(B11, B22));
            System.out.println("M1----");

            printGrid(M1);
            int [][] M2 = multiply(add(A21, A22), B11);
            int [][] M3 = multiply(A11, sub(B12, B22));
            System.out.println("M3----");
            printGrid(M3);
            int [][] M4 = multiply(A22, sub(B21, B11));
            int [][] M5 = multiply(add(A11, A12), B22);
            int [][] M6 = multiply(sub(A21, A11), add(B11, B12));
            int [][] M7 = multiply(sub(A12, A22), add(B21, B22));


            /**
             C11 = M1 + M4 - M5 + M7
             C12 = M3 + M5
             C21 = M2 + M4
             C22 = M1 - M2 + M3 + M6
             **/
            int [][] C11 = add(sub(add(M1, M4), M5), M7);
            int [][] C12 = add(M3, M5);
            int [][] C21 = add(M2, M4);
            int [][] C22 = add(sub(add(M1, M3), M2), M6);

            /** join 4 halves into one result matrix **/
            join(C11, R, 0 , 0);
            join(C12, R, 0 , n/2);
            join(C21, R, n/2, 0);
            join(C22, R, n/2, n/2);
        }
        /** return result **/
        return R;
    }
    /** Funtion to sub two matrices **/
    public int[][] sub(int[][] A, int[][] B)
    {
        int n = A.length;
        int[][] C = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                C[i][j] = A[i][j] - B[i][j];
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        return C;
    }
    /** Funtion to add two matrices **/
    public int[][] add(int[][] A, int[][] B)
    {
        int n = A.length;
        int[][] C = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                C[i][j] = A[i][j] + B[i][j];
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        return C;
    }
    /** Funtion to split parent matrix into child matrices **/
    public void split(int[][] P, int[][] C, int iB, int jB)
    {
        for(int i1 = 0, i2 = iB; i1 < C.length; i1++, i2++)
            for(int j1 = 0, j2 = jB; j1 < C.length; j1++, j2++)
                C[i1][j1] = P[i2][j2];
    }
    /** Funtion to join child matrices intp parent matrix **/
    public void join(int[][] C, int[][] P, int iB, int jB)
    {
        for(int i1 = 0, i2 = iB; i1 < C.length; i1++, i2++)
            for(int j1 = 0, j2 = jB; j1 < C.length; j1++, j2++)
                P[i2][j2] = C[i1][j1];
    }
    /** Main function **/
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Strassen Multiplication Algorithm Test\n");
        /** Make an object of Strassen class **/
        Strassens s = new Strassens();

        System.out.println("Enter order n :");
        int N = 4;
        /** Accept two 2d matrices **/
        System.out.println("Enter N order matrix 1\n");
        //int[][] A = new int[N][N];
        int[][] A = new int[][]{
                { 1, 2, 2, 1},
                { 0, 1, 1, 0},
                { 3, 1, 1, 3},
                { 4, 3, 2, 1}
        };
        //for (int i = 0; i < N; i++)
        //    for (int j = 0; j < N; j++)
        //        A[i][j] = scan.nextInt();

        System.out.println("Enter N order matrix 2\n");
        //int[][] B = new int[N][N];
        int[][] B = new int[][]{
                { 3, 1, 3, 1},
                { 1, 0, 0, 1},
                { 1, 2, 3, 4},
                { 0, 1, 0, 1}
        };
        //for (int i = 0; i < N; i++)
        //    for (int j = 0; j < N; j++)
        //        B[i][j] = scan.nextInt();

        int[][] C = s.multiply(A, B);

        System.out.println("\nProduct of matrices A and  B : ");
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
                System.out.print(C[i][j] +" ");
            System.out.println();
        }

    }
}