

import java.util.Scanner;

public class AdjacencyMatrix01 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        // number of nodes
        int N = sc.nextInt();

        // number of edges
        int M = sc.nextInt();

        // Adjacency Matrix for undirected graph
        int[][] adjacencyMatrix = new int[N + 1][N + 1];

     
        adjacencyMatrix[1][2] = 1;
        adjacencyMatrix[2][1] = 1;
        adjacencyMatrix[1][3] = 1;
        adjacencyMatrix[3][1] = 1;
        adjacencyMatrix[2][4] = 1;
        adjacencyMatrix[4][2] = 1;
        adjacencyMatrix[3][4] = 1;
        adjacencyMatrix[4][3] = 1;
        adjacencyMatrix[2][5] = 1;
        adjacencyMatrix[5][2] = 1;
        adjacencyMatrix[4][5] = 1;
        adjacencyMatrix[5][4] = 1;

        // Print adjacency matrix
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
