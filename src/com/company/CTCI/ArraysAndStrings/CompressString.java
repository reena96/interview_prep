package com.company.CTCI.ArraysAndStrings;

public class CompressString {
    public static void main(String[] args){
        String str = "abcd                                                                                                    ";
        System.out.println(compressString(str));

    }

    private static String compressString(String str) {
        String comStr = "";
        int c = 1;
        char prev = '0';
        int compressedLen = 0;
        int originalLen = str.length();

        char[] ca = str.toCharArray();
        for(int i = 0;i<ca.length;i++){
            char cur = ca[i];

            if(i!=0){
                if(cur == prev) {
                    c++;
                }
                else {
                    comStr = comStr + prev + String.valueOf(c);
                    c = 1;
                }
            }
            prev = ca[i];
        }
        comStr = comStr + prev + String.valueOf(c);

        compressedLen = comStr.length();
        if(compressedLen < originalLen)
            return comStr;
        else
            return str;


    }
}
