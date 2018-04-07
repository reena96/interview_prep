package com.company.CTCI.DataStructuresImp.Set.SetUsingArray;

import java.util.NoSuchElementException;

public class Set {
    private static final int MAX_SIZE = 5;
    int[] arr;
    int setCount;
    public Set(){
       arr  = new int[MAX_SIZE];
    }

    public void add(int data){
        if(setCount == MAX_SIZE){
            throw new IllegalArgumentException("Set size exceeded");
        }
        if(!contains(data)){
            arr[setCount++] = data;
        }
    }

    public void remove(int data){
        if(setCount == 0){
            throw new IllegalArgumentException("Set is empty- There is no element to remove");
        }
        if(!contains(data)){
            throw new NoSuchElementException();
        }
        for (int i = 0; i<setCount; i++){
            if(arr[i] == data){
                arr[i] = arr[setCount-1];
            }
        }
        setCount--;
    }

    public int size(){
        return setCount;
    }


    public boolean contains(int data){
        for (int i = 0; i<setCount ; i++){
            if(arr[i] == data){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        Set set = new Set();
        set.add(0);
        set.add(1);
        set.add(2);
        System.out.println("Set size: "+set.size());
        set.remove(1);
        System.out.println("Set size: "+set.size());



    }

}
