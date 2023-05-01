import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TopologicalBfs {
    static class Edge {
        int src;
        int dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 3));
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 1));
    }
    /// Topological using BFS ///

    public static void calIndeg(ArrayList<Edge> graph[], int indeg[]) {
        for (int i = 0; i < graph.length; i++) {
            int v = i;
            for (int j = 0; j < graph[v].size(); j++) {
                Edge e = graph[v].get(j);
                indeg[e.dest]++;
            }
        }
    }

    public static void topSort(ArrayList<Edge> graph[]) {
        int indeg[] = new int[graph.length];
        calIndeg(graph, indeg);
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < indeg.length; i++) {
            if (indeg[i] == 0) {
                q.add(i);
            }
        }
        while (!q.isEmpty()) {
            int curr = q.remove();
            System.out.print(curr + " ");
            for (int i = 0; i < graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);
                indeg[e.dest]--;
                if (indeg[e.dest] == 0) {
                    q.add(e.dest);
                }
            }
        }
    }

    /// All paths from source to target ///
    public static void printAllPath(ArrayList<Edge> graphs[], int src, int dest, String path) {
        if (src == dest) {
            System.out.println(path + src);
            return;
        }
        for (int i = 0; i < graphs[src].size(); i++) {
            Edge e = graphs[src].get(i);
            printAllPath(graphs, e.dest, dest, path + src);
        }
    }

    public static void main(String[] args) {
        int v = 6;
        ArrayList<Edge> grapj[] = new ArrayList[v];
        createGraph(grapj);
        // topSort(grapj);
        int s = 5;
        int d = 1;
        printAllPath(grapj, s, d, "");
    }

}
