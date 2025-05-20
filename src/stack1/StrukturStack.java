package stack1;

public class StrukturStack {
    private int[] array;
    private int capacity;
    private int TOP;
    public final int MIN = -1;

    public StrukturStack(int capacity) {
        super();
        this.array = new int[capacity];
        this.capacity = capacity;
        this.TOP = MIN;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack penuh");
        } else {
            TOP++;
            array[TOP] = data;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack kosong");
            return MIN;
        } else {
            int data = array[TOP];
            TOP--;
            return data;
        }
    }

    public boolean isEmpty() {
        return (TOP == MIN);
    }

    public boolean isFull() {
        return (TOP == capacity - 1);
    }

    public int size() {
        return TOP + 1;
    }

    public int top() {
        if (isEmpty()) {
            return MIN;
        } else {
            return array[TOP];
        }
    }

    public void displayElements() {
        if (isEmpty()) {
            System.out.println("Elemen from TOP: Stack kosong");
        } else {
            System.out.print("Elemen from TOP: ");
            for (int i = TOP; i >= 0; i--) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }
}
