package org.codingtest.loopers_coding_test_challenge_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class baekjoon_2563 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        bw.write(String.valueOf(solution(arr)));

        bw.flush();
        br.close();
        bw.close();
    }

    public static int solution(int[][] arr) {

        boolean[][] board = new boolean[101][101];
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr[i][0]; j < arr[i][0] + 10; j++) {
                for (int k = arr[i][1]; k < arr[i][1] + 10; k++) {
                    board[j][k] = true;
                }
            }
        }

        int answer = 0;
        for (int i = 0; i <= 100; i++) {
            for (int j = 0; j <= 100; j++) {
                if (board[i][j]) {
                    answer++;
                }
            }
        }
        return answer;
    }
}
