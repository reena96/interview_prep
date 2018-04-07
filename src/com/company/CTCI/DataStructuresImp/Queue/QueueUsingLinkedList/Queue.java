package com.company.CTCI.DataStructuresImp.Queue.QueueUsingLinkedList;

import java.util.EmptyStackException;

public class Queue {

    private int queueNodeCount = 0;

    private class QueueNode{
        private int data;
        private QueueNode next;
        public QueueNode(int data){
            this.data = data;
        }
    }
    private QueueNode front, rear;

    public Queue(){
        front = null;
        rear = front;
    }

    public void enqueue(int data){
        QueueNode queueNode = new QueueNode(data);
        if(front == null && rear == null ){
            front = queueNode;
            rear = front;
        }
        else {
            rear.next = queueNode;
            rear = queueNode;
        }
        queueNodeCount++;
    }

    /***
     *       front    rear
     *          *    *
     *           null
     *
             front         rear
     *          *          *
     *            node->null
     *
         front                            rear
     *       *                               *
     *    node|d|-|---> node|d|-\ --->   node|d|-|
     */
//    public int dequeue(){  //Works
//        int x = 0;
//        if(front == null && rear == null)
//            throw new EmptyStackException();
//        else if(front == rear){
//            x = front.data;
//            front = null;
//            rear = front;
//        }
//        else if(front.next == rear){
//            x = front.data;
//            front = rear;
//        }
//        else {
//            x = front.data;
//            front = front.next;
//        }
//        return x;
//    }
//

    public int dequeue(){
        int x = 0;
        if(front == rear){
            if(front == null){
                throw new EmptyStackException();
            }
            x = front.data;
            front = null;
            rear = front;
        }
        else if(front.next == rear){
            x = front.data;
            front = rear;
        }
        else {
            x = front.data;
            front = front.next;
        }
        queueNodeCount--;
        return x;
    }

    public int size(){
        return queueNodeCount;
    }


    public static void main(String[] args){
        Queue queue = new Queue();
        queue.enqueue(0);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println("Queue Size: "+queue.size());
        System.out.println(queue.dequeue()); //has to be 0
        System.out.println(queue.dequeue()); //has to be 1
        System.out.println("Dequeued element: "+queue.dequeue()); //has to be 2
        System.out.println("SIZE:"+queue.size());
        System.out.println("Dequeued element: "+queue.dequeue()); //has to be 3
        System.out.println("SIZE:"+queue.size());
    }
}
