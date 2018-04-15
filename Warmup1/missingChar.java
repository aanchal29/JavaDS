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
public class missingChar {
public String missingChar(String str, int n) {
  char[] a = str.toCharArray();
      StringBuilder ans = new StringBuilder();
      ans= ans.append(a);
      ans= ans.deleteCharAt(n);
      return ans.toString();
}
}
