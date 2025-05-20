package queue;

public class QueueMain {
    public static void main(String[] args) {
        StrukturQueue queue = new StrukturQueue();
        
        // Sebelum enqueue
        System.out.println("### Sebelum Enqueue 4x ###");
        System.out.println("size: " + queue.size());
        System.out.println("isEmpty: " + queue.isEmpty());
        queue.displayElements();
        System.out.println();
        
        // Enqueue 4x
        queue.enqueue(2);
        queue.enqueue(7);
        queue.enqueue(6);
        queue.enqueue(1);
        
        System.out.println("### Enqueue 4x ###");
        System.out.println("size: " + queue.size());
        System.out.println("isEmpty: " + queue.isEmpty());
        queue.displayElements();
        System.out.println("Front: " + queue.front());
        System.out.println();
        
        // Tugas: Test dequeue
        System.out.println("### Dequeue 2x ###");
        System.out.println("Dequeue 1: " + queue.dequeue());
        System.out.println("Dequeue 2: " + queue.dequeue());
        System.out.println("size: " + queue.size());
        System.out.println("isEmpty: " + queue.isEmpty());
        queue.displayElements();
        System.out.println("Front: " + queue.front());
    }
}

