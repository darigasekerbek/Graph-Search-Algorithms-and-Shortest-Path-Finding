import java.util.LinkedList;
import java.util.Queue;

public class BFS extends Search {
    public BFS(WeightedGraph graph, Vertex source){
        super(graph,source);
        bfs(source);
    }
    private void bfs(Vertex source){ //breadth first search algorithm
        Queue<Vertex> q = new LinkedList<>(); // q = queue
        visited[source.getId()] = true;
        q.offer(source);
        while (!q.isEmpty()){
            Vertex curr_V = q.poll(); // curr_V = Current_Vertex
            for (Edge edge : curr_V.getAdjacentEdges()){ // traverse adjacent edges of curr vertex
                Vertex adj_V = edge.getDestination();
                // if adjacent vertex hasn't been visited, mark it as visited
                // and update edgeTo array and enqueue vertex
                if(!visited[adj_V.getId()]){
                    visited[adj_V.getId()] = true;
                    edgeTo[adj_V.getId()] = curr_V.getId();
                    q.offer(adj_V);
                }
            }
        }
    }
}
