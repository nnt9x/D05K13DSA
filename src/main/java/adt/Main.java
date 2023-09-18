package adt;

public class Main {
    public static void main(String[] args) {
        QueueADT<Double> q1 = new QueueADTImpl<>(100);
        q1.enqueue(1.5);
        q1.enqueue(4.0);
        q1.enqueue(4.5);

        System.out.println(q1);
        q1.dequeue();
        System.out.println(q1);

         QueueADT<Message> messageQueueADT = new QueueADTImpl<>(1000);

        // Tao 1 luong -> fake tin nhan den (<5s=> 10 tin nhan)
        Thread t1 = new Thread(new FakeMessage(messageQueueADT));
        Thread t2 = new Thread(new HandleMessage(messageQueueADT));
        t1.start();
        t2.start();
    }
}
