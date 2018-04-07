package com.company;

public class PostAndPreIncrement {
    public static void main(String args[]) {
        int[] a={ 5, 1, 15, 20, 25};
        int i, j, k = 1, m;
        i = ++a[1];
        j = a[1]++;
        m = a[i++];
        System.out.println("i:"+i) ; //2
        System.out.println("j:"+j) ; //1
        System.out.println("m:"+m) ; //15
    }

}
