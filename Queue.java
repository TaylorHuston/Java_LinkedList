/*
 Linked List Implementation, based on Section 1.3 of
<a href="http://algs4.cs.princeton.edu/home/">Algorithms, 4th Edition - Robert Sedgewick | Kevine Wayne</a>
 */
public class Queue {
    LinkedList<String> queueList;
    
    public Queue() {
        queueList = new LinkedList();
    }
    
    private void enqueue(String toAdd) {
        queueList.addToFront(toAdd);
    }
    
    private String dequeue() {
        return queueList.removeFromEnd();
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
