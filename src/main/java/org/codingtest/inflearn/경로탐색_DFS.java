package org.codingtest.inflearn;

import java.util.Scanner;

public class 경로탐색_DFS {

    static int n, m, answer = 0;
    static boolean[][] graph;
    static boolean[] check;

    public void dfs(int v) {

        if (v == n) {
            answer++;
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (graph[v][i] && !check[i]) {
                check[i] = true;
                dfs(i);
                check[i] = false;
            }
        }

    }

    public static void main(String[] args) {

        경로탐색_DFS main = new 경로탐색_DFS();
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        graph = new boolean[n + 1][n + 1];
        check = new boolean[n + 1];
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            graph[a][b] = true;
        }
        check[1] = true;
        main.dfs(1);
        System.out.println(answer);
    }
}
