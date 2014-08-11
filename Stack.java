/*
 Linked List Stack Implementation
 Based on Algorithms, 4th Edition, Section 1.3
 */

/**
 *
 * @author Taylor
 */
public class Stack {
    LinkedList StackList;
    
    public Stack() {
        StackList = new LinkedList();
    }
    
    private void push(String toAdd) {
        StackList.addToEnd(toAdd);
    }
    
    private String pop() {
        return (String) StackList.removeFromEnd();
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
