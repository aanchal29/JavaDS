/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterviewQuestions;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author asharma
 */
public class tripletsWithZeroSum {

    //Time Complexity : O(n3)
    static boolean naiveApproach(int arr[], int len) {
        boolean found = false;
        for (int i = 0; i < len - 2; i++) {
            for (int j = i + 1; j < len - 1; j++) {
                for (int k = j + 1; k < len; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                        found = true;
                    }
                }
            }
        }
        return found;
    }

    /*
    Run a loop from i=0 to n-2
    Create an empty hash table
    Run inner loop from j=i+1 to n-1
      If -(arr[i] + arr[j]) is present in hash table
         print arr[i], arr[j] and -(arr[i]+arr[j])
      Else
         Insert arr[j] in hash table.
     */
    static boolean hashingApproach(int arr[], int len) {
        boolean found = false;
        
        Set<Integer> set =  new HashSet<Integer>();
        for(int i=0; i< len-1; i++){
            set.add(i);
            
            for( int j = i+1; j<len; j++){
                int x = -(arr[i]+arr[j]);
                
                if(set.remove(x)){
                    System.out.println(arr[i] + " " + arr[j] + " " + x);
                    found = true;
                }
            }
        }
        return found;
    }

// Driver code
    public static void main(String[] args) {
        
        int arr[] = {0, -1, 2, -3, 1};
        int n = arr.length;
        
        if (!naiveApproach(arr, n)) {
            System.out.println("No Match");
        }
        System.out.println("-------");
        if (!hashingApproach(arr, n)) {
            System.out.println("No Match");
        }

    }
}
