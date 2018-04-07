package com.company.Interfaces;


public class Mains implements MCall {
    int fvar = 0;

    public int f() {
        return fvar = 1;
    }

    interface MCall {
        default int f() {
            return 2;
        }
    }

    public static class Nested extends Mains implements MCall {
        //statement 1
        //statement 2
        //statement 3
        //statement 4
        //statement 5
        //statement 6
        //statement 7
        //statement 8
        int fvar = 3;

        public int f() {
            return fvar;
        }
    }

    public static void main(String[] args) {
        Mains.MCall call1 = new Mains.Nested();
        Mains call2 = new Mains.Nested();
        //Mains.Nested call3 = (Mains.Nested) new Mains();
        com.company.Interfaces.MCall call4 = new Mains();
        System.out.println(call1.f()); 
        System.out.println(call2.f()); 
        //System.out.println(call3.f());
        //System.out.println(call4.f());

    }
}