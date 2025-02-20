package tugas2;

public class StrukturList {
    private Node HEAD;  


    public StrukturList() {
        this.HEAD = null;
    }

    public boolean isEmpty() {
        return this.HEAD == null;
    }

 //untuk menambahkan Tail
//    public void addTail(int data) {
//        Node posNode = null, curNode = null;
//        Node newNode = new Node(data);  
//
//       
//        if (isEmpty()) {
//            HEAD = newNode;
//        } else {
//           
//            curNode = HEAD;
//            while (curNode != null) {
//                posNode = curNode;
//                curNode = curNode.getNext();
//            }
//         
//            posNode.setNext(newNode);
//        }
//    }

  
    public void display() {
        Node temp = HEAD;
        while (temp != null) {
            System.out.print(temp.getData() + " -> ");
            temp = temp.getNext();
        }
        System.out.println("null");
    }
    
    public void displayElement() {
        Node curNode = HEAD;
        while (curNode != null) {
            System.out.print(curNode.getData() + " ");
            curNode = curNode.getNext();  
        }
        System.out.println();  
    }
    //untuk menambahkan Head
//    public void addHead(int data) {
//        Node newNode = new Node(data);  // Buat node baru dengan data yang diberikan
//
//        if (isEmpty()) {  // Jika list kosong (HEAD = null)
//            HEAD = newNode;  // Node baru menjadi HEAD
//        } else {  
//            newNode.setNext(HEAD);  // Hubungkan node baru ke node HEAD yang lama
//            HEAD = newNode;         // Perbarui HEAD ke node baru
//        }
//    }

    
}



