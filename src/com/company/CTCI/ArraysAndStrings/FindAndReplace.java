package com.company.CTCI.ArraysAndStrings;

import static java.util.regex.Pattern.quote;

public class FindAndReplace {

    public static void main(String[] args){
        String entireString= "What 1234 your problem and 1234 it all okay?", toBeReplaced = "ononon", replacement = "is";
        System.out.println(findAndReplace(entireString, toBeReplaced, replacement));
//        System.out.println(entireString.substring(4));
//        System.out.println(entireString.lastIndexOf("ononon"));

        String str= "What 1234 your problem and 1234 it all okay?";
        str= str.replaceAll("[[12]&&[^3456]]",".");

//        System.out.println(str.replaceAll("[[12]&&[^3456]]","."));
        System.out.println(quote(str));
    }

    private static String findAndReplace(String entireString, String toBeReplaced, String replacement) {
        String str = "";
        int startIndex = 0;
        int matchIndex = entireString.indexOf(toBeReplaced,startIndex);
        if(matchIndex == -1)
            return "No match found";
        while (matchIndex != -1){
            str = str + entireString.substring(startIndex,matchIndex) + replacement;
            startIndex = matchIndex + toBeReplaced.length();;
            matchIndex = entireString.indexOf(toBeReplaced,startIndex);
        }
        str = str+ entireString.substring(startIndex);

        return str;
    }
}
