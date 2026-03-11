package org.codingtest.loopers_coding_test_challenge_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon_17252 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        bw.write(solution(n));

        bw.flush();
        br.close();
        bw.close();
    }

    public static String solution(int n) {

        if (n == 0) {
            return "NO";
        }

        while (n > 0) {
            if (n % 3 == 2) {
                return "NO";
            }
            n /= 3;
        }

        return "YES";
    }
}
