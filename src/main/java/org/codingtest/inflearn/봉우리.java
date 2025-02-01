package org.codingtest.inflearn;

import java.util.Scanner;

public class 봉우리 {

    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};

    public int solution(int n, int[][] nums) {

        int answer = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                /*
                if (nums[i][j] > nums[i - 1][j] && nums[i][j] > nums[i][j - 1]
                        && nums[i][j] > nums[i + 1][j] && nums[i][j] > nums[i][j + 1]) {
                    answer++;
                }
                 */

                boolean isPeak = true;
                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if (nums[i][j] <= nums[nx][ny]) {
                        isPeak = false;
                        break;
                    }
                }

                if (isPeak) {
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        봉우리 main = new 봉우리();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] nums = new int[n + 2][n + 2];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                nums[i][j] = scanner.nextInt();
            }
        }

        System.out.println(main.solution(n, nums));
    }
}
