import java.util.ArrayList;
import java.util.List;
public class Search {
    protected int[] edgeTo;
    protected boolean[] visited;
    protected Vertex source;
    protected WeightedGraph graph;
    public Search (WeightedGraph graph, Vertex source){ //constructor to init search with a weighted graph and source vertex
        this.graph = graph;
        this.source = source;
        visited = new boolean[graph.getVertices().size()];
        edgeTo = new int[graph.getVertices().size()];
        initial();
    }
    private void initial(){ //helper method which init visited and edgeTo arrays
        for (int i = 0; i< visited.length; i++){
            visited[i] = false;
            edgeTo[i] = -1;

        }
    }
    public List<Vertex> getPath(Vertex destination){ //method which retrieve path from source vertex to a destination vertex
        List<Vertex> path = new ArrayList<>();
        if(!visited[destination.getId()]){ // if destin vertex isn't visited, return an empty path
            return path;
        }
        int curr = destination.getId();
        //traverse edgeTo array backwards from destination to source to construct the path
        while (curr != source.getId()){
            path.add(0, graph.getVertices().get(curr));
            curr = edgeTo[curr];
        }
        path.add(0,source); //add source vertex to the path
        return path;
    }

}
