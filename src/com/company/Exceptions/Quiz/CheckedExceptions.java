package com.company.Exceptions.Quiz;

import com.company.arbitrage.In;
import com.company.superLearn.Test;

import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;


interface A {
    void f() throws FileNotFoundException;
}

interface B {
    void f() throws InterruptedException,FileNotFoundException;
}

interface C extends A, B {
}

class D extends FileNotFoundException{

}

//This means your implementation can be equal to or less restrictive than the interface, but it can not be
// more restrictive.
//The set of checked exceptions that a method can throw is the intersection of the sets of
//checked exceptions that it is declared to throw in all applicable types, not the union

public class CheckedExceptions implements C {
    public void f() throws D { //, FileNotFoundException
        System.out.println("Hello world") ;
    }

    public static void main(String[] args) throws FileNotFoundException {
        C obj = new CheckedExceptions();
        obj.f(); // Working fine and printing "Hello World"
    }
}


//In object oriented terms, when you program to an interface (i.e. implement an interface or extend an interface),
// you can not be more restrictive than the interface. However, you can be less restrictive. So, in your example,
// the interface's method may or may not throw a FileNotFoundException and/or InterruptedException, but your
// implementation' method will not throw an exception. Note that if your implementation's method throws a
// FileNotFoundException and/or InterruptedException, it is perfectly alright, but if it throws some other
// exception it won't be allowed. This means your implementation can be equal to or less restrictive than
// the interface, but it can not be more restrictive.

//If you are extending from an interface that extends from two other interaces, then, the set of exceptions that the
//the method overridden in the subclass can throw is the intersection of the Exceptions that are in the interfaces in
// hirerachy
