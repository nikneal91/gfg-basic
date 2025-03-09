package com.example.gfg;

import java.util.Arrays;

/**
 * Input: sizeOfArray = 6, arr[] = {1, 2, 3, 4, 5}, element = 90
 *  Output: 1 2 3 4 5 90
 *  Explanation: After inserting 90 at the end, we have array elements as 1 2 3 4 5 90.
 */
public class Issue1 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int element =90;
        int[] arr = Arrays.copyOf(arr1, 6);
        int sizeOfArray= arr1.length+1;
        insertAtEnd(arr, sizeOfArray, element);
        System.out.println(Arrays.toString(arr));
    }

   static void insertAtEnd(int arr[],int sizeOfArray,int element)
    {
        /* Solved Issue #1 for adding element at end of array  */
        arr[sizeOfArray-1]=element;
    }

}