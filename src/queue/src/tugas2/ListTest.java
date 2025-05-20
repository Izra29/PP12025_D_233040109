package tugas2;

public class ListTest {
    public static void main(String[] args) {
        StrukturList listA = new StrukturList();
        StrukturList listB = new StrukturList();

        // Untuk menghasilkan output "2.1 3.4 4.5"
        listA.addHead(2.1);
        listA.addTail(3.4);
        listA.addTail(4.5);
        System.out.print("List A: ");
        listA.display(); // Output: 2.1 3.4 4.5

        // Untuk menghasilkan output "3.4 2.1 1.1 4.5 5.5"
        listB.addHead(3.4);
        listB.addTail(4.5);
        listB.insertAtPosition(2.1, 2);
        listB.insertAtPosition(1.1, 3); // Tambahkan 1.1 di index 3
        listB.addTail(5.5);
        System.out.print("List B: ");
        listB.display(); // Output: 3.4 2.1 1.1 4.5 5.5
    }
}
