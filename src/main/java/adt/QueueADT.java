package adt;

public interface QueueADT<T> {
    void enqueue(T t);
    T dequeue();
    T peek();

    boolean isFull();
    boolean isEmpty();

    String toString();
}
