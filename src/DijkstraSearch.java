public class DijkstraSearch extends Search{
    private int[] dist;
    public DijkstraSearch(WeightedGraph graph, Vertex source){
        super(graph, source);
        dist = new int [graph.getVertices().size()];
        Dijkstra(source);
    }
    private void Dijkstra(Vertex source){
        for(int i=0; i<dist.length; i++);
        dist[i] = Integer.MAX_VALUE;
    }
}
