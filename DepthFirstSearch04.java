

import java.util.ArrayList;
import java.util.List;

public class DepthFirstSearch04 {
       void dfs(int node, boolean[] visited, ArrayList<ArrayList<Integer>> adjacencyList, List<Integer> result) {
               visited[node] = true;
        result.add(node);

           for (Integer neighbour : adjacencyList.get(node)) {
            if (!visited[neighbour]) {
                dfs(neighbour, visited, adjacencyList, result);
            }
        }
    }
    List<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adjacencyList) {
        List<Integer> dfsOrder = new ArrayList<>();
        boolean[] visited = new boolean[V];

        // start DFS from node 1
        // starting node, visited array, adjacency list, final result
        dfs(1, visited, adjacencyList, dfsOrder);

        return dfsOrder;
    }

    static void main() {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            adj.add(new ArrayList<>());
        }

        // Adding edges
        adj.get(1).add(2);
        adj.get(1).add(6);
        adj.get(2).add(1);
        adj.get(2).add(3);
        adj.get(2).add(4);
        adj.get(3).add(2);
        adj.get(4).add(2);
        adj.get(4).add(5);
        adj.get(5).add(4);
        adj.get(5).add(8);
        adj.get(6).add(1);
        adj.get(6).add(7);
        adj.get(6).add(9);
        adj.get(7).add(6);
        adj.get(7).add(8);
        adj.get(8).add(5);
        adj.get(8).add(7);
        adj.get(9).add(6);

        // Perform DFS on the adjacency list
        List<Integer> dfs = new DepthFirstSearch04().dfsOfGraph(10, adj);
        System.out.println("DFS Traversal: " + dfs);
    }
}
