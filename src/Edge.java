public class Edge {
    private Vertex destination;
    private int weight;
    public Edge(Vertex destination, int weight){ // constructor to init an edge with a destination vertex and weight
        this.destination = destination;
        this.weight = weight;
    }
    public Vertex getDestination(){
        return destination;
    }
    public int getWeight(){
        return weight;
    }
}
