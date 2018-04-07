package com.company.CTCI.Hackerrank;

import java.util.*;

import static java.lang.Math.ceil;

/***
 * Given , can you determine if it's valid or not? If it's valid, print YES on a new line; otherwise, print NO instead.

 Input Format :::: A single string denoting "s"
 Constraints :::: String  consists of lowercase letters only (i.e., [a-z]).
 Output Format :::: Print YES if string  is valid; otherwise, print NO instead.

 Sample Input  :::: aabbcd
 Sample Output :::: NO
 Explanation   ::::
 We would need to remove two characters from  to make it valid, because a and b both have a
 frequency of  and c and d both have a frequency of . This means  is invalid because we'd need
 to remove more than  character to make all its letters have the same frequency, so we print NO
 as our answer.
 */
public class ValidString {
    static String isValid(String s){
        // Complete this function

        HashMap<Character,Integer> map = new HashMap<>();
        HashMap<Integer,Integer> countMap = new HashMap<>();
        int val =0;

        //Check no of times each character is occurring using map
        for(Character i: s.toCharArray()){
            if(map.containsKey(i)){
                val = map.get(i);
                map.put(i,++val);
            }
            else
                map.put(i,1);
        }

        //Check no of times same count is occurring by putting similar counts as keys
      for(Integer i : map.values()){
          System.out.println("Map: "+i);

          if(countMap.containsKey(i)){
              val = countMap.get(i);
              countMap.put(i,++val);
          }
          else
              countMap.put(i,1);
      }


      for(Integer i : countMap.values())
          System.out.println("CountMap: "+i);


       //Find frequently occurring count and save that in freqElement
        int  freqElement = 0,frequency = 0;
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet())
        {
            if(entry.getValue() > frequency)
            {
                freqElement = entry.getKey();
                frequency = entry.getValue();
            }
        }

        System.out.println("FREQ: "+freqElement);

        //Check if a number in the counts of the original map is as frequently occurring or not
        // if it is not, check if it happens more than once
        // and check if the difference of the 2 is more than 1 if the element is not equal to 1
        // i=1 here -> 111 - i > i , But i != 1
        int set = 0;
        for(Integer i : map.values()){
            if(i!=freqElement) {
                set = set + 1;
                if(set>1)
                    return "NO";
                if(Math.abs(freqElement - i )>1 && i!=1)
                    return "NO";
            }
        }
        return "YES";
    }

    public static void main(String[] args) {
        //String result = isValid("hfchdkkbfifgbgebfaahijchgeeeiagkadjfcbekbdaifchkjfejckbiiihegacfbchdihkgbkbddgaefhkdgccjejjaajgijdkd");
        String result = isValid("ibfdgaeadiaefgbhbdghhhbgdfgeiccbiehhfcggchgghadhdhagfbahhddgghbdehidbibaeaagaeeigffcebfbaieggabcfbiiedcabfihchdfabifahcbhagccbdfifhghcadfiadeeaheeddddiecaicbgigccageicehfdhdgafaddhffadigfhhcaedcedecafeacbdacgfgfeeibgaiffdehigebhhehiaahfidibccdcdagifgaihacihadecgifihbebffebdfbchbgigeccahgihbcbcaggebaaafgfedbfgagfediddghdgbgehhhifhgcedechahidcbchebheihaadbbbiaiccededchdagfhccfdefigfibifabeiaccghcegfbcghaefifbachebaacbhbfgfddeceababbacgffbagidebeadfihaefefegbghgddbbgddeehgfbhafbccidebgehifafgbghafacgfdccgifdcbbbidfifhdaibgigebigaedeaaiadegfefbhacgddhchgcbgcaeaieiegiffchbgbebgbehbbfcebciiagacaiechdigbgbghefcahgbhfibhedaeeiffebdiabcifgccdefabccdghehfibfiifdaicfedagahhdcbhbicdgibgcedieihcichadgchgbdcdagaihebbabhibcihicadgadfcihdheefbhffiageddhgahaidfdhhdbgciiaciegchiiebfbcbhaeagccfhbfhaddagnfieihghfbaggiffbbfbecgaiiidccdceadbbdfgigibgcgchafccdchgifdeieicbaididhfcfdedbhaadedfageigfdehgcdaecaebebebfcieaecfagfdieaefdiedbcadchabhebgehiidfcgahcdhcdhgchhiiheffiifeegcfdgbdeffhgeghdfhbfbifgidcafbfcd");
        System.out.println(result);

    }
}
