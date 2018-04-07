package com.company.typeSpecificity;

public class Some {
    //bsilfd
    //byte short int long float double


    public void greet(String x) {
        System.out.println("Hello world!"+x);
    }
    public void greet(int x) {
        System.out.println("Hello world!"+x);
    }
    public static void main(String[ ] args) {
        Some a = new Some();
        a.greet(4);
        a.greet(5);
        //((Some)null).greet(String(null));//Upcasting


        Byte b = 4;

        short s = b;
        int i = b;
        long d = i;

        int e = (byte)d;
        System.out.println(e);

    }
}
