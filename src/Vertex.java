import java.util.ArrayList;
import java.util.List;

public class Vertex {
    private int id;
    private List<Edge> adjacentEdges;
    public Vertex(int id) { // constructor to init a vertex with given id
        this.id = id;
        this.adjacentEdges = new ArrayList<>();
    }
    public int getId(){ //getter to retrieve id of vertex
        return id;
    }
    public void addAdjacentEdge(Vertex vertex, int weight){ //method which add an adjacent edge to vertex
        Edge edge = new Edge(vertex, weight); // it takes vertex and weight as parameters
        adjacentEdges.add(edge);
    }
    public List<Edge> getAdjacentEdges(){ // method that retrieve list of adj edges of vertex
        return adjacentEdges;
    }
    public String toString(){ //that method provide a custom str representation of vertex
        return "Vertex " + id; // it return a str in format "Vertex <id>"
    }
}
