package linkedlist2;

public class DoublyLinkedList {
    private Node head;
    private int size;

    public DoublyLinkedList() {
        this.head = null;
        this.size = 0;
    }
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(size == 0){
            head = newNode;
        }
        else{
            // Co it nhat 1 phan tu
            newNode.setNext(head);
            head.setPrevious(newNode);
            head = newNode;
        }
        size++;
    }
    public void addLast(int data){
        if(size == 0){
            addFirst(data);
        }
        else{
            // Bước 1: Tạo node mới
            Node newNode = new Node(data);
            // Bước 2: Tìm ra node cuối??
            Node lastNode = head;
            while(lastNode.getNext() != null){
                lastNode = lastNode.getNext();
            }
            // Buoc 3: set next node cuoi -> new node
            lastNode.setNext(newNode);
            newNode.setPrevious(lastNode);
            // Buoc 4: Tang size len 1 don vi
            size++;
        }
    }

    public void display(){
        if(size == 0){
            System.out.println("Danh sach lien ket rong!");
            return;
        }
        Node tmp = head;
        while (tmp != null){
            System.out.print(tmp+"<=>");
            tmp = tmp.getNext();
        }
        System.out.print("NULL\n");
    }

}
