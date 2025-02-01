package org.codingtest.inflearn;

import java.util.Scanner;

public class 임시반장_정하기 {

    public int solution(int n, int[][] nums) {

        int answer = 0, max = Integer.MIN_VALUE;

        /*
        int[] sameClassCounts = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int l = 0; l < 5; l++) {
                    if (nums[i][l] == nums[j][l]) {
                        sameClassCounts[i]++;
                        sameClassCounts[j]++;
                        break;
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (max < sameClassCounts[i]) {
                answer = i + 1;
                max = sameClassCounts[i];
            }
        }
         */

        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < 5; k++) {
                    if (nums[i][k] == nums[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }
            if (cnt > max) {
                max = cnt;
                answer = i + 1;
            }
        }


        return answer;
    }

    public static void main(String[] args) {

        임시반장_정하기 main = new 임시반장_정하기();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] nums = new int[n][5];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                nums[i][j] = scanner.nextInt();
            }
        }

        System.out.println(main.solution(n, nums));
    }
}
