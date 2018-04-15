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
public class notString {
    public static String notString(String actual) {
        if(actual.length()>=3 && actual.substring(0, 3).equals("not"))
            return actual;
        else
            return "not "+actual;
    }
    public static void main(String[] args){
        System.out.println(notString("not"));
    }
}