package org.codingtest.inflearn;

import java.util.Scanner;

public class 피보나치_재귀_메모이제이션 {

    private static int[] fibo;

    public int dfs(int n) {

        if (fibo[n] > 0) {
            return fibo[n];
        }
        if (n == 1) {
            return fibo[n] = 1;
        }
        if (n == 2) {
            return fibo[n] = 1;
        }
        return fibo[n] = dfs(n - 2) + dfs(n - 1);
    }

    public static void main(String[] args) {

        피보나치_재귀_메모이제이션 main = new 피보나치_재귀_메모이제이션();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        fibo = new int[n + 1];
        System.out.println(main.dfs(n));
    }
}
