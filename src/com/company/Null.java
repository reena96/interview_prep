package com.company;

import java.util.HashMap;

public class Null {

    int[] globalArray = new int[0];
    public void greet(int x) {
        boolean global;
        System.out.println(Math.max(3,3));
        System.out.println("Hello world!"+x);
        float op = (float)23434243324234242342234234234234234234234234234.3;
        //System.out.println(global);
        globalArray[0]=1;
    }
    public static void main(String[ ] args) {

        int check;
       // check = 'a';
        double k = 120;
        System.out.println(k);
        Null a = new Null();
        a.greet(4);
        //a.greet(5);
        //Null.greet(7);
        Object o = new Object();
        //((Null)o).greet(8);
        //ClassCastException: java.lang.Object cannot be cast to com.company.Null
        //can't cast Object to other types

        //((Null)null).greet(8);
        /***
         null can be cast to any reference type;
         Any type can’t be cast to null;
         */

    }
}

class X {



}