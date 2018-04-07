package com.company.typeSpecificity;

public class DataTypePre {

    public static void main(String args[]) {
        aValue(3);
    }

    public static void aValue(byte x){
        System.out.println("BYTE");
        System.out.println(x);
    }

    public static void aValue(short x){
        System.out.println("SHORT");
        System.out.println(x);
    }

    public static void aValue(int x){
        System.out.println("INT");
        System.out.println(x);
    }

    public static void aValue(long x){
        System.out.println("LONG");
        System.out.println(x);
    }


}
