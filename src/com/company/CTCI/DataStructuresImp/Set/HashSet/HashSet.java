package com.company.CTCI.DataStructuresImp.Set.HashSet;

import com.company.functionalProgramming.T;

import java.util.HashMap;
import java.util.Iterator;

public class HashSet<E> {
    HashMap<E,Object> map;

   // Default initial capacity of the HashMap = 16
    private static final Object PRESENT = new Object();

    public HashSet(){
        map = new HashMap<>();
    }
    public HashSet(int initialCapacity) {
        map = new HashMap<>(initialCapacity);
    }

    public int size() {
        return map.size();
    }

    public boolean isEmpty() {
        return map.isEmpty();
    }

    public boolean contains(Object o) {
        return map.containsKey(o);
    }

    public void clear() {
        map.clear();
    }

    public Iterator<E> iterator() {
        return map.keySet().iterator();
    }

    public boolean add(E e) {
        return map.put(e, PRESENT)==null;
    }

    public boolean remove(Object o) {
        return map.remove(o)==PRESENT;
    }



}
