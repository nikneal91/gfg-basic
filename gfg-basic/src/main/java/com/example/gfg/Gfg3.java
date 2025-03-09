package com.example.gfg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;


/**
* Input: arr[] = [1, 2, 3, 4, 5], k = 3
* Output: [3, 2, 1, 5, 4]
* Explanation: First group consists of elements 1, 2, 3. Second group consists of 4,5.
 */
public class Gfg3 {
    
    public static void main(String[] args) {
        Long[] arr = {1L, 2L, 3L, 4L, 5L};
        int k =3;
        ArrayList<Long> list = new ArrayList<>(Arrays.asList(arr));
        reverseInGroups(list, k);
        System.out.println(list.toString());
    }
    

    // Function to reverse every sub-array group of size k.
    static void reverseInGroups(ArrayList<Long> arr, int k) {
       Stack<Long> st = new Stack<>();
       for ( int i=0;i < arr.size(); i+=k) {

        int end = Math.min ( i+k  , arr.size());
        for ( int j =i ; j<end; j++) {
            st.push(arr.get(j));
        }

        for ( int j=i ; j < end; j++) {
            arr.set( j, st.pop());
        }

       }
    }

}


