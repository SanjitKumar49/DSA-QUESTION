import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class DfsvsBfs {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    static void CreateGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));

        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));

        graph[6].add(new Edge(6, 5, 1));
    }

    public static void bfs(ArrayList<Edge> graphs[]) {
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[graphs.length];
        q.add(0);
        while (!q.isEmpty()) {
            int curr = q.remove();
            if (!vis[curr]) {
                System.out.println(curr + " ");
                vis[curr] = true;
                for (int i = 0; i < graphs[curr].size(); i++) {
                    Edge e = graphs[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    public static void dfs(ArrayList<Edge> graphsp[], int curr, boolean vis[]) {
        System.out.println(curr + " ");
        vis[curr] = true;
        for (int i = 0; i < graphsp[curr].size(); i++) {
            Edge e = graphsp[curr].get(i);
            if (!vis[e.dest]) {
                dfs(graphsp, e.dest, vis);
            }
        }

    }

    public static boolean hasPath(ArrayList<Edge>[] graph, int src, int dest, boolean vis[]) { 
        if (src == dest) {
            return true;
        }

          vis[src] = true;
        for (int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);  
            if (!vis[e.dest] && hasPath(graph, e.dest, dest, vis)) { // e.dest==neibour elements...
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
    int v = 7;
        ArrayList<Edge> graphs[] = new ArrayList[v];
        CreateGraph(graphs);
        // bfs(graphs);
        //dfs(graphs, 0, new boolean[v]);
        System.out.println(hasPath(graphs, 0, 9, new boolean[v]));

    }
}
