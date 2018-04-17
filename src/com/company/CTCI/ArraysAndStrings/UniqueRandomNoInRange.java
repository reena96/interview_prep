package com.company.CTCI.ArraysAndStrings;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class UniqueRandomNoInRange {
    static int minRange=0,maxRange=50,newRandom;
    public static void main(String[] args) {
        Random random = new Random();
        Set<Integer> used = new HashSet<>();
       // int num = getUniqueRandom(5,7,random,used);
        for(int i = 0;i<9;i++){
            System.out.println(getUniqueRandom(2,10,random,used));
        }
       // System.out.println(num);
    }

    public static int getUniqueRandom(int min, int max, Random random, Set<Integer> used) {
        if(min<0){
            min = minRange;
        }
        if(max>50){
            max = maxRange;
        }
        if(used.size() == maxRange){
            return -1;
            /*** "cannot get more unique numbers than the size of the range"
             ***/
        } else {
            do {
                // 6 - 5 = 1 + 5
                newRandom = random.nextInt((max - min) ) + min;
            } while (used.contains(newRandom));

            used.add(newRandom);
            return newRandom;
        }
    }
}
