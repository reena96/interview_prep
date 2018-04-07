package com.company.generics;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AddingToList {
    public static void main(String[] args){
        List<Object> objects = new ArrayList<Object>();
        objects.add("Hello");
        objects.add(LocalDate.now());
        objects.add(3);
        System.out.println(objects.get(0));


        List<Integer> ints = new ArrayList<Integer>();
        ints.add(1);
        ints.add(2);
        List<? extends Number> nums = ints;
        //nums.add(1.2); //can't be added

        //If a structure contains elements with a type of the form ? extends E,
        // we can get elements out of the structure, but we cannot put elements into the structure.
        //PRODUCER EXTENDS
        System.out.println(nums);
    }
}
