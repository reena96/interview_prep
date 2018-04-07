package com.company;

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    private static String Sfinal="";


    public static String solution(String S, int K) {

        String S2 = "";   String S3 = "";
        int[] a = new int[S.length()];

        String S1 = S.toUpperCase();
        int K1 = K;
        if(S1.contains("-"))
            S2=S1.replace("-","");
        System.out.println(S2);
        int initial = S2.length()-1-K;
        pass(S2,K,initial);

       // pass(S2,a);




        return S2;
        }
        // write your code in Java SE 8
    public static String pass(String S2, int K,int i){

        while (i>0 ){
            Sfinal="-"+S2.substring(i,S2.length());



        }
       /* for(int i = S2.length()-1-K; i>0;i-=K)
            S = S2.substring(0,i)+"-"+S2.substring(i,S2.length()-1));
            */
       return Sfinal;

    }


    public static void main(String[] args){
        System.out.print(solution("2-4A0r7-4k",3));

    }
}