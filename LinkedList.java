/*
 Linked List Implementation
 Based on Algorithms, 4th Edition, Section 1.3
 */

import java.util.Iterator;
import java.util.NoSuchElementException;
/**
 *
 * @author Taylor
 */
public class LinkedList<Item> implements Iterable<Item> {

    private String name;  //Holds the name of the list, if applicable
    private Node head;
    private Node tail = head;

    //Constructor with name
    public LinkedList(String name) {
        this.name = name;
        head = null;
        tail = head;
    }

    //Constructor without name
    public LinkedList() {
        this.name = "N/A";
        head = null;
        tail = head;
    }
    
    //The nodes for the list
    private class Node {

        Item data;  //The generic data the nodes contain
        Node next;
        Node prev;
        
        //Node constructor
        public Node(Item newData) {
            data = newData;
            next = null;
            prev = null;
        }

        public String toString() {
            return data.toString();
        }

        //Unnecessary?
        private void deleteNode() {  
            if (this.prev != null) {
                this.prev.next = this.next;
            }
            if (this.next != null) {
                this.next.prev = this.prev;
            }
        }
    }

    //Checks if the list is empty
    private boolean isEmpty() {
        return head == null;
    }
    
    //Adds node to end of list, for a push
    public void addToEnd(Item newData) {
        if (isEmpty()) {  //If it's the first (or all of the nodes have been removed)
            head = new Node(newData);
            tail = head;
        } else {
            tail.next = new Node(newData);
            tail.next.prev = tail;
            tail = tail.next;
        }
    }

    //Removes node from end of list, for a pop or dequeue
    public Item removeFromEnd() {
        if (isEmpty()) throw new NoSuchElementException("List empty");  //Trying to remove when there's no nodes left
        
        Item toReturn = tail.data;
        
        if(tail != head) {  //If there's more then one node left
            tail = tail.prev;
            tail.next = null;
        } else {  //Remove the last node
            tail = head = null;
        }
        
        return toReturn;
    }

    //Adds node to beginning of list, for a queue
    public void addToFront(Item newData) {
        if (isEmpty()) {  //If it's the first (or all of the nodes have been removed)
            head = new Node(newData);
            tail = head;
        } else {
            head.prev = new Node(newData);
            head.prev.next = head;
            head = head.prev;
        }
    }

    //Removes node from end of list
    public Item removeFromFront() {
        if (isEmpty()) throw new NoSuchElementException("List empty");
        
        Item toReturn = head.data;
        head = head.next;
        head.prev.deleteNode();
        
        return toReturn;
    }

    //Prints list from head to end
    public void printList() {
        Node currPos = head;
        while (currPos != null) {
            StdOut.print(currPos + " ");
            currPos = currPos.next;
        }
    }

    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item> {

        private Node curr = head;

        public boolean hasNext() {
            return curr != null;
        }

        //Not implemented
        public void remove() {
        }

        public Item next() {
            Item data = curr.data;
            curr = curr.next;
            return data;
        }
    }
    
    
    
    //Test client
    public static void main(String[] args) {
        //LinkedList<Integer> testLL = new LinkedList<Integer>("Test");
        LinkedList testLL = new LinkedList("Test");

        testLL.addToEnd(3);
        testLL.addToEnd(4);
        testLL.addToFront(2);
        testLL.addToEnd(5);
        testLL.addToFront(1);
        testLL.removeFromEnd();
        testLL.addToEnd("String");
        testLL.removeFromFront();
        testLL.addToFront(0);

        //testLL.printList();
        
        Iterator testIterator = testLL.iterator();
        while(testIterator.hasNext()) {
            Object toPrint = testIterator.next();
            StdOut.print(toPrint.toString() + " ");
        }
    }
}