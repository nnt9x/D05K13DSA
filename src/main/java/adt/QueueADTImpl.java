package adt;

import java.util.ArrayList;
import java.util.List;

public class QueueADTImpl<T> implements QueueADT<T> {
    private int capacity;
    private int front, rear;
    private List<T> items;

    public QueueADTImpl(int capacity) {
        this.capacity = capacity;
        this.front = this.rear = -1;
        this.items = new ArrayList<>();
    }

    @Override
    public void enqueue(T t) {
        if (isFull()) {
            throw new RuntimeException("Queue is full");
        }
        if (front == -1) {
            front = 0;
        }
        rear++;
        items.add(t);
    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        T t = items.get(front);
        if (front == rear) {
            front = rear = -1;
        } else {
            front++;
        }
        return t;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return items.get(front);
    }

    @Override
    public boolean isFull() {
        if (front == 0 && rear == capacity - 1) return true;
        return false;
    }

    @Override
    public boolean isEmpty() {
        if (front == -1) return true;
        return false;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Queue: ");
        for (int i = front; i <= rear; i++) {
            builder.append(items.get(i) + "  ");
        }
        builder.append("\n");
        return builder.toString();
    }
}
