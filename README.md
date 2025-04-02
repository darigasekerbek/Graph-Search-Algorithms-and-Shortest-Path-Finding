# Graph Search Algorithms and Shortest Path Finding

This assignment implements **Breadth-First Search (BFS)** and **Dijkstra's Algorithm** for edge-weighted graphs. The primary goal is to demonstrate the use of graph search algorithms to find the shortest path between a source vertex and a destination vertex in a weighted graph.

### Key Classes and Their Responsibilities:

- **Vertex Class**: Represents a vertex (or node) in the graph. Each vertex holds a unique identifier (ID) and a list of neighboring edges.
  
- **Edge Class**: Represents an edge connecting two vertices in the graph. Each edge has an associated weight and points to a destination vertex.

- **WeightedGraph Class**: Represents the entire weighted graph, maintaining a collection of vertices.

- **Search Class**: An abstract base class for various graph search algorithms. It provides standard functionality, such as initialization of `visited` and `edgeTo` arrays, to support algorithm implementation.

- **BFS Class**: Implements the **Breadth-First Search (BFS)** algorithm. This class performs a breadth-first traversal starting from a specified source vertex and extends the `Search` class to manage traversal.

- **DijkstraSearch Class**: Implements **Dijkstra's Algorithm** to find the shortest path in a weighted graph. This class extends the `Search` class and utilizes a **priority queue** to compute the shortest paths from a source vertex to all other vertices in the graph.

### Main Class
The `Main` class serves as the entry point of the program, allowing the user to interact with the weighted graph. Vertices and their corresponding edges are added to the graph, and both **BFS** and **Dijkstra's Algorithm** are used to compute the shortest paths between a source and destination vertex.

### Graph Visualization

This is how the graph looks visually:

        A ----3---- B
        |           |
        4           2
        |           |
        C ----7---- F
       /  \         |  
     (7)   (2)      3
    /       \       |
   F -------- E ----3---- D

     
