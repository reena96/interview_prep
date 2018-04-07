package com.company.functionalProgramming;

public class T {
    private final int name;

    T(int name) {
        this.name = name;
        //System.out.println("Constructor: " + this.name);
    }

     private int name() {
        System.out.println("Inside getName() method:" + name);
        return name;
    }

    private void reproduce() {
        new Class1(2).printName();
    }


    public static void main(String[] args) {
        new T(1)
                .reproduce();
    }

    public class Class1 extends T {

        Class1(int name) {
            super(name);
        }

        void printName() {
            System.out.println("Here: " + name());

        }
    }
}
