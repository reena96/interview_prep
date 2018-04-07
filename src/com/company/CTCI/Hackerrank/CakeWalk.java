package com.company.CTCI.Hackerrank;

import java.util.*;

public class CakeWalk {

    static int result = 1;
        static int power(int n ,int exp){
            if(exp == 0)
               result = 1;
            else {
                result = result * n;
            }
            return result;
        }
        static long marcsCakewalk(Integer[] calorie) {
            // Complete this function
            int sum = 0, n = calorie.length;
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < n; i++){
                list.add(calorie[i]);
            }
            Arrays.sort(calorie,Collections.reverseOrder());
            for(int i = 0; i < list.size(); i++){
                sum = sum + (power(2,i)*list.get(n-i-1));
            }
            double d = 4.8;
            long i = 2343434343L;
            char c = 65535;

            float x = 324.3f;


            System.out.println(i);

            return new Long(sum);
        }

        public static void main(String[] args) {
//            Scanner in = new Scanner(System.in);
//            int n = in.nextInt();
            int n = 3;
            Integer[] calorie = new Integer[n];
            for(int i = 0; i < n ;i++){
                calorie[i] = i+1;
            }
            long result = marcsCakewalk(calorie);
            System.out.println(result);
        }

}
