package com.company.CTCI.ArraysAndStrings;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args){
        String str = "mal";
//        System.out.println("Enter your username: ");
//        Scanner scanner = new Scanner(System.in);
//        String username = scanner.nextLine();
//        String firstName = scanner.next();
//        System.out.println("Your username is " + username + " " + firstName);

        Scanner sc = new Scanner(System.in);
//        String[] integers = new String[3];
//        for(int i = 0; i < 3; i++)
//        {
//            integers[i] = sc.nextLine();
//        }
//        String name = sc.nextLine();
//        System.out.println(integers[0]+" " +integers[1] + name);




        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your nationality: ");
        String nationality = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println(checkPalindrome(str));
    }

    private static boolean checkPalindrome(String str) {
        int i=0, val;
        str = str.replaceAll("[^a-zA-Z0-9]","").toLowerCase();


//        int a = (int)'a', z = (int)'z';
//        int zero = (int)'0', nine = (int)'9';
//
//        for(int j = 0;j<str.length();j++) {
//            val = (int)str.charAt(j);
//            if ((val >= zero && val <= nine) || (val >= a && val <= z)) {
//                newStr = newStr + str.charAt(j);
//            }
//        }


        for(int k = 0 ; k<str.length()/2; k++){
            if (str.charAt(k) != str.charAt(str.length()-1 - k))
                return false;
        }
        return true;
    }
}


//        char[] strArr = new char[newStr.length()/2];
//        while (i<(newStr.length()/2)){
//            strArr[i] = newStr.charAt(i);
//            i++;
//        }
////        for(char c :strArr){
////            System.out.println(c);
////        }
//        int lastIndex = (newStr.length()-1);
//        i = lastIndex;
//
//        while (i>(lastIndex-newStr.length()/2)){
//            if (newStr.charAt(i) != strArr[lastIndex - i])
//                return false;
//            i--;
//        }
