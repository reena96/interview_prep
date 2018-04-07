package com.company.CTCI.ArraysAndStrings;

import java.util.HashMap;

public class UniqueCharacters {
    public static void main(String[] args){
        HashMap<Character,Character> ch = new HashMap<>();
        String x = "44";

        //  WITHOUT Using a data structure
        boolean notUnique = false;
        for(int i=0;i<x.length();i++){
           for(int j=i+1;j<x.length(); j++){
               if(x.charAt(i)==x.charAt(j)) {
                   notUnique = true;
                   break;
               }
           }
        }
        if(notUnique)
            System.out.println("Doesn't have unique characters");
        else
            System.out.println("Has unique characters");





        //Using a data structure
        for(int i=0;i<x.length();i++){
            ch.put(x.charAt(i),x.charAt(i));
        }
        System.out.println(ch.keySet());
        if(x.length()>ch.size())
            System.out.println("Doesn't have unique characters");
        else
            System.out.println("Has unique characters");
    }

}
