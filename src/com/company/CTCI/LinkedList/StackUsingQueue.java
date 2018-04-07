package com.company.CTCI.LinkedList;

import java.util.LinkedList;

public class StackUsingQueue {
    private LinkedList<Integer> q1 = new LinkedList<>();

    // Push element x onto stack.
    public void push(int x) {
        q1.add(x);
        int sz = q1.size();
        while (sz > 1) {
            q1.add(q1.remove());
            sz--;
        }
    }

    public static void main(String[] args){
//        push(1);
//        push(2);
    }
}
