package org.codingtest.inflearn;

import java.util.Scanner;

public class 최대_길이_연속부분수열 {

    public int solution(int n, int k, int[] arr) {

        int answer = 0;

        int lt = 0, cnt = 0;

        for (int rt = 0; rt < n; rt++) {
            if (arr[rt] == 0) {
                cnt++;
            }
            while (cnt > k) {
                if (arr[lt] == 0) {
                    cnt--;
                }
                lt++;
            }
            answer = Math.max(rt - lt + 1, answer);
        }

        return answer;
    }

    public static void main(String[] args) {

        최대_길이_연속부분수열 main = new 최대_길이_연속부분수열();
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
