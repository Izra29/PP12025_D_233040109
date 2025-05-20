package stack1;

public class MainStack {
    public static void main(String[] args) {
        StrukturStack stack = new StrukturStack(3);
        
        System.out.println("#Sebelum push");
        System.out.println("Size: " + stack.size());
        System.out.println("Empty: " + stack.isEmpty());
        System.out.println("Full: " + stack.isFull());
        System.out.println("Top: " + stack.top());
        stack.displayElements();
        
        System.out.println("\n#Melakukan push 3x:");
        System.out.println("push 2; push 4, push 1");
        stack.push(2);
        stack.push(4);
        stack.push(1);
        
        System.out.println("Size: " + stack.size());
        System.out.println("Empty: " + stack.isEmpty());
        System.out.println("Full: " + stack.isFull());
        System.out.println("Top: " + stack.top());
        stack.displayElements();
        
        // Pengujian operasi pop
        System.out.println("\n#Melakukan pop 1x:");
        int popped = stack.pop();
        System.out.println("Data yang di-pop: " + popped);
        System.out.println("Size: " + stack.size());
        System.out.println("Empty: " + stack.isEmpty());
        System.out.println("Full: " + stack.isFull());
        System.out.println("Top: " + stack.top());
        stack.displayElements();
    }
}
