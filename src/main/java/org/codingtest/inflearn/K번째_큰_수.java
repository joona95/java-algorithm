package org.codingtest.inflearn;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class K번째_큰_수 {

    public int solution(int n, int k, int[] arr) {

        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int l = j + 1; l < n; l++) {
                    set.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }

        int cnt = 0;
        for (int x : set) {
            cnt++;
            if (cnt == k) {
                return x;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        K번째_큰_수 main = new K번째_큰_수();
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
