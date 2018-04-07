package com.company.Exceptions;

public class StackDepth {
    static int i = 0;
    public static void main(String[] args) {
        M();
        System.out.println("Finished");
    }

    protected static void M() {

        try {
            i++;
            System.out.println(i);
            M();
        } finally {
            M();
        }
    }
}
