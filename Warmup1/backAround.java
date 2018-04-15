/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Warmup1;

/**
 *
 * @author asharma
 */
public class backAround {
    public static String backAround(String str) {
        return String.valueOf(str.charAt(str.length()-1)) + str + String.valueOf(str.charAt(str.length()-1));
    }
    
     public static void main(String[] args){
        System.out.println(backAround("cat"));
    }
}
