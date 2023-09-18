package linkedlist;

public class Node {
    private int data;
    private Node next;

    public Node(int data) {
        this.data = data;
        // Mặc định khi tạo các node không liên kết đến các node khác
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return String.valueOf(data);
    }
}
