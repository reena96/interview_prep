package com.company.generics.wildcards;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Wildcards {
    public static void main(String[] args){
//If you declare a List of unbounded type, as in A List with an unbounded wildcard,
// YOU CAN READ FROM IT BUT NOT WRITE TO IT.
        List<?> stuff = new ArrayList<>();
        //stuff.add("abc");
        // stuff.add(new Object());
        // stuff.add(3);
        int numElements = stuff.size();
        System.out.println(numElements);

        List<Integer> ints = new ArrayList<>();
        ints.add(3); ints.add(1); ints.add(4);





        List<String> strings = new ArrayList<>();
        strings.add("Reena"); strings.add("Mary"); strings.add("Puthota");

        //List<Object> objects = new ArrayList<String>();   NOT ALLOWED!!!!

        printList(ints);
        printList(strings);
        printList(stuff);


        List<Number> numList = new ArrayList<>();
        //numList.add(1);numList.add(2);numList.add(3);
        //numList can have elements of any type that's a supertype of Integer.
        numsUpTo(10,numList);
        check(numList);


    }

    // UNBOUNDED LIST AS A METHOD ARG
    //method that takes a List<?> as an argument will accept any list at all when invoked.
    private static void printList(List<?> list) {
        System.out.println(list);
    }


    private static <E> void check(E e) {
        System.out.println(e);
    }



    //Use Case of Lower Bounded Wildcards
    //List<? super Integer> will accept any element that is an Integer/int or a super type of Integer (Ex: Number)
    public static void numsUpTo(Integer num, List<? super Integer> output) {

        //Consider a method called numsUpTo that takes two arguments, an integer and a list
        // to populate with all the numbers up to the first argument
        IntStream.rangeClosed(1, num)
                .forEach(output::add);

        //prints the list
        System.out.println(output);

    }

}
