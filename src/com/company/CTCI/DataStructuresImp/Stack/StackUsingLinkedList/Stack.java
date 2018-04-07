package com.company.CTCI.DataStructuresImp.Stack.StackUsingLinkedList;


import java.util.EmptyStackException;

public class Stack {

    private int count = 0;
    private class StackNode {
        private int data;
        private StackNode next;

        public StackNode(int data) {
            this.data = data;
        }
    }

    private StackNode top;

    public int pop() {
        if (top == null) throw new EmptyStackException();
        int item_poped = top.data;
        top = top.next;
        count--;
        return item_poped;
    }

    public void push(int data) {
        StackNode new_top = new StackNode(data);
        new_top.next = top;
        top = new_top;
        count++;
    }

    public int peek() {
        if (top == null) throw new EmptyStackException();
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size(){
        return count;
    }

    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println("SIZE: "+s.size());
        System.out.println("Popped element: "+s.pop());
        System.out.println("SIZE: "+s.size());

        java.util.Stack x = new java.util.Stack();
        x.size();
    }



}



