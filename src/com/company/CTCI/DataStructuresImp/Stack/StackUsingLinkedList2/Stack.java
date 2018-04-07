package com.company.CTCI.DataStructuresImp.Stack.StackUsingLinkedList2;

import java.util.EmptyStackException;

public class Stack{

    private int elementCount = 0;
    private class StackNode{
        private StackNode next;
        private int data;

        public StackNode(int data){
            this.data = data;
        }
    }

    private StackNode top;
    public boolean push(int data){
        StackNode newnode = new StackNode(data);
        if(top != null){
            newnode.next = top;
        }
        top = newnode;
        elementCount++;
        return true;
    }

    public int pop(){
        if(top == null){
            throw new EmptyStackException();
        }
        top = top.next;
        elementCount--;
        return top.data;

    }

    public int peek(){
        if(top == null){
            throw new EmptyStackException();
        }
        return top.data;
    }

    public int size(){
        return elementCount;
    }





}