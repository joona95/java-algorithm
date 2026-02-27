package org.codingtest.loopers_coding_test_challenge_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class baekjoon_24480 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        List<List<Integer>> nodes = new ArrayList<>(n + 1);
        for (int i = 0; i <= n; i++) {
            nodes.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            nodes.get(a).add(b);
            nodes.get(b).add(a);
        }

        int[] result = solution(n, m, r, nodes);
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(result[i]).append("\n");
        }

        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();
    }

    public static int[] solution(int n, int m, int r, List<List<Integer>> nodes) {

        int[] checked = new int[n + 1];
        Stack<Integer> stack = new Stack<>();
        stack.push(r);
        int idx = 1;

        while (!stack.isEmpty()) {
            int cur = stack.pop();
            if (checked[cur] != 0) {
                continue;
            }
            checked[cur] = idx++;
            Collections.sort(nodes.get(cur));
            for (int i = 0; i < nodes.get(cur).size(); i++) {
                int next = nodes.get(cur).get(i);
                if (checked[next] == 0) {
                    stack.push(next);
                }
            }
        }
        return checked;
    }
}
