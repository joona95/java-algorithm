package org.codingtest.loopers_coding_test_challenge_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class baekjoon_26215 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        bw.write(String.valueOf(solution(n, arr)));

        bw.flush();
        br.close();
        bw.close();
    }

    public static int solution(int n, int[] arr) {

        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> o2 - o1);
        for (int i = 0; i < n; i++) {
            pq.add(arr[i]);
        }

        int time = 0;
        while (pq.size() > 1) {
            time++;

            int a = pq.poll() - 1;
            int b = pq.poll() - 1;

            if (a > 0) {
                pq.offer(a);
            }
            if (b > 0) {
                pq.offer(b);
            }
        }

        if (pq.size() == 1) {
            time += pq.poll();
        }

        return time > 1440 ? -1 : time;
    }
}
