package com.company.CTCI.pramp;

class Solution {
    static int[] step2;
    static String encrypt(String word) {
        // your code goes here
        step2 = new int[word.length()];
        char[] letter = word.toCharArray();
        int val = 0;
        char[] encrypt = new char[letter.length];

        for(int i = 0; i<letter.length; i++){
            if (i == 0)
                val = (letter[i]) + 1;
            else
                val = Math.abs(letter[i] - val);

            step2[i] = val;
            while(val > 'z'){
                val = val - 26;
            }
            encrypt[i] = (char)val;
        }
        String result = new String(encrypt);
        return result;
    }
    static String decrypt(String word) {
        // your code goes here
        char[] letter = word.toCharArray();
        int val = 0, v = 0;
        char[] decrypt = new char[letter.length];

        for(int i = 0; i<letter.length; i++){
            if (i == 0){
                // val = (letter[i]) - 1;
                val = letter[i] - 1;
            }
            else{
                val = letter[i] + step2[i-1];
            }
            while(val < 'a'){
                val = val + 26;
            }
            decrypt[i] = (char)val;
        }
        String result = new String(decrypt);
        return result;
    }

    public static void main(String[] args) {
        // System.out.println(encrypt("crime"));
        System.out.println(decrypt("flgxswdliefy"));
    }

}