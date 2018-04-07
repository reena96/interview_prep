package com.company.CTCI.Hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MagazineRansom {


        public static void main(String[] args) {
           String[] magazine = {"hello","reena","mary","reena"};
           String[] ransom = {"hello","mary","reena"};

            System.out.println(canMagazineBeUsed(magazine, ransom));
        }

            private static boolean canMagazineBeUsed(String[] magazine, String[] ransom) {
                if(magazine.length>=ransom.length){
                    Map<String, Integer> map = new HashMap<>();

                    for(int i = 0;i<magazine.length;i++){
                        if(map.containsKey(magazine[i]))
                            map.put(magazine[i],map.get(magazine[i])+1);
                        else
                            map.put(magazine[i],1);
                    }
//
//                    Set<String> set = map.keySet();
//                    for(String s: set){
//                        System.out.println("Key: "+s+" Value: "+map.get(s));
//                    }

                    for(int i = 0;i<ransom.length;i++){
                        if(map.containsKey(ransom[i])) {
                           // System.out.println(map.get(ransom[i]));
                            map.put(ransom[i], map.get(ransom[i]) - 1);
                            if(map.get(ransom[i]) < 0) {
                                //System.out.println(ransom[i] +","+map.get(ransom[i]));
                                return false;
                            }
                        }
                        else
                            return false;
                    }

//                    Set<String> set1 = map.keySet();
//                    for(String s: set){
//                        System.out.println("Key: "+s+" Value: "+map.get(s));
//                    }

                    return true;
                }
                return false;
            }




}
