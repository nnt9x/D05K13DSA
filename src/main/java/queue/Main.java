package queue;

public class Main {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue(10);
        myQueue.enqueue(10);
        myQueue.printQueue();
        myQueue.enqueue(20);
        myQueue.printQueue();
        myQueue.enqueue(30);
        myQueue.printQueue();

        System.out.println("Dequeue: " + myQueue.dequeue());
        myQueue.printQueue();

        myQueue.enqueue(40);
        myQueue.printQueue();

        System.out.println("Dequeue: " + myQueue.dequeue());
        myQueue.printQueue();
        System.out.println("Dequeue: " + myQueue.dequeue());
        myQueue.printQueue();
        System.out.println("Dequeue: " + myQueue.dequeue());
        myQueue.printQueue();
    }
}
