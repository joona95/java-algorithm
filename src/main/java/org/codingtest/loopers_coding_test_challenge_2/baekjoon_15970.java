package org.codingtest.loopers_coding_test_challenge_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class baekjoon_15970 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        List<Integer>[] dots = new List[n + 1];
        for (int i = 0; i <= n; i++) {
            dots[i] = new ArrayList<>();
        }

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            dots[y].add(x);
        }

        bw.write(String.valueOf(solution(n, dots)));

        bw.flush();
        br.close();
        bw.close();
    }

    public static int solution(int n, List<Integer>[] arr) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            Collections.sort(arr[i]);
            for (int j = 0; j < arr[i].size(); j++) {
                int left = j - 1 >= 0 ? arr[i].get(j) - arr[i].get(j - 1) : Integer.MAX_VALUE;
                int right = j + 1 < arr[i].size() ? arr[i].get(j + 1) - arr[i].get(j) : Integer.MAX_VALUE;
                answer += Math.min(left, right);
            }
        }

        return answer;
    }
}
