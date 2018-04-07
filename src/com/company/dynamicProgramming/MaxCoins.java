package com.company.dynamicProgramming;

import static java.lang.Integer.max;

public class MaxCoins {
    // A Dynamic Programming based C++ program to find maximum
// number of coins that can be collected before hitting a
// dead end

    int R=5;
    int C=5;
    int[][][] dp = new int[R][C][2];
    // to check whether current cell is out of the grid or not
    boolean isValid(int i, int j)
    {
        return (i >=0 && i < R && j >=0 && j < C);
    }

    // dir = 0 for left, dir = 1 for right. This function returns
// number of maximum coins that can be collected starting from
// (i, j).
    int maxCoinsUtil(char[][] A, int i, int j, int dir,
                     int dp[][][])
    {
        // If this is a invalid cell or if cell is a blocking cell
        if (isValid(i,j) == false)
            return 0;

        // If this subproblem is already solved than return the
        // already evaluated answer.
        if (dp[i][j][dir] != -1)
            return dp[i][j][dir];

        // Check if this cell contains the coin 'C' or if its 'E'.
        dp[i][j][dir] = (A[i][j] == 'C')? 1: 0;

        // Get the maximum of two cases when you are facing right
        // in this cell
        if (dir == 1) // Direction is right
            dp[i][j][dir] += max(maxCoinsUtil(A, i+1, j, 0, dp), // Down
                    maxCoinsUtil(A, i, j+1, 1, dp)); // Ahead in rught

        // Get the maximum of two cases when you are facing left
        // in this cell
        if (dir == 0) // Direction is left
            dp[i][j][dir] += max(maxCoinsUtil(A, i+1, j, 1, dp), // Down
                    maxCoinsUtil(A, i, j-1, 0, dp)); // Ahead in left

        // return the answer
        return dp[i][j][dir];
    }

    // This function mainly creates a lookup table and calls
// maxCoinsUtil()
    int maxCoins(char A[][])
    {
        // Create lookup table and initialize all values as -1


        // As per the question initial cell is (0, 0) and direction
        // is right
        return maxCoinsUtil(A, 0, 0, 1, dp);
    }

    // Driver program to test above function
    public static void main(String args[])
    {
        char[][] A = { {'E', 'C', 'C', 'C', 'C'},
                {'C', 'E', 'C', 'E', 'E'},
                {'E', 'C', 'C', 'E', 'C'},
                {'C', 'E', 'E', 'C', 'E'},
                {'C', 'E', 'E', 'C', 'E'}
        };

        int R=5;
        int C=5;


        MaxCoins maxCoins = new MaxCoins();

        System.out.println("Maximum number of collected coins is"+maxCoins.maxCoins(A));


    }


}
