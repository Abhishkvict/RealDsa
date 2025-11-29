package graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstSearch03 {
       List<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adjacencyList) {
        List<Integer> bfsOrder = new ArrayList<>();
        boolean[] visited = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();

        // Pass the starting node into queue
        queue.add(1);
        visited[1] = true;

        while (!queue.isEmpty()) {
            Integer element = queue.poll();
            bfsOrder.add(element);

            // Ask the picked node, who are the neighbors?
            for (Integer neighbor : adjacencyList.get(element)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }

        return bfsOrder;
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

        // Perform BFS on the adjacency list
        List<Integer> bfs = new BreadthFirstSearch03().bfsOfGraph(10, adj);
        System.out.println("BFS Traversal: " + bfs);
    }
}
