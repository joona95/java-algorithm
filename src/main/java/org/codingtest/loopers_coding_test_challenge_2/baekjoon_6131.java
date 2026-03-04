package org.codingtest.loopers_coding_test_challenge_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon_6131 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        bw.write(String.valueOf(solution(n)));

        bw.flush();
        br.close();
        bw.close();
    }

    public static int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= 500; i++) {
            for (int j = 1; j <= 500; j++) {
                if (Math.pow(i, 2) == Math.pow(j, 2) + n) {
                    answer++;
                }
            }
        }
        return answer;
    }
}
