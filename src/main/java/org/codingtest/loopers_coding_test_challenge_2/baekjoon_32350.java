package org.codingtest.loopers_coding_test_challenge_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class baekjoon_32350 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        bw.write(String.valueOf(solution(n, d, p, arr)));

        bw.flush();
        br.close();
        bw.close();
    }

    public static int solution(int n, int d, int p, int[] arr) {

        int answer = 0;
        while (true) {
            int idx = findMonster(n, arr);
            if (idx == -1) {
                break;
            }

            arr[idx] -= d;
            int next = findMonster(n, arr);
            if (arr[idx] < 0 && next != -1) {
                arr[next] += (arr[idx] * p / 100);
            }

            answer++;
        }

        return answer;
    }

    private static int findMonster(int n, int[] arr) {
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                return i;
            }
        }
        return -1;
    }
}
