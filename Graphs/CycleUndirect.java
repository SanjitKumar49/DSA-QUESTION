import java.util.ArrayList;

public class CycleUndirect {
    static class Edge {
        int src;
        int dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void createGarph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        // graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 0));

        graph[4].add(new Edge(4, 2));
    }

    public static boolean defectCycle(ArrayList<Edge> graphs[]) {
        boolean vis[] = new boolean[graphs.length];
        for (int i = 0; i < graphs.length; i++) {
            if (!vis[i]) {
                if (defectCycleUtil(graphs, vis, i, -1)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean defectCycleUtil(ArrayList<CycleUndirect.Edge>[] graphs, boolean[] vis, int curr, int par) {
        vis[curr] = true;
        for (int k = 0; k < graphs[curr].size(); k++) {
            Edge e = graphs[curr].get(k);
            if (!vis[e.dest]) {
                if (defectCycleUtil(graphs, vis, e.dest, curr)) {
                    return true;
                }
            } else if (vis[e.dest] && e.dest != par) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int v = 5;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGarph(graph);
        // for(int i=0; i<graph[2].size(); i++){
        // Edge curr=graph[2].get(i);
        // System.out.println(curr.dest);
        // }
        System.out.println(defectCycle(graph));
    }
}
