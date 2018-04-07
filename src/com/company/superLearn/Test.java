package com.company.superLearn;

public class Test {
    public static void main(String[] args) {
        // write your code hers
        new C().test();
    }

}


class A {
    public void method() {System.out.println("A");}
}

class B extends A {
    public void method() {
        System.out.println("B");
        super.method();}
    protected void superMethod() {
        super.method();
    }
}

class C extends B {
    public void method()  {System.out.println("C");}

    void test() {
        method();          // C.method()
        super.method();    // B.method()
        superMethod();     // A.method()
    }
}



