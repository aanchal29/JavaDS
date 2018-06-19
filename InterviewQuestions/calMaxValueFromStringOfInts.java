/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterviewQuestions;

/**
 *
 * @author asharma
 */

/*
Given a string of numbers, the task is to find the maximum value from the string, you can add a ‘+’ or ‘*’ sign between any two numbers.

Examples:

Input : 01231
Output : 
((((0 + 1) + 2) * 3) + 1) = 10
In above manner, we get the maximum value i.e. 10

Input : 891
Output :73
As 8*9*1 = 72 and 8*9+1 = 73.So, 73 is maximum.
 */
public class calMaxValueFromStringOfInts {

//The task is pretty simple as we can get the maximum value on multiplying all values but the point is to handle the case of 0 and 1.
// So, use ‘*’ sign between any two numbers(except numbers containing 0 and 1) and use ‘+’ if any of the number is 0 and 1.
    static int maxValue(String inputString) {
        int ans = inputString.charAt(0) - '0';

        for (int i = 1; i < inputString.length(); i++) {
            if (inputString.charAt(i) == '0' || inputString.charAt(i) == '1' 
                    || inputString.charAt(i-1) == '0' || inputString.charAt(i-1) == '1') {
                ans = ans + (inputString.charAt(i) - '0');
                //System.out.println("ANS +++: "+ ans+" +at index i: "+i);
            } else {
                ans = ans * (inputString.charAt(i) - '0');
                //System.out.println("ANS ***: "+ ans+" +at index i: "+i);
            }
        }
        
        return ans;
    }

// Driver Method
    public static void main(String[] args) {
        System.out.println(maxValue("01231"));
    }

}
