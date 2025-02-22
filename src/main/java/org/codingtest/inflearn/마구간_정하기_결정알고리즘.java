package org.codingtest.inflearn;

import java.util.Arrays;
import java.util.Scanner;

public class 마구간_정하기_결정알고리즘 {

    public int solution(int n, int c, int[] arr) {

        int answer = 0;

        Arrays.sort(arr);

        int lt = arr[0], rt = arr[n - 1];
        while (lt <= rt) {
            int mid = (lt + rt) / 2;

            if (count(arr, mid) >= c) {
                answer = mid;
                lt = mid + 1;
            } else {
                rt = mid - 1;
            }
        }

        return answer;
    }

    private int count(int[] arr, int dist) {

        int cnt = 1, ep = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - ep >= dist) {
                ep = arr[i];
                cnt++;
            }
        }

        return cnt;
    }

    public static void main(String[] args) {

        마구간_정하기_결정알고리즘 main = new 마구간_정하기_결정알고리즘();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(main.solution(n, c, arr));
    }
}
