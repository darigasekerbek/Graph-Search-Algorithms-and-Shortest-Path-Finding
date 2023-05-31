import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class DijkstraSearch extends Search {
    private int[] dist;

    public DijkstraSearch(WeightedGraph graph, Vertex source) {
        super(graph, source);
        dist = new int[graph.getVertices().size()];
        Dijkstra(source);
    }

    private void Dijkstra(Vertex source) { // Dijkstra algorithm implementation
        for (int i = 0; i < dist.length; i++) { // init distance array with max value
            dist[i] = Integer.MAX_VALUE;
        }
        //Use a priority queue to keep track of vertices based on their distances
        PriorityQueue<Vertex> pqueue = new PriorityQueue<>(Comparator.comparingInt(v -> dist[v.getId()]));
        dist[source.getId()] = 0; // set distance of source vertex to 0 and add it to priority queue
        pqueue.offer(source);
        while (!pqueue.isEmpty()) { //perform this algorithm
            Vertex curr_V = pqueue.poll();
            for (Edge edge : curr_V.getAdjacentEdges()) { //traverse adjacent edges of the current vert
                Vertex adj_V = edge.getDestination();
                int weight = edge.getWeight();
                int newDist = dist[curr_V.getId()] + weight; // calculate new dist from source to the adjacent vertex
                // if new dist shorter, update dist and edgeTo arrays
                // and enqueue adjacent vertex to priority queue
                if (newDist < dist[adj_V.getId()]) {

                    dist[adj_V.getId()] = newDist;
                    edgeTo[adj_V.getId()] = curr_V.getId();
                    if (pqueue.contains(adj_V)) {  //remove adjacent vertex from the priority queue if it's already in it
                        pqueue.remove(adj_V);
                    }
                    pqueue.offer(adj_V); // enqueue adjacent vertex with the updated distance
                }
            }
        }
    }
    public int getShortDist(Vertex destination) { //method to retrieve the shortest dist from source vertex to destination vertex
        return dist[destination.getId()];
    }
    public List<Vertex> getShortPath(Vertex destination){ //method to retrieve the shortest path from source vertex to a destination vertex
        List<Vertex> path = new ArrayList<>();
        if (dist[destination.getId()] == Integer.MAX_VALUE) {
            return path;
        }
        int curr = destination.getId();
        //travelse edgeTO array backwards from destination to source to construct the shortest path
        while (curr!= source.getId()){
            path.add(0, graph.getVertices().get(curr));
            curr = edgeTo[curr];
        }
        //add source vertex to the path
        path.add(0,source);
        return path;
    }
}


