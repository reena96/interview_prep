package com.company.OrderOfFieldInitialization;

public class TestClass {
    int y = 1;

    public TestClass() {
        System.out.println("I am in Test Class: " + y);
        y = 2;
        f(); //during this call, subclass's f() is called. Because it is called from here,
        // subclass's f() is not aware of the y=2 of the sub value initialized here.
        // So, y=0 is printed.
        System.out.println("I finished TestClass constructor's call to f()");
    }

    void f() {
        System.out.println("Value in Test Class's f() = " + String.valueOf(y));
    }

    public static class B extends TestClass {
        int y = 3;

        public B() {
            System.out.println("I am in B Class: "+y);
            f(); //during this call, subclass's f() is called again. Because it is called from subclass itself,
            // subclass knows that value of y in the subclass is y=3.
            // So, y=3 is printed.
            System.out.println("I finished B constructor's call to f()");
        }

        void f() {
            //After B's super constructor has been called, then control is returned back to B's constructor at which point,
            // since the constructor is ca
            if (y == 0) {
                System.out.println("Constructor not initialized and y is 0: " + y);
            } else {
                System.out.println("Value in B's f()= " + String.valueOf(y));
            }
        }
    }

    public static void main(String[] args) {
        TestClass o = new TestClass.B();
    }
}