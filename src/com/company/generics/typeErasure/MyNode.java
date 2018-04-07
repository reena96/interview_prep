package com.company.generics.typeErasure;

//http://www.baeldung.com/java-type-erasure    SIMILAR EXAMPLE

import com.company.arbitrage.In;
import com.sun.tools.javac.resources.compiler;

class Node<T> {

    public T data;

    public Node(T data) {
        System.out.println("In Constructor of Node");
        this.data = data;
    }

    public void setData(T data) {  // ==>  public void setData(Object data)
        System.out.println("Node.setData: " + data);
        this.data = data;
    }
}

public class MyNode extends Node<Integer> {

    public MyNode(Integer data) {
        super(data);
    }

    public void setData(String data) {
        System.out.println("MyNode.setData: " + data);
        //super.setData(data);
    }


    public static void main(String[] args) {

        //Here we are dealing only with the raw types of Node and MyNode
        MyNode myNode = new MyNode(1);
        myNode.setData(2); //calls MyNode.setData(Integer)

        Node node = myNode; // A raw type - compiler throws an unchecked warning
        System.out.println("I am going to call node.setData()");

        //
        node.setData("Hello");
        /*
        public Node(String data) {
        System.out.println("In Constructor of Node");
        this.data  = data;
        //In the body of setData(Object), the data field of the object referenced by node is assigned to a String (String data).

        }
         */
        Integer x = myNode.data; // Causes a ClassCastException to be thrown.

/*
n.setData("Hello"); causes the method setData(Object) to be executed on the object of class MyNode. (The MyNode class inherited setData(Object) from Node.)
In the body of setData(Object), the data field of the object referenced by n is assigned to a String.
The data field of that same object, referenced via mn, can be accessed and is expected to be an integer (since mn is a MyNode which is a Node<Integer>.
Trying to assign a String to an Integer causes a ClassCastException from a cast inserted at the assignment by a Java compiler.
* */
        //node.setData("Hello"); causes the method setData(Object) to be executed on the object of class MyNode.
        // (The MyNode class inherited setData(Object) from Node.)
        // In the body of setData(Object), the data field of the object referenced by node is assigned to a String.
        // The data field of that same object, referenced via myNode, can be accessed and is expected to be an integer
        // (since myNode is a MyNode which is a Node<Integer>.
        // Trying to assign a String to an Integer causes a ClassCastException from a cast inserted at the
        // assignment by a Java compiler.


    }
}


//Notice how we can push a String on the MyNode – because MyNode inherited setData(Object)
// from the parent class Node. This is, of course, incorrect – as it should be an integer since
// integerStack is a Stack<Integer> type.

// So, not surprisingly, an attempt to pop a String and assign to an Integer causes a ClassCastException
// from a cast inserted during the push by the compiler.

