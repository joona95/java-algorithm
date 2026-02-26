package org.codingtest.loopers_coding_test_challenge_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class baekjoon_26085 {

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        bw.write(String.valueOf(solution(n, m, arr)));

        bw.flush();
        br.close();
        bw.close();
    }

    public static int solution(int n, int m, int[][] arr) {

        if ((n * m) % 2 != 0) {
            return -1;
        }

        int zeroCnt = 0;
        int oneCnt = 0;
        boolean hasAdjacent = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0) {
                    zeroCnt++;
                }
                if (arr[i][j] == 1) {
                    oneCnt++;
                }
                if (hasAdjacent) {
                    continue;
                }
                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if (nx >= 0 && nx < n && ny >= 0 && ny < m && arr[i][j] == arr[nx][ny]) {
                        hasAdjacent = true;
                    }
                }
            }
        }
        if (zeroCnt % 2 != 0 || oneCnt % 2 != 0) {
            return -1;
        }
        if (!hasAdjacent) {
            return -1;
        }

        return 1;
    }
}