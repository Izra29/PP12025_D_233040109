package tugas1;

public class NodeMain {
    public static void main(String[] args) {
        // Membuat linked list untuk urutan 5, 7, 9, 8
        Node n1 = new Node(5);
        Node n2 = new Node(7);
        Node n3 = new Node(9);
        Node n4 = new Node(8);

        // Menghubungkan node
        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);

        // Menampilkan nilai dari linked list pertama
        System.out.print("Linked List 1: ");
        printList(n1);

        // Membuat linked list untuk urutan 2, 3, 5, 7, 9
        Node m1 = new Node(2);
        Node m2 = new Node(3);
        Node m3_2 = new Node(5);
        Node m4 = new Node(7);
        Node m5 = new Node(9);

        // Menghubungkan node
        m1.setNext(m2);
        m2.setNext(m3_2);
        m3_2.setNext(m4);
        m4.setNext(m5);

        // Menampilkan nilai dari linked list kedua
        System.out.print("Linked List 2: ");
        printList(m1);
    }

    // Metode untuk mencetak nilai dari linked list
    public static void printList(Node head) {
        Node p = head; // Pointer p menunjuk ke node pertama
        while (p != null) { // Selama p tidak null
            System.out.printf("%d ", p.getNilai()); // Mencetak nilai node
            p = p.getNext(); // Memperbarui p untuk menunjuk ke node berikutnya
        }
        System.out.println(); // Pindah ke baris baru setelah mencetak semua nilai
    }
}
