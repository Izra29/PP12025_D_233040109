package queue;

import tugas2.Node;

public class StrukturQueue {
    private Node FRONT;
    private Node REAR;

    // Latihan-2b: Implementasi isEmpty
    public boolean isEmpty() {
        return FRONT == null;
    }

    // Latihan-1: Implementasi enqueue
    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            FRONT = newNode;
            REAR = newNode;
        } else {
            REAR.setNext(newNode);
            REAR = newNode;
        }
    }

    // Latihan-3: Implementasi size
    public int size() {
        int size = 0;
        Node curNode = FRONT;
        while (curNode != null) {
            size++;
            curNode = curNode.getNext();
        }
        return size;
    }

    // Latihan-3: Implementasi front
    public int front() {
        return FRONT != null ? FRONT.getData() : -1;
    }

    // Latihan-5: Implementasi displayElements
    public void displayElements() {
        if (isEmpty()) {
            System.out.println("Elemen Queue: Queue kosong");
            return;
        }
        
        System.out.print("Elemen Queue: ");
        Node curNode = FRONT;
        while (curNode != null) {
            System.out.print(curNode.getData() + " ");
            curNode = curNode.getNext();
        }
        System.out.println();
    }

    // Tugas: Implementasi dequeue
    public int dequeue() {
        if (isEmpty()) {
            return -1; // atau bisa throw exception
        }
        
        int data = FRONT.getData();
        FRONT = FRONT.getNext();
        
        // Jika setelah dequeue queue menjadi kosong
        if (FRONT == null) {
            REAR = null;
        }
        
        return data;
    }
}