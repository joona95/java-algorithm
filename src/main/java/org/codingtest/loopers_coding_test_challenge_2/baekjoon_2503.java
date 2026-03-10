package org.codingtest.loopers_coding_test_challenge_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class baekjoon_2503 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][3];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][2] = Integer.parseInt(st.nextToken());
        }

        bw.write(String.valueOf(solution(arr)));

        bw.flush();
        br.close();
        bw.close();
    }

    public static int solution(int[][] arr) {
        int answer = 0;
        for (int i = 123; i <= 999; i++) {
            String str1 = String.valueOf(i);

            if (str1.charAt(0) == str1.charAt(1)
                    || str1.charAt(1) == str1.charAt(2)
                    || str1.charAt(2) == str1.charAt(0)) {
                continue;
            }
            if (str1.charAt(0) == '0'
                    || str1.charAt(1) == '0'
                    || str1.charAt(2) == '0') {
                continue;
            }

            boolean isFound = true;
            for (int j = 0; j < arr.length; j++) {
                String str2 = String.valueOf(arr[j][0]);
                int strike = 0, ball = 0;
                for (int k = 0; k < 3; k++) {
                    if (str2.indexOf(str1.charAt(k)) == -1) {
                        continue;
                    }
                    if (str2.indexOf(str1.charAt(k)) == k) {
                        strike++;
                    } else {
                        ball++;
                    }
                }
                if (arr[j][1] != strike || arr[j][2] != ball) {
                    isFound = false;
                    break;
                }
            }
            if (isFound) {
                answer++;
            }
        }

        return answer;
    }
}
