package org.codingtest.inflearn;

import java.util.Scanner;

public class 가위바위보 {

    public String[] solution(int n, int[] a, int[] b) {

        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            if (a[i] == b[i]) {
                answer[i] = "D";
            }
            else if ((a[i] == 1 && b[i] ==3)
                    || (a[i] == 2 && b[i] == 1)
                    || (a[i] == 3 && b[i] == 2)) {
                answer[i] = "A";
            } else {
                answer[i] = "B";
            }
        }

        return answer;
    }

    public static void main(String[] args){

        가위바위보 main = new 가위바위보();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }

        for (String result : main.solution(n, a, b)) {
            System.out.println(result);
        }
    }
}
