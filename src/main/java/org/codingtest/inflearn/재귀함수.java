package org.codingtest.inflearn;

import java.util.Scanner;

public class 재귀함수 {

    public void dfs(int n) {

        if (n == 0) {
            return;
        }
        dfs(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {

        재귀함수 main = new 재귀함수();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        main.dfs(n);
    }
}
