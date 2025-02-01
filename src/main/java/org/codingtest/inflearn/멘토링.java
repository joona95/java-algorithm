package org.codingtest.inflearn;

import java.util.Scanner;

public class 멘토링 {

    public int solution(int n, int m, int[][] nums) {

        int answer = 0;

        for (int j = 1; j <= n; j++) {
            for (int k = 1; k <= n; k++) {
                if (j == k) {
                    continue;
                }

                int cnt = 0;
                for (int i = 0; i < m; i++) {
                    int idx1 = 0, idx2 = 0;
                    for (int l = 0; l < n; l++) {
                        if (nums[i][l] == j) {
                            idx1 = l;
                        }
                        if (nums[i][l] == k) {
                            idx2 = l;
                        }
                    }

                    if (idx1 < idx2) {
                        cnt++;
                    }
                }

                if (cnt == m) {
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        멘토링 main = new 멘토링();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] nums = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                nums[i][j] = scanner.nextInt();
            }
        }

        System.out.println(main.solution(n, m, nums));
    }
}
