package org.codingtest.loopers_coding_test_challenge_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class baekjoon_16970 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        bw.write(String.valueOf(solution(n, m, k)));

        bw.flush();
        br.close();
        bw.close();
    }

    public static int solution(int n, int m, int k) {
        int count = 0;
        for (int x1 = 0; x1 <= n; x1++) {
            for (int y1 = 0; y1 <= m; y1++) {
                for (int x2 = x1; x2 <= n; x2++) {
                    int startY = (x1 == x2) ? y1 + 1 : 0;
                    for (int y2 = startY; y2 <= m; y2++) {
                        int dx = Math.abs(x1 - x2);
                        int dy = Math.abs(y1 - y2);

                        if (dx == 0 && dy == 0) {
                            continue;
                        }

                        if (gcd(dx, dy) + 1 == k) {
                            count++;
                        }
                    }
                }
            }
        }

        return count;
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
}
