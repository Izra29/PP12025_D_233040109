package Graph;

public class Vertex {
    private char label; // label (e.g. 'A')
    private boolean wasVisited;
    
    public Vertex(char lab) { // constructor
        label = lab;
        wasVisited = false;
    }
    
    // Getter dan Setter
    public char getLabel() {
        return label;
    }
    
    public boolean isWasVisited() {
        return wasVisited;
    }
    
    public void setWasVisited(boolean wasVisited) {
        this.wasVisited = wasVisited;
    }
}
