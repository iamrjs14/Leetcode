import java.util.Iterator;
import java.util.LinkedList;

public class DFSGraph {


    private int V;
    private LinkedList<Integer> adj[];

    public DFSGraph(int v, LinkedList<Integer>[] adj) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i) {
            adj[i] = new LinkedList();
        }
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    void DFSUtil(int s, boolean visited[]) {
        visited[s] = true;
        Iterator<Integer> itr = adj[s].listIterator();
        while (itr.hasNext()) {
            int n = itr.next();
            if (!visited[n]) {
                DFSUtil(n, visited);
            }
        }

    }

    void DFS(int v) {
        boolean[] visited = new boolean[v];
        DFSUtil(v, visited);
    }


}
