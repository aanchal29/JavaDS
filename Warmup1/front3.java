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
public class front3 {
    public static String front3(String str) {
        int l = str.length();
        if(l>=3)
        return str.substring(0, 3)+str.substring(0, 3)+str.substring(0, 3);
        else
        return str.substring(0, l)+str.substring(0, l)+str.substring(0, l); 
    }
    
    public static void main(String[] args){
        System.out.println(front3("ac"));
    }
}
