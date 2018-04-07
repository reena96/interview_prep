package com.company.typeSpecificity;

public class FloatDouble {
    public static void main(String args[]) {
        aValue(0);
    }

    public static void aValue(float x){
        System.out.println("FLOAT");
        System.out.println(x);
    }


    public static void aValue(double x){
        System.out.println("DOUBLE");
        System.out.println(x);

    }

   /* public void aValue(int x){
        System.out.println("INT");
    }
    */

/*
    public static void aValue(long x){
        System.out.println("LONG");
    }
    */
}
