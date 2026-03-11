package org.codingtest.loopers_coding_test_challenge_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class baekjoon_2508 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            br.readLine();
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            char[][] arr = new char[r][c];
            for (int j = 0; j < r; j++) {
                char[] row = br.readLine().toCharArray();
                for (int k = 0; k < c; k++) {
                    arr[j][k] = row[k];
                }
            }
            sb.append(solution(r, c, arr)).append("\n");
        }

        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();
    }

    public static int solution(int r, int c, char[][] arr) {
        int answer = 0;

        boolean[][] visited = new boolean[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (visited[i][j]) {
                    continue;
                }
                if (j + 2 < c
                        && arr[i][j] == '>'
                        && arr[i][j + 1] == 'o'
                        && arr[i][j + 2] == '<') {
                    visited[i][j] = true;
                    visited[i][j + 1] = true;
                    visited[i][j + 2] = true;
                    answer++;
                    continue;
                }
                if (i + 2 < r
                        && arr[i][j] == 'v'
                        && arr[i + 1][j] == 'o'
                        && arr[i + 2][j] == '^') {
                    visited[i][j] = true;
                    visited[i + 1][j] = true;
                    visited[i + 2][j] = true;
                    answer++;
                    continue;
                }
                visited[i][j] = true;
            }
        }

        return answer;
    }
}
