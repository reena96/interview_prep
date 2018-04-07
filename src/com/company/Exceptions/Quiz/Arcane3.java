package com.company.Exceptions.Quiz;

import java.io.FileNotFoundException;

interface Type1 {
    void f() throws CloneNotSupportedException;
}

interface Type2 {
    void f() throws InterruptedException, CloneNotSupportedException;
}

interface Type3 extends Type1, Type2 {

}

public class Arcane3 implements Type3 {

    public void f() throws CloneNotSupportedException{
        System.out.println("Hello world");
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Arcane3 t3 = new Arcane3();
        try {
            t3.f();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}