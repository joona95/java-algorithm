package org.codingtest.loopers_coding_test_challenge_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class baekjoon_16283 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());

        int[] result = solution(a, b, n, w);

        StringBuilder sb = new StringBuilder();
        if (result[0] == -1) {
            sb.append(result[0]);
        } else {
            for (int num : result) {
                sb.append(num).append(" ");
            }
        }

        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();
    }

    public static int[] solution(int a, int b, int n, int w) {

        int[] answer = new int[2];
        answer[0] = -1;
        answer[1] = -1;

        boolean isFound = false;
        for (int i = 1; i <= 1000; i++) {
            for (int j = 1; j <= 1000; j++) {
                if ((i + j == n) && (a * i + b * j == w)) {
                    if (isFound) {
                        answer[0] = -1;
                        answer[1] = -1;
                        return answer;
                    }
                    answer[0] = i;
                    answer[1] = j;
                    isFound = true;
                }
            }
        }

        return answer;
    }
}
