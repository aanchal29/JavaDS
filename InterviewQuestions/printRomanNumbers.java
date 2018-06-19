/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterviewQuestions;

import java.util.TreeMap;

/**
 *
 * @author asharma
 */

/*
https://www.geeksforgeeks.org/converting-decimal-number-lying-between-1-to-3999-to-roman-numerals/
Given a number, find its corresponding Roman numeral.
Example:

Input : 9
Output : IX

Input : 40
Output : XL

Input :  1904
Output : MCMIV
*/

public class printRomanNumbers {
    
    static String intToRomanUsingArray(int num){
        StringBuffer ans = new StringBuffer("");
        
        String ones[] = {"","I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String tens[] = {"","X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String hundreds[] = {"","C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "DM"};
        String thousands[] = {"", "M", "MM", "MMM"};
        
        int thou= num/1000;
        ans.append(thousands[thou]);
        
        int hun= num%1000;
        ans.append(hundreds[hun/100]);
         
        int ten= hun%100;
        ans.append(tens[ten/10]);
         
        int one= ten%10;
        ans.append(ones[one]);
        
        return ans.toString();
       
    }
    
    static String intToRomanUsingTreeMap(int num){
        StringBuffer ans = new StringBuffer("");
        
        TreeMap<Integer, String> map = new TreeMap<Integer, String>();
        map.put(1, "I");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(90, "XC");
        map.put(100, "C");
        map.put(400, "CD");
        map.put(500, "D");
        map.put(900, "CM");
        map.put(1000, "M");
  
        int l = map.floorKey(num);
        
        if( num == l)
            return map.get(l).toString();
        return map.get(l).toString() + intToRomanUsingTreeMap(num - l);
       
       
    }
    
    public static void main(String args[]){
        System.out.println(intToRomanUsingArray(3549));
        System.out.println(intToRomanUsingTreeMap(3549));
    }
    
}
