package org.codingtest.loopers_coding_test_challenge_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class baekjoon_7696 {

    static int answers[];
    static boolean[] visited = new boolean[10];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = 1, idx = 1;
        answers = new int[1000001];
        while (idx <= 1000000) {
            if (isDuplicated(num)) {
                answers[idx++] = num;
            }
            num++;
        }

        StringBuffer sb = new StringBuffer();
        int n;
        while ((n = Integer.parseInt(br.readLine())) != 0) {
            sb.append(answers[n]).append("\n");
        }

        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();
    }

    public static boolean isDuplicated(int n) {
        Arrays.fill(visited, false);

        while (n > 0) {
            int digit = n % 10;

            if (visited[digit]) {
                return false;
            }

            visited[digit] = true;
            n /= 10;
        }
        return true;
    }
}
