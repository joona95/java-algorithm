package org.codingtest.inflearn;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 공주구하기 {

    public int solution(int n, int k) {

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        int cnt = 1;
        while (queue.size() > 1) {
            if (cnt == k) {
                queue.poll();
                cnt = 1;
            } else {
                cnt++;
                queue.offer(queue.poll());
            }
        }

        return queue.poll();
    }

    public static void main(String[] args) {

        공주구하기 main = new 공주구하기();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        System.out.println(main.solution(n, k));
    }
}
