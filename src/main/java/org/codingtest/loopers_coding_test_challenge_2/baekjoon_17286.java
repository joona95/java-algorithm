package org.codingtest.loopers_coding_test_challenge_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class baekjoon_17286 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] positions = new int[4][4];

        for (int i = 0; i < 4; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            positions[i][0] = Integer.parseInt(st.nextToken());
            positions[i][1] = Integer.parseInt(st.nextToken());
        }

        bw.write(String.valueOf(solution(positions)));

        bw.flush();
        br.close();
        bw.close();
    }

    public static int solution(int[][] positions) {

        int answer = Integer.MAX_VALUE;
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 4; j++) {
                for (int k = 1; k < 4; k++) {
                    if (i == j || j == k || k == i) {
                        continue;
                    }
                    int distance = (int) (Math.sqrt(Math.pow(positions[0][0] - positions[i][0], 2) + Math.pow(positions[0][1] - positions[i][1], 2))
                            + Math.sqrt(Math.pow(positions[i][0] - positions[j][0], 2) + Math.pow(positions[i][1] - positions[j][1], 2))
                            + Math.sqrt(Math.pow(positions[j][0] - positions[k][0], 2) + Math.pow(positions[j][1] - positions[k][1], 2)));
                    answer = Math.min(answer, distance);
                }
            }
        }
        return answer;
    }
}
