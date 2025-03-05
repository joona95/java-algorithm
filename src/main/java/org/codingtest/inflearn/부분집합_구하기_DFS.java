package org.codingtest.inflearn;

import java.util.Scanner;

public class 부분집합_구하기_DFS {

    private static int n;
    private static boolean[] ch;

    public void dfs(int L) {

        if (L == n + 1) {
            StringBuilder answer = new StringBuilder();
            for (int i = 1; i <= n; i++) {
                if (ch[i]) {
                    answer.append(i).append(" ");
                }
            }
            if (answer.length() > 0) {
                System.out.println(answer);
            }
        } else {
            ch[L] = true;
            dfs(L + 1);
            ch[L] = false;
            dfs(L + 1);
        }
    }

    public static void main(String[] args) {

        부분집합_구하기_DFS main = new 부분집합_구하기_DFS();
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        ch = new boolean[n + 1];

        main.dfs(1);
    }
}
