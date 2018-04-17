package com.company.CTCI.ArraysAndStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MedianSortedArrays {

        public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

            int m = nums1.length;
            int n = nums2.length;
            double[] arr = new double[m + n];
            List<Integer> list = new ArrayList<>();
            for(int i=0;i<m; i++){
                arr[i] = nums1[i];
            }

            for(int i=m, j=0; i<m+n; i++, j++){
                arr[i] = nums2[j];
            }

            Arrays.sort(arr);


            //1 2 3 4

            int len = arr.length;
            double median = 0;

            if (len % 2 == 0){
              //  System.out.println(( arr[len/2 - 1] + arr[len/2] )/2);
                median = ( arr[len/2 - 1] + arr[len/2] )/2 ;
             //   System.out.println("Median"+median + " OF " + arr[len/2 - 1]+ " AND " + arr[len/2] );
            }
            else{
                median = arr[len/2];
            }
           //System.out.println(median);

            return median;

        }


        public static void main(String[] args){
            int[] nums1 = {1, 3}, nums2 = {2};
             System.out.println(findMedianSortedArrays(nums1,nums2));
        }

}
