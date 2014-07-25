/*
Linked List Implementation
Based on Algorithms, 4th Edition, Section 1.3
 */



/**
 *
 * @author Taylor
 */
public class LinkedList<Item> {
    private String name;
    private Node head;
    private Node tail = head;
    
    public LinkedList(String name) {
        this.name = name;
        head = null;
        tail = head;
    }

    private class Node<Item>{
        Item data;
        Node next;
        Node prev;
    

    public Node(Item newData) {
        data = newData;
        next = null;
        prev = null;
    }
    
    public String toString() {
        return data.toString();
        }
    }
    
    //Adds node to end of list
    private void addToEnd(Item newData){
        if (tail!= null) {
            tail.next = new Node(newData);
            tail.next.prev = tail;
            tail = tail.next;
            }
        else {
            tail = new Node(newData);
            head = tail;
        }
    }
    
    //Removes node from end of list
    private void removeFromEnd() {
        if(tail != null) {
            tail = tail.prev;
            tail.next = null;
        }
    }
    
    //Adds node to beginning of list
    private void addToFront(Item newData){
        if (head!= null) {
            head.prev = new Node(newData);
            head.prev.next = head;
            head = head.prev;
        }
        else {
            head = new Node(newData);
            tail = head;
        }
    }
    
    //Removes node from end of list
    private void removeFromFront() {
        if(head != null) {
            head = head.next;
            head.prev = null;
        }
    }
    
    //Prints list from head to end
    private void printList() {
        Node currPos = head;
        while (currPos != null){
            StdOut.print(currPos + " ");
            currPos = currPos.next;
        }
    }
    
    //Test client
    public static void main(String[] args) {
        LinkedList<Integer> testLL = new LinkedList<Integer>("Test");
        
        testLL.addToEnd(3);
        testLL.addToEnd(4);
        testLL.addToFront(2);
        testLL.addToEnd(5);
        testLL.addToFront(1);
        testLL.removeFromEnd();
        testLL.addToEnd(6);
        testLL.removeFromFront();
        testLL.addToFront(0);
        
        
        testLL.printList();
    }
}
