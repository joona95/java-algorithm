package org.codingtest.inflearn;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Least_Recently_Used {

    public int[] solution(int s, int n, int[] task) {

        int[] answer = new int[s];

        /*
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (queue.contains(task[i])) {
                queue.remove(task[i]);
                queue.offer(task[i]);
                continue;
            }
            queue.offer(task[i]);
            if (queue.size() > s) {
                queue.poll();
            }
        }

        int idx = s - 1;
        for (int x : queue) {
            answer[idx] = x;
            idx--;
        }
         */

        for (int x : task) {
            int pos = -1;
            for (int i = 0; i < s; i++) {
                if (x == answer[i]) {
                    pos = i;
                }
            }
            if (pos == -1) {
                for (int i = s - 1; i >= 1; i--) {
                    answer[i] = answer[i - 1];
                }
                answer[0] = x;
            } else {
                for (int i = pos; i >= 1; i--) {
                    answer[i] = answer[i - 1];
                }
                answer[0] = x;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Least_Recently_Used main = new Least_Recently_Used();
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int n = scanner.nextInt();
        int[] cache = new int[n];
        for (int i = 0; i < n; i++) {
            cache[i] = scanner.nextInt();
        }

        for (int x : main.solution(s, n, cache)) {
            System.out.print(x + " ");
        }
    }
}
