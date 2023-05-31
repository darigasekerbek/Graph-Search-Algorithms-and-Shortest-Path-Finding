import java.util.ArrayList;
import java.util.List;
public class WeightedGraph {
    private List<Vertex> vertices;
    public WeightedGraph(){
        this.vertices = new ArrayList<>();
    }
    public void addVertex(Vertex vertex){
        vertices.add(vertex);
    }
    public List<Vertex> getVertices(){
        return vertices;
    }
}
