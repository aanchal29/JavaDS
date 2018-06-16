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

/*
Method 1 (By making enQueue operation costly) This method makes sure that oldest entered element is always at the top of stack 1, so that deQueue operation just pops from stack1. To put the element at top of stack1, stack2 is used.

enQueue(q, x)
  1) While stack1 is not empty, push everything from stack1 to stack2.
  2) Push x to stack1 (assuming size of stacks is unlimited).
  3) Push everything back to stack1.

dnQueue(q)
  1) If stack1 is empty then error
  2) Pop an item from stack1 and return it

Method 2 (By making deQueue operation costly)In this method, in en-queue operation, the new element is entered at the top of stack1. In de-queue operation, if stack2 is empty then all the elements are moved to stack2 and finally top of stack2 is returned.
*/

public class queueUsingStacks {
    
    static class Queue{
        Stack stack1;
        Stack stack2;       
    }
    
    static void push(Stack<Integer> st, int x){
        st.push(x);
    }
    
    static int pop(Stack<Integer> st){
        if(st.isEmpty()){
            System.out.println("Stack Overflow");
            System.exit(0);
        }
        int x = st.pop();
        return x;
    }
    
    static void enqueue(Queue q, int x){
        push(q.stack1, x);
    }
    
    static int dequeue(Queue q){
        if(q.stack1.isEmpty() && q.stack2.isEmpty()){
           System.out.println("Stack1 and Stack2 Empty");
           System.exit(0); 
        }
        if(q.stack2.isEmpty()){
            while(!q.stack1.isEmpty()){
                int x = pop(q.stack1);
                push(q.stack2, x);
            }
        }
        return pop(q.stack2);
    }
    
    public static void main(String args[]){
        Queue q = new Queue();
        q.stack1 = new Stack();
        q.stack2 = new Stack();
        
        enqueue(q, 1);
        enqueue(q, 2);
        enqueue(q, 3);
         
        /* Dequeue items */
        System.out.print(dequeue(q)+" ");
        System.out.print(dequeue(q)+" ");
        System.out.println(dequeue(q)+" ");
    }
}
