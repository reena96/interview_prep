package com.company.CTCI.ArraysAndStrings;

import java.util.HashMap;

public class CheckPermutation {
    //Checks if two strings are permutations of each other
    public static void main(String[] args){
        String str1= "abcd", str2 = "dbace";
        System.out.println("Are the given two strings permuatations of each other? ||| "
                +checkPermutation(str1,str2));

        String sentence="bca abc is of course bac" ,str = "abc";
        System.out.println("No of anagrams of given string in sentence: ||| "
                +checkInSentence(sentence,str));

        String string1 = "alabama", string2 = "balsamic"; int result = 0;
        if( string1.length() >= string2.length() )
            result = deletionsForAnagram(string1, string2);
        else
            result = deletionsForAnagram(string2, string1);
        System.out.println("How many deletions should be done in two strings to make them anagrams of each other? ||| "+result);

    }

    private static int checkInSentence(String sentence, String str) {
        String[] strings = sentence.split(" ");
        int count = 0;
        for(String s : strings){
            if(checkPermutation(s,str))
                count++;
        }
        return count;
    }

    private static int deletionsForAnagram(String str1, String str2) {
        int count = 0;
        int[] strArr = new int[26];

        for(int i = 0; i<str1.length() ; i++){
            int val = str1.charAt(i);
            int offset = (int)'a';
            strArr[val-offset]++;
        }

        for(int j = 0; j<str2.length() ; j++){
            int val = str2.charAt(j);
            int offset = (int)'a';
            strArr[val-offset]--;
        }

        for(int k = 0; k<strArr.length ; k++){
            if(strArr[k]!=0)
                count = count+ Math.abs(strArr[k]);
        }
        return count;
    }

    private static boolean checkPermutation(String str1, String str2) {
        int[] strArr = new int[128];

        for(int i = 0; i<str1.length() ; i++){
            int val = str1.charAt(i);
            strArr[val]++;
        }

        for(int j = 0; j<str2.length() ; j++){
            int val = str2.charAt(j);
            strArr[val]--;
            if(strArr[val]<0)
                return false;
        }
        return true;
    }



}
