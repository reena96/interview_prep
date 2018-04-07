package com.company.generics.rawTypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//RAW TYPES!!
public class Pair<T> {

    private final T first;
    private final T second;
    public Pair(T first, T second) {
        this.first = first;
        this.second = second; }
    public T first( ) { return first; }
    public T second( ) { return second; }

    public List<String> stringList( ) {
        //List<String> list =Arrays.asList(String.valueOf(first),String.valueOf(second));
        //String x = String.valueOf(first);
        //return Arrays.asList(String.valueOf(first),String.valueOf(second));return Arrays.asList(String.valueOf(first),String.valueOf(second));
        return new ArrayList<String>(Arrays.asList(String.valueOf(first),String.valueOf(second)));
        //return Arrays.asList(String.valueOf(first),String.valueOf(second)));
        //return list;
    }

    public static void main(String[ ] args) {

        //
        Pair p = new Pair<>("TTH", "CS474");

        //Pair<Object> p1 = new Pair<>("Reena","Puthota");

        //for(String s: Arrays.asList(String.valueOf(p.first()),String.valueOf(p.second()))){

        //};

        //String firstp = p.first();
        //String firstp1 = p1.first();

        //System.out.println(p1.first( ) + " " + p1.second( ));
        System.out.println(p.stringList().get(0).getClass());

        Object first1 = "Reena";
        Object second1 = "Puthota";
        List<String> list = Arrays.asList(String.valueOf(first1),String.valueOf(second1));

        list = p.stringList();
        for (String s : list) {}

        for (Object s : p.stringList()) System.out.print(s + " ");
        // Because it is not a string anymore. It is an object.

        //for (String s : p1.stringList( )) System.out.print(s + " ");

        //Generic wildcards enforce that the container contains "something, but we're not sure what"
        // and raw types are just "the container contains objects".
        List<?> wild = new ArrayList<String>();
        List    raw  = new ArrayList<>();
        //wild.add(1); // Compile time error
       // wild.add("Foo")
        raw.add(1);
        raw.add("Foo");
        //wild.add("string"); // Still a compile time error


        //Wild cards are represented as the same as raw at run time, but they are typechecked to make sure you never do something silly, like adding random objects to it.

        //So if you don't care about type safety, then yes, you can go ahead and use List, but for 3 characters, I'd just use the parameterized type.



    }

}

