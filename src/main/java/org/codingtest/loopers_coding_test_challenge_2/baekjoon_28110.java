package org.codingtest.loopers_coding_test_challenge_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class baekjoon_28110 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        bw.write(String.valueOf(solution(n, arr)));

        bw.flush();
        br.close();
        bw.close();
    }

    public static int solution(int n, int[] arr) {

        Arrays.sort(arr);

        int answer = -1;
        int max = -1;
        for (int i=0;i<n-1;i++) {
            int left = arr[i];
            int right = arr[i+1];

            if (right - left <= 1) {
                continue;
            }

            int candidate = (left + right)/2;
            int score = Math.min(candidate - left, right - candidate);

            if (score > max) {
                max = score;
                answer = candidate;
            }
        }

        return answer;
    }
}
