package org.codingtest.inflearn;

import java.util.Scanner;

public class 이진수_출력 {

    public void dfs(int n) {

        if (n == 0) {
            return;
        }
        dfs(n / 2);
        System.out.print(n % 2 + " ");
    }

    public static void main(String[] args) {

        이진수_출력 main = new 이진수_출력();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        main.dfs(n);
    }
}
