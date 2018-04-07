package com.company.generics.rawTypes;

// RAW TYPES!

public class Box<T> {  //FORMAL TYPE PARAMETER

    public void set(T t) {
    System.out.println(t);
    }

    public static void main(String[] args){

        Box<String> stringParBox = new Box<>(); // PARAMETERIZED TYPE- Box<String>,  TYPE ARGUMENT- <String>
        // you supply an actual type argument for the formal type parameter T
        stringParBox.set("Set by a stringParBox object");


        Box rawBox = new Box();
        rawBox.set("Set by a rawBox object");

        stringParBox = rawBox;
        stringParBox.set("Set by a stringParBox object");

        rawBox = stringParBox;

        rawBox.set("Set by a rawBox object");

        /***
        Box is the raw type of the generic type Box<T>

        Raw Types exist only for generic types.
        We can't have raw types for non-generic classes or interfaces.

        ***/
        //For backward compatibility, assigning a parameterized type to its raw type is allowed:
       // rawBox = stringParBox;




        rawBox.set("rawBox=stringParBox; SET by this rawBox object");
        stringParBox.set("rawBox=stringParBox; SET by this rawBox object");

        Box<String> stringParBox2 = new Box<>();
        Box rawBox2 = new Box();
        stringParBox2 = rawBox2;
        stringParBox2.set("parBox2 = rawBox2 ; Set by this stringParBox object");


    }
}
