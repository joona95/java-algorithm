package org.codingtest.inflearn;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 응급실 {

    public class Patient {

        private int id;
        private int priority;

        public Patient(int id, int priority) {
            this.id = id;
            this.priority = priority;
        }
    }

    public int solution(int n, int m, int[] patients) {

        int answer = 0;

        Queue<Patient> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            queue.offer(new Patient(i, patients[i]));
        }

        while (!queue.isEmpty()) {
            Patient tmp = queue.poll();
            for (Patient p : queue) {
                if (p.priority > tmp.priority) {
                    queue.offer(tmp);
                    tmp = null;
                    break;
                }
            }
            if (tmp != null) {
                answer++;
                if (tmp.id == m) {
                    return answer;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        응급실 main = new 응급실();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] patients = new int[n];
        for (int i = 0; i < n; i++) {
            patients[i] = scanner.nextInt();
        }

        System.out.println(main.solution(n, m, patients));
    }
}
