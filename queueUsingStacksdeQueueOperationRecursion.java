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
Queue can also be implemented using one user stack and one Function Call Stack. 
Below is modified Method 2 where recursion is used to implement queue using only one user defined stack.

enQueue(x)
  1) Push x to stack1.

deQueue:
  1) If stack1 is empty then error.
  2) If stack1 has only one element then return it.
  3) Recursively pop everything from the stack1, store the popped item 
    in a variable res,  push the res back to stack1 and return res

The step 3 makes sure that the last popped item is always returned 
and since the recursion stops when there is only one item in stack1 (step 2), 
we get the last element of stack1 in dequeue() and all other items are pushed back in step
 */
public class queueUsingStacksdeQueueOperationRecursion {

    static class Queue {

        Stack stack1;
        Stack stack2;

    }

    static void push(Stack<Integer> st, int x) {
        st.push(x);
    }

    static int pop(Stack<Integer> st) {
        if (st.isEmpty()) {
            System.out.println("Empty Stack");
            System.exit(0);
        }
        return st.pop();
    }

    static void enQueue(Queue q, int x) {
        push(q.stack1, x);
    }

    static int deQueue(Queue q) {
        int x, res = 0;
        if (q.stack1.isEmpty() && q.stack2.isEmpty()) {
            System.out.println("Stack1 and Stack2 Empty");
            System.exit(0);
        } else if (q.stack1.size() == 1) {
            return pop(q.stack1);
        } else {
            /* pop an item from the stack1 */
            x = pop(q.stack1);

            /* store the last dequeued item */
            res = deQueue(q);

            /* push everything back to stack1 */
            push(q.stack1, x);
            return res;
        }
        return res;
    }

    /* Driver function to test above functions */
    public static void main(String[] args) {
        /* Create a queue with items 1 2 3*/
        Queue q = new Queue();
        q.stack1 = new Stack<>();

        enQueue(q, 1);
        enQueue(q, 2);
        enQueue(q, 3);

        /* Dequeue items */
        System.out.print(deQueue(q) + " ");
        System.out.print(deQueue(q) + " ");
        System.out.print(deQueue(q) + " ");

    }

}
