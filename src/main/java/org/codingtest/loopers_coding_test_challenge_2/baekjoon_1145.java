package org.codingtest.loopers_coding_test_challenge_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class baekjoon_1145 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        bw.write(String.valueOf(solution(arr)));

        bw.flush();
        br.close();
        bw.close();
    }

    public static int solution(int[] arr) {
        int num = Arrays.stream(arr).min().getAsInt();
        while (true) {
            int cnt = 0;
            for (int j = 0; j < arr.length; j++) {
                if (num % arr[j] == 0) {
                    cnt++;
                }
            }
            if (cnt >= 3) {
                return num;
            }
            num++;
        }
    }
}
