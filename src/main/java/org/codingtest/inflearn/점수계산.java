package org.codingtest.inflearn;

import java.util.Scanner;

public class 점수계산 {

    public int solution(int n, int[] results) {

        int answer = 0;

        int score = 1;
        for (int i = 0; i < n; i++) {
            if (canScore(results[i])) {
                answer += score;
                score++;
            }
            else {
                score = 1;
            }
        }

        return answer;
    }

    private boolean canScore(int result) {
        return result == 1;
    }

    public static void main(String[] args) {

        점수계산 main = new 점수계산();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] results = new int[n];
        for (int i = 0; i < n; i++) {
            results[i] = scanner.nextInt();
        }

        System.out.println(main.solution(n, results));
    }
}
