

import java.util.ArrayList;
import java.util.Scanner;

public class AdjacencyList {
    static void main() {
        Scanner sc = new Scanner(System.in);

        // number of nodes
        int N = 5;

        // number of edges
        int M = 6;

        ArrayList<ArrayList<Integer>> adjacencyList = new ArrayList<>(N + 1);


        for (int i = 0; i <= N; i++) {
            adjacencyList.add(new ArrayList<>());
        }
        adjacencyList.get(1).add(2);
        adjacencyList.get(2).add(1);
        adjacencyList.get(1).add(3);
        adjacencyList.get(3).add(1);
        adjacencyList.get(2).add(4);
        adjacencyList.get(4).add(2);
        adjacencyList.get(2).add(5);
        adjacencyList.get(5).add(2);
        adjacencyList.get(3).add(4);
        adjacencyList.get(4).add(3);
        adjacencyList.get(4).add(5);
        adjacencyList.get(5).add(4);

        for (int i = 1; i <= N; i++) {
            System.out.print(i + " -> ");
            for (int j = 0; j < adjacencyList.get(i).size(); j++) {
                System.out.print(adjacencyList.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
