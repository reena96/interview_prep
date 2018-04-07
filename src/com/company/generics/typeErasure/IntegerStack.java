package com.company.generics.typeErasure;

 class Stack<E> {
    private E[] stackContent;

    public Stack(int capacity) {
        this.stackContent = (E[]) new Object[capacity];
    }

    public void push(E data) {

    }

    public E pop() {
        // ..
        return stackContent[0];
    }
}


public class IntegerStack extends Stack<Integer> {

    public IntegerStack(int capacity) {
        super(capacity);
    }
    public void push(Integer value) {
        super.push(value);
    }


    public static void main(String[] args){
        IntegerStack integerStack = new IntegerStack(5);
        //Stack<Integer> intStack = new Stack<>(3);
        Stack stack = integerStack;
        stack.push("Hello");
        Integer data = integerStack.pop();
        System.out.println(data);
    }
}