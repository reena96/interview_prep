package com.company.Leetcode;

import java.util.*;


/***
     *
     *
     * Given a string, find the length of the longest substring without repeating characters.
     *
     Given "abcabcbb", the answer is "abc", which the length is 3.
     Given "bbbbb", the answer is "b", with the length of 1.
     Given "pwwkew", the answer is "wke", with the length of 3.
     Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
     * @param
     */
public class LongestSubstring {

        public static void main(String[] args) {
            String str = "pwwkeemnop";
                    //"abcabcbb";
            //method 1
            System.out.println(lengthOfLongestSubstring1(str));

            //method 2
            System.out.println(lengthOfLongestSubstring2(str));
        }

        //method 1
    public static int lengthOfLongestSubstring1(String s) {
        int maxLength = 0;
        HashSet<Character> set = new HashSet<>();

        int i = 0;
        int j = 0;
        while (j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                j++;
                maxLength = Math.max(maxLength, j - i);
            } else {
                set.remove(s.charAt(i));
                i++;
            }
        }
        return maxLength;
    }


    //method 2
    public static int lengthOfLongestSubstring2(String s) {
        int n = s.length();
        int ans = 0;
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j <= n; j++)
                if (allUnique(s, i, j)) {
                    ans = max(ans, j - i);
                    //System.out.println("ans: "+ans+"  i="+i+",j="+j+ "  j-i: "+(j-i));
                }
        return ans;
    }
                    /***
                     max() is a method in Math class.   =>  Math.max(int a, int b)
                     Added max() implementation here just for reference
                     ***/


        public static boolean allUnique(String s, int start, int end) {
            Set<Character> set = new HashSet<>();
            for (int i = start; i < end; i++) {
                Character ch = s.charAt(i);
                if (set.contains(ch)) return false;
                set.add(ch);
            }
            return true;
        }

        public static int max(int a, int b) {
            return (a >= b) ? a : b;
        }





}
