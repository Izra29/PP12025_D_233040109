package tugas2;

public class Node {

    private int data;
    private Node next;

    /** Inisialisasi atribut node */
    public Node(int data) {
        this.data = data;
        this.next = null;  // Inisialisasi next dengan null
    }

    /** Setter untuk data */
    public void setData(int data) {
        this.data = data;
    }

    /** Getter untuk data */
    public int getData() {
        return this.data;
    }

    /** Setter untuk next */
    public void setNext(Node next) {
        this.next = next;
    }

    /** Getter untuk next */
    public Node getNext() {
        return this.next;
    }
}
