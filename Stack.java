/*
 Linked List Stack Implementation
 Based on Algorithms, 4th Edition, Section 1.3
 */

/**
 *
 * @author Taylor
 */
public class Stack {
    LinkedList<String> stackList;
    
    public Stack() {
        stackList = new LinkedList();
    }
    
    private void push(String toAdd) {
        stackList.addToEnd(toAdd);
    }
    
    private String pop() {
        return stackList.removeFromEnd();
    }
    
    public static void main(String[] args) {
        Stack myStack = new Stack();
        myStack.push("Test");
        myStack.push("Test2");
        StdOut.println(myStack.pop());
        StdOut.println(myStack.pop());
        myStack.push("Test3");
        StdOut.println(myStack.pop());
        StdOut.println(myStack.pop());
    }
}
