package com.company.CTCI.ArraysAndStrings;

import java.util.HashMap;
import java.util.Map;

public class InterviewQuestion {

/*
Given a string, return a de-duplicated string.

Example: chicago -> chiago

 */
    public static  void main(String[] args) {
            String input = "chicago";
            System.out.println(removeDuplicates(input));
    }

    public static String removeDuplicates(String input) {

            String str = "";
            int n = 0;
            char c = ' ';
            Map<Character, Integer> map = new HashMap<>();


            for(int i =0; i< input.length(); i++){
                c= input.charAt(i);

                if(map.containsKey(c)){
                    n = map.get(c);
                    map.put(c,++n);
                }
                else{
                    map.put(c,1);
                }
            }
        

            for(int i =0; i< input.length(); i++){
                c = input.charAt(i);
                if(map.containsKey(c) && map.get(c) > 0){
                    System.out.println(c + " : " + printStars(map.get(c)));
                    map.put(c,0);
                }
            }

            return str;

    }

    private static String printStars(Integer n) {
        String str = "";
        for(int i = 0 ; i< n ; i++){
            str = str + "*";
        }
        return str;
    }

}
