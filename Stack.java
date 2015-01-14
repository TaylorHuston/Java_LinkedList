/*
Basic Stack using a Linked List 
Based on Section 1.3 of Algorithms, 4th Edition
*/

public class Stack {
    
    //LinkedList that holds the Stack
    private LinkedList<String> stackList;
    
    //Constructor
    public Stack() {
       stackList = new LinkedList();
    } //End Constructor
    
    //Add to top of stack
    private void push(String toAdd) {
        stackList.addToEnd(toAdd);
    } //End push
    
    //Remove and return from top of stack
    private String pop() {
        return stackList.removeFromEnd();
    } //End pop
    
    //Test client for Stack
    public static void main(String[] args) {

        Stack myStack = new Stack();
        
        myStack.push("Test");
        myStack.push("Test2");
        StdOut.println(myStack.pop());
        StdOut.println(myStack.pop());
        myStack.push("Test3");
        StdOut.println(myStack.pop());

    } //End main
} //End Stack
