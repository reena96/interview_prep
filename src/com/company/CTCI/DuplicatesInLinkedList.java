package com.company.CTCI;


import java.util.HashMap;

class Node {
    Node next;
    int data = 0;

    public Node(int d) {
        data = d;
    }
}

public class DuplicatesInLinkedList {
    public static void main(String[] args) {
        HashMap<Integer, Boolean> hashMap = new HashMap<>();
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(4);


        Node n = head;
        Node prev = null;

        while (n.next != null) {
            hashMap.put(n.data, false);
            n = n.next;
        }
        Node newList = null;
        for (int i : hashMap.keySet()) {

            Node x = new Node(i);
            if (newList == null) {
                newList = x;
            } else {
                newList.next = x;
                newList = newList.next;
            }

        }

//       n = head;
//
//       while (n.next!= null){
//  Ω
//          if (hashMap.get(n.data)==false)
//              hashMap.put(n.data,true);
//          else
//               prev.next= n.next.next;
//
//          prev = n;
//          n = n.next;
///
//       }


            System.out.println(newList.data);


    }

}
