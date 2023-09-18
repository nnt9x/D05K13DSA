package queue;

public class MyQueue {
    // Đinh nghia 1 hang doi chua so
    private int capacity; // kich thuoc
    private int items[]; // mang phan tu
    private int front, rear; // vi tri dau va cuoi queue

    public MyQueue(int capacity) {
        this.capacity = capacity;
        this.items = new int[capacity];
        this.front = this.rear = -1;
    }

    public boolean isEmpty() {
        if (front == -1) return true;
        return false;
    }

    public boolean isFull() {
        if (front == 0 && rear == capacity - 1) return true;
        return false;
    }

    public void enqueue(int x) {
        if (isFull()) {
            throw new RuntimeException("Queue is full");
        }
        if (front == -1) {
            front = 0;
        }
        rear++;
        items[rear] = x;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        int item = items[front];
        if (front == rear) {
            // reset lai hang doi
            front = rear = -1;
        } else {
            front++;
        }
        return item;
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.printf("Queue is empty");
            return;
        }
        System.out.print("Queue: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(items[i] + "  ");
        }
        System.out.println();
    }
}
