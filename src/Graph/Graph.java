package Graph;

public class Graph {
    private final int MAX_VERTS = 20;
    private Vertex vertexList[]; // array of vertices
    private int adjMat[][]; // adjacency matrix
    private int nVerts; // current number of vertices
    
    public Graph(int k) {
        vertexList = new Vertex[MAX_VERTS];
        adjMat = new int[MAX_VERTS][MAX_VERTS];
        nVerts = 0;
        // initialize adjacency matrix
        for(int i=0; i<MAX_VERTS; i++) {
            for(int j=0; j<MAX_VERTS; j++) {
                adjMat[i][j] = 0;
            }
        }
    }
    
    public void addVertex(char lab) {
        vertexList[nVerts++] = new Vertex(lab);
    }

    public void addEdge(int start, int end) {
        adjMat[start][end] = 1;
        adjMat[end][start] = 1; // untuk graph tidak berarah
    }
    
    public void adjacencyMatrix() {
        System.out.print("  ");
        for(int i=0; i<nVerts; i++) {
            System.out.print(vertexList[i].getLabel() + " ");
        }
        System.out.println();
        
        for(int i=0; i<nVerts; i++) {
            System.out.print(vertexList[i].getLabel() + " ");
            for(int j=0; j<nVerts; j++) {
                System.out.print(adjMat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
