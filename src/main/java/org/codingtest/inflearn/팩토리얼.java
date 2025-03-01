package org.codingtest.inflearn;

import java.util.Scanner;

public class 팩토리얼 {

    public int dfs(int n) {

        if (n == 1) {
            return 1;
        }

        return n * dfs(n - 1);
    }

    public static void main(String[] args) {

        팩토리얼 main = new 팩토리얼();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(main.dfs(n));
    }
}
