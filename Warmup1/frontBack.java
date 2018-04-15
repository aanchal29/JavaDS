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
public class frontBack {
    public String frontBack(String str) {
        int l = str.length();
        if(l>0){
        StringBuilder s = new StringBuilder(str);
        s.replace(0, 1, String.valueOf(str.charAt(l-1)));
        s.replace(l-1, l, String.valueOf(str.charAt(0)));
        return s.toString();
        }
        else
        return str;
}
}
