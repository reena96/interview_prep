package com.company.CTCI.ArraysAndStrings;

import com.company.Null;

import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;
public class LinkedHashMapDemp {
    public static void main(String args[]) {

        String input = "chicago";
        char c = ' ';
        int n;
        // HashMap Declaration
        LinkedHashMap<Character, Integer> map =
                new LinkedHashMap<>();



        for (int i = 0; i < input.length(); i++) {
            c = input.charAt(i);

            if (map.containsKey(c)) {
                n = map.get(c);
                map.put(c, ++n);
            }
            else
                map.put(c,1);
        }

        // Displaying elements of LinkedHashMap
        Iterator iterator = map.entrySet().iterator();

        while(iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            System.out.print(entry.getKey() +
                    " : " + printStars((Integer)entry.getValue())+ "\n");
        }

    }

    private static String printStars(Integer n) {
        String str = "";
        for(int i = 0 ; i< n ; i++){
            str = str + "*";
        }
        return str;
    }


}