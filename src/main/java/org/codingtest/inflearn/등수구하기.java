package org.codingtest.inflearn;

import java.util.Scanner;

public class 등수구하기 {

    public int[] solution(int n, int[] scores) {

        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            int rank = 1;
            for (int j = 0; j < n; j++) {
                if (scores[i] < scores[j]) {
                    rank++;
                }
            }
            answer[i] = rank;
        }

        return answer;
    }

    public static void main(String[] args) {

        등수구하기 main = new 등수구하기();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = scanner.nextInt();
        }

        for (int x : main.solution(n, scores)) {
            System.out.print(x + " ");
        }
    }
}
