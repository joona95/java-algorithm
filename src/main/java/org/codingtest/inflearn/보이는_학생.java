package org.codingtest.inflearn;

import java.util.Scanner;

public class 보이는_학생 {

    public int solution(int n, int[] students) {

        int answer = 0;

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (max < students[i]) {
                max = students[i];
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args){

        보이는_학생 main = new 보이는_학생();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] students = new int[n];
        for (int i = 0; i < n; i++) {
            students[i] = scanner.nextInt();
        }

        System.out.println(main.solution(n, students));
    }
}
