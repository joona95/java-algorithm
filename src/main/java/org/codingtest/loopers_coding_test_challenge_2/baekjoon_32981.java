package org.codingtest.loopers_coding_test_challenge_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon_32981 {

    static final int MOD = 1_000_000_007;
    static long[] pow;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int q = Integer.parseInt(br.readLine());

        pow = new long[10000001];
        pow[0] = 1;
        for (int i = 1; i < 10000001; i++) {
            pow[i] = (pow[i - 1] * 5) % MOD;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < q; i++) {
            int n = Integer.parseInt(br.readLine());
            long ans;
            if (n == 1) {
                ans = 5;
            } else {
                ans = (4 * pow[n - 1]) % MOD;
            }
            sb.append(ans).append("\n");
        }

        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();
    }
}
