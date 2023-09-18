package linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addFirst(10);
        linkedList.display();
        linkedList.addFirst(20);
        linkedList.display();
        linkedList.addLast(30);
        linkedList.display(); // 20 10 30
        linkedList.addLast(40);
        linkedList.display(); // 20 10 30 40
        linkedList.add(50, 1);
        linkedList.display(); // 20 50 10 30 40
        linkedList.add(100, 1); // 20 100 50 10 30 40
        linkedList.display();
        linkedList.add(200, 0);
        linkedList.display();
        linkedList.add(300, 7);
        linkedList.display();
        System.out.println(linkedList.removeFirst());
        linkedList.display();
        System.out.println(linkedList.removeLast());
        linkedList.display();
        System.out.println(linkedList.remove(2));
        linkedList.display();
    }
}
