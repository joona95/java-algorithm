package org.codingtest.loopers_coding_test_challenge_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class baekjoon_33011 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            sb.append(solution(n, arr)).append("\n");
        }

        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();
    }

    public static String solution(int n, int[] arr) {
        int oddCnt = 0, evenCnt = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 1) {
                oddCnt++;
            } else {
                evenCnt++;
            }
        }

        if ((oddCnt > evenCnt && oddCnt % 2 != 0)
                || (evenCnt > oddCnt && evenCnt % 2 != 0)) {
            return "amsminn";
        }
        return "heeda0528";
    }
}
