package com.company.CTCI.pramp;

public class DecryptMessage {

    static String encrypt(String word) {
        // your code goes here
        char[] letter = word.toCharArray();
        int val = 0;
        char[] encrypt = new char[letter.length];

        for(int i = 0; i<letter.length; i++){
            if (i == 0)
                val = (letter[i]) + 1;
            else
                val = (letter[i]) + val;

            while(val > 'z'){
                val = val - 26;
            }
            encrypt[i] = (char)val;
        }
        String result = new String(encrypt);
        return result;
    }


    public static void main(String[] args) {

        System.out.println(encrypt("crime"));
        System.out.println("1");
    }

}
