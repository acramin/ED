package Resto;
import java.util.Objects;

public class Edge {
        Vertex u;
        Vertex v;

        Edge(Vertex u, Vertex v) {
            this.u = u;
            this.v = v;
        }

        boolean contains(Vertex vertex) {
            return u.equals(vertex) || v.equals(vertex);
        }

        Vertex otherVertex(Vertex vertex) {
            if (u.equals(vertex)) return v;
            if (v.equals(vertex)) return u;
            return null;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Edge edge = (Edge) o;
            return (u.equals(edge.u) && v.equals(edge.v)) || (u.equals(edge.v) && v.equals(edge.u));
        }

        @Override
        public int hashCode() {
            return Objects.hash(u, v);
        }
}

