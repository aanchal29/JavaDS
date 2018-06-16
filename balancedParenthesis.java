/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stacks;

import java.util.Stack;

/**
 *
 * @author asharma
 */
public class balancedParenthesis {

    static boolean isMatchingPair(char character1, char character2) {
        if (character1 == '(' && character2 ==')')
            return true;
        else if (character1 == '[' && character2 ==']')
            return true;
        else if (character1 == '{' && character2 =='}')
            return true;
        else
            return false;
    }

    static boolean isBalanced(char exp[]) {

        Stack st = new Stack();

        for (int i = 0; i < exp.length; i++) {

            if (exp[i] == '{' || exp[i] == '(' || exp[i] == '[') {
                st.push(exp[i]);
            }

            if (exp[i] == '}' || exp[i] == ')' || exp[i] == ']') {
                if (st.isEmpty()) {
                    return false;
                } else if (!isMatchingPair((char) st.pop(), exp[i])) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String args[]) {
        char exp[] = {'(',')','}','[',']'};
        System.out.println("The expression is: " + isBalanced(exp));
    }
}
