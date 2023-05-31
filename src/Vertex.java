import java.util.ArrayList;

public class Vertex {
    private int id;
    private List<Edge> adjacentEdges;
    public Vertex(int id) {
        this.id = id;
        this.adjacentEdges = new ArrayList<>();
    }
    public int getId(){
        return id;
    }
}
