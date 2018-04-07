package com.company.divideAndConquer;

class MergeSort
{
    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        //System.out.println(" n1 and n2 are sizes of two subarrays to be merged");
        int n1 = m - l + 1;
        System.out.println("  n1 = "+n1);
        int n2 = r - m;
        System.out.println("  n2 = "+n2);

        /* Create temp arrays */
        int L[] = new int [n1];
        int R[] = new int [n2];

        System.out.println("  Copy data into temp arrays");
        /*Copy data to temp arrays*/
        System.out.println("  Left Sub Array: ");
        for (int i=0; i<n1; ++i) {
            L[i] = arr[l + i];
            System.out.print("  "+L[i]+" ");
        }
        System.out.println();
        System.out.println("  Right Sub Array: ");
        for (int j=0; j<n2; ++j) {
            R[j] = arr[m + 1 + j];
            System.out.print("  "+R[j]+" ");
        }
        System.out.println();


        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
        System.out.println("  Value of i = "+i);
        System.out.println("  Value of j = "+j);

        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2)
        {
            System.out.println("  Iteration of k = "+k);
            if (L[i] <= R[j])
            {
                System.out.println("  Value being copied from L to arr[k] is "+L[i]+ " at k = "+k);
                arr[k] = L[i];
                i++;
                System.out.println("  i updated to = "+i);
            }
            else
            {
                System.out.println("  Value being copied from R to arr[k] is "+R[j]+" at k = "+k);
                arr[k] = R[j];
                j++;
                System.out.println("  j updated to = "+j);

            }
            for(int count=0;count<arr.length;count++){
                System.out.print("  "+arr[count]+" "); }
            System.out.println();

            k++;
        }


        /* Copy remaining elements of L[] if any */
        System.out.println("  i="+i+ " n1="+n1+ "  i<n1?" );
        System.out.println("  j="+j+ " n2="+n2+ "  j<n2?" );

        while (i < n1)
        {
            System.out.println("  i < n1");
            System.out.println("  i="+i+ "< n1 ="+n1);
            System.out.println("  L array's copied into arr at k="+k);
            arr[k] = L[i];
            i++;
            k++;
        }


        /* Copy remaining elements of R[] if any */
        while (j < n2)
        {
            System.out.println("  j < n2");
            System.out.println("  j="+j+ "< n2 ="+n2);
            System.out.println("  R array's copied into arr at k="+k);
            arr[k] = R[j];
            j++;
            k++;
        }
        System.out.println("  Array arr");
        for(int count=0;count<arr.length;count++){
            System.out.print("  "+arr[count]+" "); }
        System.out.println();
    }

    // Main function that sorts arr[l..r] using
    // merge()
    void sort(int arr[], int l, int r)
    {
        System.out.println();
        System.out.println("low -l = "+l);
        System.out.println("high -r = "+r);
        if (l < r)
        {
            // Find the middle point
            int m = (l+r)/2;
            System.out.println("Mid -m= "+m);

            // Sort first and second halves
            System.out.println("sort LEFT(arr,"+l+","+m+")");
            sort(arr, l, m);
            System.out.println("Return from "+"sort LEFT(arr,"+l+","+m+")");
            System.out.println("sort RIGHT(arr,"+(m+1)+","+r+")");
            sort(arr , m+1, r);
            System.out.println("Return from "+"sort RIGHT(arr,"+(m+1)+","+r+")");


            // Merge the sorted halves
            System.out.println("merge(arr,"+l+","+m+","+r+")");
            merge(arr, l, m, r);
            System.out.println("Return from "+"merge(arr,"+l+","+m+","+r+")");



        }
        else {
            System.out.println("l = "+l+" not < than "+"r = "+r+"");
        }
    }

    /* A utility function to print array of size n */
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver method
    public static void main(String args[])
    {
        int arr[] = {12, 11, 13, 5, 6, 7, 8};

        System.out.println("Given Array");
        printArray(arr);

        MergeSort ob = new MergeSort();
        System.out.println("ob.sort(arr,"+"0"+","+(arr.length-1)+")");
        ob.sort(arr, 0, arr.length-1);



        System.out.println("\nSorted array");
        printArray(arr);
    }
}
/* This code is contributed by Rajat Mishra */