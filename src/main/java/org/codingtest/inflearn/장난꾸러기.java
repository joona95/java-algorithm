package org.codingtest.inflearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class 장난꾸러기 {

    public List<Integer> solution(int n, int[] arr) {

        List<Integer> answer = new ArrayList<>();

        int[] tmp = Arrays.copyOf(arr, n);
        Arrays.sort(tmp);
        for (int i = 0; i < n; i++) {
            if (arr[i] != tmp[i]) {
                answer.add(i + 1);
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        장난꾸러기 main = new 장난꾸러기();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int x : main.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
