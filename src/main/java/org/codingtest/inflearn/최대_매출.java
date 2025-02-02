package org.codingtest.inflearn;

import java.util.Scanner;

public class 최대_매출 {

    public int solution(int n, int k, int[] arr) {

        int answer, sum = 0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        answer = sum;

        for (int i = k; i < n; i++) {
            sum += (arr[i] - arr[i - k]);
            answer = Math.max(answer, sum);
        }

        /*
        int p1 = 0, p2 = 0, sum = 0;
        while (p1 < n && p2 < n) {
            if (p2 - p1 == k) {
                answer = Math.max(answer, sum);
                sum += arr[p2];
                p2++;
                sum -= arr[p1];
                p1++;
            } else if (p2 - p1 > k) {
                sum -= arr[p1];
                p1++;
            } else {
                sum += arr[p2];
                p2++;
            }
        }
         */

        return answer;
    }

    public static void main(String[] args) {

        최대_매출 main = new 최대_매출();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(main.solution(n, k, arr));
    }
}
