package org.codingtest.loopers_coding_test_challenge_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class baekjoon_2875 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        bw.write(String.valueOf(solution(n, m, k)));

        bw.flush();
        br.close();
        bw.close();
    }

    public static int solution(int n, int m, int k) {
        int teamCnt = Math.min(n / 2, m);
        for (; teamCnt >= 0; teamCnt--) {
            if ((n - 2 * teamCnt) + (m - teamCnt) >= k) {
                return teamCnt;
            }
        }
        return teamCnt;
    }
}
