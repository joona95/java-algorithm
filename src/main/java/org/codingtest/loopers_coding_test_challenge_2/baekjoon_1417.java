package org.codingtest.loopers_coding_test_challenge_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon_1417 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        bw.write(String.valueOf(solution(n, arr)));

        bw.flush();
        br.close();
        bw.close();
    }

    public static int solution(int n, int[] arr) {
        int answer = 0;

        while (true) {
            int max = arr[0];
            int idx = 0;
            for (int i = 1; i < n; i++) {
                if (max <= arr[i]) {
                    idx = i;
                    max = arr[i];
                }
            }
            if (idx > 0) {
                arr[idx]--;
                arr[0]++;
                answer++;
            } else {
                break;
            }
        }

        return answer;
    }
}
