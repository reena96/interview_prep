package com.company.CTCI.DataStructuresImp.Queue.QueueUsingArray;

import java.util.NoSuchElementException;

public class Queue{
    public static final int MAX_SIZE = 4;

    private int[] arr;
    private int front, rear;
    private int queueArrCount;

    public Queue(){
        arr = new int[MAX_SIZE];
    }

    public int size(){
        return queueArrCount;
    }
    public void enqueue(int data){
        if(queueArrCount == MAX_SIZE){
            throw new IllegalStateException("Queue is full");
        }
        arr[queueArrCount++]=data;
    }

    public int dequeue(){
        int x;
        if(queueArrCount == 0){
            throw new NoSuchElementException("Queue is empty");
        }
        x = arr[0];
        for(int i = 0; i < queueArrCount-1; i++){
            arr[i] = arr[i+1];
        }
        queueArrCount--;
        return x;
    }

    public int peek(){
        if(queueArrCount == 0){
            throw new NoSuchElementException("Queue is empty");
        }
        return arr[0];
    }

    public static void main(String[] args){
        Queue queue = new Queue();
        queue.enqueue(0);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

    }

}