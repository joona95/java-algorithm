package org.codingtest.inflearn;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 송아지_찾기1 {

    private int[] dis = {1, -1, 5};
    private boolean[] position = new boolean[10001];

    public int bfs(int s, int e, int L) {

        int answer = -1;

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(s);
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                int tmp = queue.poll();
                if (tmp == e) {
                    return L;
                }
                for (int j = 0; j < dis.length; j++) {
                    if (tmp + dis[j] > 0 && tmp + dis[j] <= 10000 && !position[tmp + dis[j]]) {
                        queue.offer(tmp + dis[j]);
                        position[tmp + dis[j]] = true;
                    }
                }
            }
            L++;
        }

        return answer;
    }

    public static void main(String[] args) {

        송아지_찾기1 main = new 송아지_찾기1();
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int e = scanner.nextInt();

        System.out.println(main.bfs(s, e, 0));
    }
}
