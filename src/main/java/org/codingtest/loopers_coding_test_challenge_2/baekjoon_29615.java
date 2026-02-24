package org.codingtest.loopers_coding_test_challenge_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

class baekjoon_29615 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] waiting = new int[n];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            waiting[i] = Integer.parseInt(st.nextToken());
        }

        Set<Integer> friends = new HashSet<>();
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < m; i++) {
            friends.add(Integer.parseInt(st.nextToken()));
        }

        bw.write(String.valueOf(solution(waiting, friends)));

        bw.flush();
        br.close();
        bw.close();
    }

    public static int solution(int[] waiting, Set<Integer> friends) {
        int answer = friends.size();
        for (int i = 0; i < friends.size(); i++) {
            if (friends.contains(waiting[i])) {
                answer--;
            }
        }
        return answer;
    }
}