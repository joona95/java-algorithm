package org.codingtest.loopers_coding_test_challenge_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon_2851 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        bw.write(String.valueOf(solution(arr)));

        bw.flush();
        br.close();
        bw.close();
    }

    public static int solution(int[] arr) {
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            if (Math.abs(100 - answer) < Math.abs(100 - answer - arr[i])) {
                break;
            }
            answer += arr[i];
        }
        return answer;
    }
}
