package org.codingtest.inflearn;

import java.util.Scanner;

public class 피보나치_수열 {

    public int[] solution(int n) {

        int[] answer = new int[n];

        answer[0] = 1;
        answer[1] = 1;
        for (int i = 2; i < n; i++) {
            answer[i] = answer[i - 1] + answer[i - 2];
        }

        return answer;
    }

    public static void main(String[] args){

        피보나치_수열 main = new 피보나치_수열();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int x : main.solution(n)) {
            System.out.print(x + " ");
        }
    }
}
