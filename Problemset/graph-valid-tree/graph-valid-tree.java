
// @Title: 以图判树 (Graph Valid Tree)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-02-08 20:17:52
// @Runtime: 26 ms
// @Memory: 56.9 MB

class Solution {

    public boolean validTree(int n, int[][] edges) {
        int[][] graph = new int[n][n];

        // Make graph
        for (int[] edge : edges) {
            graph[edge[0]][edge[1]] = 1;
            graph[edge[1]][edge[0]] = 1;
        }

        Deque<Integer> stack = new ArrayDeque<Integer>();
        stack.add(0);
        boolean[] visited = new boolean[n];

        // DFS
        while (!stack.isEmpty()) {
            Integer visitingIndex = stack.pop();
            visited[visitingIndex] = true;
            for (int i = 0; i < n; i++) {
                if (graph[visitingIndex][i] == 1) {
                    if (visited[i]) { return false; }
                    visited[i] = true;
                    graph[visitingIndex][i] = 0;
                    graph[i][visitingIndex] = 0;
                    stack.add(i);
                }
            }
        }

        // Check whether all nodes has been visited
        for (int i = 0; i < n; i++) {
            if (!visited[i]) { return false; }
        }

        return true;
    }

}
