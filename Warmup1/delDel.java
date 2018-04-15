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
public class delDel {
    public static String delDel(String actual) {  
        return (actual.indexOf("del")==1)?actual.substring(0, 1)+actual.substring(4, actual.length()) :actual;
        
    }

    
    public static void main(String[] args){
        String str= "aa";
        System.out.println(str.indexOf("2", 2));
        System.out.println(str.indexOf("5"));
        System.out.println(delDel("aadelHello"));
        char a[] = str.toCharArray();
    }

}
