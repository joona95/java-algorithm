package org.codingtest.inflearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class 공통원소구하기 {

    public List<Integer> solution(int n, int[] arr1, int m, int[] arr2) {

        List<Integer> answer = new ArrayList<>();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int idx1 = 0, idx2 = 0;
        while (idx1 < n && idx2 < m) {
            if (arr1[idx1] == arr2[idx2]) {
                answer.add(arr1[idx1]);
                idx2++;
            } else if (arr1[idx1] < arr2[idx2]) {
                idx1++;
            } else {
                idx2++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        공통원소구하기 main = new 공통원소구하기();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = scanner.nextInt();
        }

        for (int x : main.solution(n, arr1, m, arr2)) {
            System.out.print(x + " ");
        }
    }
}
