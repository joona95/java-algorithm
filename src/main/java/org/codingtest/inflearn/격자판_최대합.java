package org.codingtest.inflearn;

import java.util.Scanner;

public class 격자판_최대합 {

    public int solution(int n, int[][] nums) {

        int answer = 0;

        int sum1, sum2;
        for (int i = 0; i < n; i++) {
            sum1 = sum2 = 0;
            for (int j = 0; j < n; j++) {
                sum1 += nums[i][j];
                sum2 += nums[j][i];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }

        sum1 = sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += nums[i][i];
            sum2 += nums[i][n - 1 - i];
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);

        return answer;
    }

    public static void main(String[] args) {

        격자판_최대합 main = new 격자판_최대합();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] nums = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                nums[i][j] = scanner.nextInt();
            }
        }

        System.out.println(main.solution(n, nums));
    }
}
