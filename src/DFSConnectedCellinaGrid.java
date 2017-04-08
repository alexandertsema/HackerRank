import java.util.Scanner;

/**
 * Created by atsema on 3/3/2017.
 */
public class DFSConnectedCellinaGrid {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        int grid[][] = new int[n][m];
        for(int grid_i=0; grid_i < n; grid_i++){
            for(int grid_j=0; grid_j < m; grid_j++){
                grid[grid_i][grid_j] = in.nextInt();
            }
        }

        int maxCount = 0;
        for(int grid_i=0; grid_i < n; grid_i++){
            for(int grid_j=0; grid_j < m; grid_j++){
                if(grid[grid_i][grid_j] == 1){
                    int currentCount = dfs(grid, grid_i, grid_j, 0);
                    if (currentCount > maxCount)
                        maxCount = currentCount;
                }
            }
        }
        System.out.println(maxCount);
    }

    static int n = 0;
    static int m = 0;
    static int dfs(int[][] graph, int i, int j, int currCount){
        if (graph[i][j] == -1)
            return currCount;

        graph[i][j] = -1;
        currCount++;

        if ((i != 0 && j != 0) && graph[i - 1][j - 1] == 1)
            currCount = dfs(graph, i - 1, j - 1, currCount);
        if ((i != 0) && graph[i - 1][j] == 1)
            currCount = dfs(graph, i - 1, j, currCount);
        if ((i != 0 && j != m - 1) && graph[i - 1][j + 1] == 1)
            currCount = dfs(graph, i - 1, j + 1, currCount);
        if ((j != 0) && graph[i][j - 1] == 1)
            currCount = dfs(graph, i, j - 1, currCount);
        if ((j != m - 1) && graph[i][j + 1] == 1)
            currCount = dfs(graph, i, j + 1, currCount);
        if ((j != 0 && i != n - 1) && graph[i + 1][j - 1] == 1)
            currCount = dfs(graph, i + 1, j - 1, currCount);
        if ((i != n - 1) && graph[i + 1][j] == 1)
            currCount = dfs(graph, i + 1, j, currCount);
        if ((i != n - 1 && j != m - 1) && graph[i + 1][j + 1] == 1)
            currCount = dfs(graph, i + 1, j + 1, currCount);

        return currCount;
    }
}
