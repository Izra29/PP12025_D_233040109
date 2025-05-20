package tugas2;

public class StrukturList {
    // Class Node untuk menyimpan data pecahan
    static class Node {
        double data;
        Node next;

        public Node(double data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head; // Pointer ke elemen pertama

    public StrukturList() {
        this.head = null;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    // Menambahkan node di awal (Head)
    public void addHead(double data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Menambahkan node di akhir (Tail)
    public void addTail(double data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            return;
        }
        Node curNode = head;
        while (curNode.next != null) {
            curNode = curNode.next;
        }
        curNode.next = newNode;
    }

    // Menambahkan node di posisi tertentu
    public void insertAtPosition(double data, int position) {
        Node newNode = new Node(data);
        if (position == 1) { // Jika posisi pertama, gunakan addHead
            addHead(data);
            return;
        }

        Node curNode = head;
        Node prevNode = null;
        int i = 1;

        while (curNode != null && i < position) {
            prevNode = curNode;
            curNode = curNode.next;
            i++;
        }

        if (prevNode != null) {
            prevNode.next = newNode;
        }
        newNode.next = curNode;
    }

    // Menampilkan isi linked list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
