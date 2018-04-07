package com.company.dynamicProgramming;

public class DynamicProgramming {
    public static void main(String args[]){
        int[] D = new int[10];
        int n = 5;
        D[0] = D[1] = D[2] = 1;
        D[3] = 2;
        for (int i = 4; i <= n; i++) {
            D[i] = D[i-1] + D[i-3] + D[i-4];
            //System.out.println("D["+i+"]: "+D[i]+"= D["+(i-1)+"]+"+"D["+(i-3)+"]+"+"D["+(i-4)+"]");
            System.out.println("D["+i+"]:"+D[i]+" = D["+(i-1)+"]:"+D[i-1]+" + "+"D["+(i-3)+"]:"+D[i-1]+" + D["+(i-4)+"]:"+D[i-4]);
            int a = 1, b = 0;
            /*
            if (a && b) {
                c = 1;
            } else {
                c = 0;
            }

            if (a || b) {
                c = 1;
            } else {
                c = 0;
            }
            */

        }
    }
}
