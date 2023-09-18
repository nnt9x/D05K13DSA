package linkedlist;

public class LinkedList {
    private Node head;
    private int size; // lưu lại kích thước

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        if (size == 0) return true;
        return false;
    }

    public void addFirst(int x) {
        // Tạo node mới có giá trị là x
        Node tmp = new Node(x);
        // Lấy ra head hiện tại
        tmp.setNext(head);
        // Trỏ head về tmp (tmp sẽ trở thành head mới)
        head = tmp;
        // Tăng size lên 1 đơn vị
        size++;
    }

    public void addLast(int x) {
        // Tìm ra dc phần tử cuối cùng trong LinkedList
        // Là phần tử có next = null

        // Bước 1: Tạo node mới từ x
        Node tmp = new Node(x); // Đây sẽ là node cuối cùng sau khi thêm
        // Bước 2: Cần tìm ra dc node cuối cùng hiện tại trong ds.
        Node j = null;
        for (int i = 0; i < size; i++) {
            if (j == null) {
                j = head;
            } else {
                j = j.getNext();
            }
        }
        j.setNext(tmp); // tmp sẽ là node cuối mới
        // Tang size len 1 don vi
        size++;
    }

    public void add(int x, int position) {
        if (position < 0) {
            throw new RuntimeException("Không hợp lệ!");
        } else if (position == 0) {
            addFirst(x);
        } else if (position == size) {
            addLast(x);
        } else if (position > size) {
            throw new RuntimeException("Không hợp lệ!");
        } else {
            // Thêm vào giữa
            // Bước 1: Lấy ra vị trí position -1
            Node previousNode = null;
            for (int i = 0; i <= position - 1; i++) {
                if (previousNode == null) {
                    previousNode = head;
                } else {
                    previousNode = previousNode.getNext();
                }
            }
            Node currentNode = previousNode.getNext();

            Node tmp = new Node(x);

            previousNode.setNext(tmp);
            tmp.setNext(currentNode);
            size++;

        }
    }
    
    public void display() {
        System.out.print("Linked list: ");
        Node j = null;
        for (int i = 0; i < size; i++) {
            if (j == null) j = head;
            System.out.print(j + "  ");
            j = j.getNext();
        }
        System.out.println();
    }
}
