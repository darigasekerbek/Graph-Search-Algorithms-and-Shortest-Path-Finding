public class Main {
    public static void main(String[] args)
    {
        Vertex A = new Vertex(0);
        Vertex B = new Vertex(1);
        Vertex C = new Vertex(2);
        Vertex D = new Vertex(3);
        Vertex E = new Vertex(4);

        A.addAdjacentEdge(B, 3);
        A.addAdjacentEdge(C, 3);
        B.addAdjacentEdge(D, 4);
        C.addAdjacentEdge(B, 1);
        C.addAdjacentEdge(E, 5);
        D.addAdjacentEdge(E, 2);

        WeightedGraph w_graph = new WeightedGraph();
        w_graph.addVertex(A);
        w_graph.addVertex(B);
        w_graph.addVertex(C);
        w_graph.addVertex(D);
        w_graph.addVertex(E);
         }
}