# Assignment-6
In this assignment i implement BFS and Djakstra for Edge-weighted graph with Vertex 

Vertex class:Represents a vertex in a graph. It has a list of neighboring edges and an ID.

Edge class:Represents an edge in a graph. It has a weight and a destination vertex.

WeightedGraph class:Represents a weighted graph. A list of vertices is kept there.

Search class:Abstract base class for different graph search algorithms. It offers standard
initialization functions for the visited and edgeTo arrays.

BFS class:Implements the Breadth-First Search algorithm. It performs a breadth-first traverse
of the graph starting from a specified source vertex and extends the Search class.

DijkstraSearch class:Implements Dijkstra's algorithm for finding the shortest path in a weighted graph.
It extends the Search class and uses a priority queue to find the shortest path between a specified source vertex and all other vertices.

The Main class is the entry point of the program. By adding vertices and their surrounding edges to an already existing weighted graph, it shows how to use the BFS and Dijkstra's method to discover the shortest path between a source vertex and a destination vertex. 

And overall, this code offers a foundation for interacting with graphs, doing graph searches, and locating the shortest paths in weighted graphs.

And this is how my graph look

        A --3-- B
        |       |
        4       2
        |       |
        C       D
   (7) /  \ (2) / (4)
     F --3-- E
     
     
.
  
