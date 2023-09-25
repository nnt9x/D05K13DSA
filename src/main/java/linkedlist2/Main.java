package linkedlist2;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList linkedList = new DoublyLinkedList();
        linkedList.addFirst(10);
        linkedList.display();
        linkedList.addFirst(20);
        linkedList.display();
        linkedList.addLast(30);
        linkedList.display(); // 20 10 30
        linkedList.addLast(40);
        linkedList.display(); // 20 10 30 40
        linkedList.add(50, 1); // 20 50 10 30 40
        linkedList.display();
        linkedList.add(60, 0);
        linkedList.display();
        linkedList.add(80, 6);
        linkedList.display();

    }
}
