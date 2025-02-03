package org.codingtest.inflearn;

import java.util.Scanner;

public class 연속된_자연수의_합 {

    public int solution(int n) {

        int answer = 0;

        /*
        int lt = 1, sum = 0;
        for (int rt = 1; rt < n; rt++) {
            sum += rt;
            if (sum == n) {
                answer++;
            }
            while (sum >= n) {
                sum -= lt++;
                if (sum == n) {
                    answer++;
                }
            }
        }

         */

        int lt = 0, sum = 0;
        int m = n / 2 + 1;
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = i + 1;
        }
        for (int rt = 0; rt < m; rt++) {
            sum += arr[rt];
            if (sum == n) {
                answer++;
            }
            while (sum >= n) {
                sum -= arr[lt++];
                if (sum == n) {
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        연속된_자연수의_합 main = new 연속된_자연수의_합();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(main.solution(n));
    }
}
