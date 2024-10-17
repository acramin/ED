package Resto;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Graph {
        Map<Vertex, List<Vertex>> adjList = new HashMap<>();

        void addVertex(Vertex v) {
            adjList.putIfAbsent(v, new ArrayList<>());
        }

        void addEdge(Vertex u, Vertex v) {
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }

        List<Vertex> getNeighbors(Vertex v) {
            return adjList.getOrDefault(v, new ArrayList<>());
        }

        Set<Vertex> vertices() {
            return adjList.keySet();
        }
}

