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
Given a string that contains ternary expressions. 
The expressions may be nested, task is convert the given ternary expression to a binary Tree.

Examples:

Input :  string expression =   a?b:c 
Output :        a
              /  \
             b    c

Input : expression =  a?b?c:d:e
Output :     a
           /  \
          b    e
        /  \
       c    d
 */
//Node class
class Node {

    char data;
    Node left, right;

    public Node(char item) {
        data = item;
        left = null;
        right = null;
    }
}

public class TernaryExpressionToBinaryTree {
// Driver program to test above function

    static Node convertExpression(char[] exp){
        int i=0;
        if(i == exp.length)
            return null;
        
        Node root = new Node(exp[0]);
        ++i;
        
        if(exp[i]=='?')
            root.left=
    }
    
    static void printTree(Node root){
        if(root == null){
          System.out.println("Empty Tree");
          return;
        }
        System.out.println(root.data);
        printTree(root.left);
        printTree(root.right);
        
    }
    public static void main(String args[]) {
        String exp = "a?b?c:d:e";
        TernaryExpressionToBinaryTree tree = new TernaryExpressionToBinaryTree();
        char[] expression = exp.toCharArray();
        Node root= tree.convertExpression(expression);
        tree.printTree(root);
    }

}
