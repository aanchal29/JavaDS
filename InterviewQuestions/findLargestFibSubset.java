/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author asharma
 */

/*
Given an array with positive number the task is that we find largest subset from array that contain elements which are Fibonacci numbers.

Examples :

Input : arr[] = {1, 4, 3, 9, 10, 13, 7};
Output : subset[] = {1, 3, 13}
The output three numbers are Fibonacci
numbers.

Input  : arr[] = {0, 2, 8, 5, 2, 1, 4, 
                  13, 23};
Output : subset[] = {0, 2, 8, 5, 2, 1, 
                    13, 23}
 */
public class findLargestFibSubset {

    static ArrayList<Integer> findFibSubset(Integer arr[]) {
        Integer max = Collections.max(Arrays.asList(arr));

        ArrayList fib = new ArrayList();
        ArrayList ans = new ArrayList();

        // Generate all Fibonacci numbers till max and store them
        Integer a = 0, b = 1;
        while (b < max) {
            Integer c = a + b;
            a = b;
            b = c;
            fib.add(c);
        }

        // Now iterate through all numbers and quickly check for Fibonacci
        for (int i = 0; i < arr.length; i++) {
            if (fib.contains(arr[i])) {
                ans.add(arr[i]);
            }
        }
        return ans;
    }

// Driver code
    public static void main(String args[]) {
        Integer[] a = {4, 2, 8, 5, 20, 1, 40, 13, 23};

        System.out.println(findFibSubset(a));
    }
}
