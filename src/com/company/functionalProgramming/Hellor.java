package com.company.functionalProgramming;

import java.util.function.IntUnaryOperator;

public class Hellor {

    Runnable r1 = () ->
        System.out.println(this);

    Runnable r2 = () -> {
        System.out.println(toString());
    };

    public String toString() {
        return "Howdy!";
    }

    public static void main(String args[]) {
        new Hellor().r1.run();
        new Hellor().r2.run();
    }
    IntUnaryOperator f = new IntUnaryOperator() {
        @Override
        public int applyAsInt(int operand) {
            return 0;
        }
    };
}
