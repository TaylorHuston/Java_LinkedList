/*
 Linked List Stack Implementation
 Based on Algorithms, 4th Edition, Section 1.3
 */

/**
 *
 * @author Taylor
 */
public class Queue {
    LinkedList QueueList;
    
    public Queue() {
        QueueList = new LinkedList();
    }
    
    private void enqueue(String toAdd) {
        QueueList.addToFront(toAdd);
    }
    
    private String dequeue() {
        return (String) QueueList.removeFromEnd();
    }
    
    public static void main(String[] args) {
        Queue myQueue = new Queue();
        myQueue.enqueue("Test");
        myQueue.enqueue("Test2");
        StdOut.println(myQueue.dequeue());
        StdOut.println(myQueue.dequeue());
        myQueue.enqueue("Test3");
        StdOut.println(myQueue.dequeue());
        StdOut.println(myQueue.dequeue());
    }
}
