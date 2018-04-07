package com.company.OrderOfFieldInitialization;

public class QuizCode {
    public static void main(String[] args){
        new B();
        new A();
    }

}

class A{
    int y;
    public void f(){
        System.out.println("y in A: "+y);
    }
    public A(){
        y=9;
        f();
    }
}
class B extends A{
    int y;
    public void f(){
        System.out.println("y in B: "+y);
    }
    public B(){
        y=5;
    }



}
