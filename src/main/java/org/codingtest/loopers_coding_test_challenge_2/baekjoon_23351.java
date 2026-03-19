package org.codingtest.loopers_coding_test_challenge_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class baekjoon_23351 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        bw.write(String.valueOf(solution(n, k, a, b)));

        bw.flush();
        br.close();
        bw.close();
    }

    public static int solution(int n, int k, int a, int b) {

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = k;
        }

        int answer = 1;
        while (true) {
            int min = Integer.MAX_VALUE;
            int idx = 0;
            for (int i = 0; i <= n - a; i++) {
                int sum = 0;
                for (int j = 0; j < a; j++) {
                    sum += arr[i + j];
                }
                if (sum < min) {
                    min = sum;
                    idx = i;
                }
            }

            for (int i = 0; i < a; i++) {
                arr[idx + i] += b;
            }

            for (int i = 0; i < n; i++) {
                arr[i]--;
                if (arr[i] <= 0) {
                    return answer;
                }
            }

            answer++;
        }
    }
}