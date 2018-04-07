package com.company.Exceptions;

import com.company.Type3;

public class ExceptionTestClass implements Type3 {
    public ExceptionTestClass f = new ExceptionTestClass();
    public void f() { System.out.println("F()");
    }
    public static void main(String[] args) {
        Type3 t3 = new ExceptionTestClass();
        //t3.f();
    }
}