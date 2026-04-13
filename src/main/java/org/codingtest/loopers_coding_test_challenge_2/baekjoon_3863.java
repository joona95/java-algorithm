package org.codingtest.loopers_coding_test_challenge_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class baekjoon_3863 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            if (n == 0 && m == 0) {
                break;
            }

            List<Call> calls = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                st.nextToken();
                st.nextToken();
                int start = Integer.parseInt(st.nextToken());
                int duration = Integer.parseInt(st.nextToken());
                calls.add(new Call(start, start + duration));
            }

            for (int i = 0; i < m; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                int start = Integer.parseInt(st.nextToken());
                int duration = Integer.parseInt(st.nextToken());
                int end = start + duration;

                int count = 0;
                for (Call call : calls) {
                    if (call.start < end && start < call.end) {
                        count++;
                    }
                }
                sb.append(count).append("\n");
            }

        }

        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();
    }

    static class Call {
        int start;
        int end;

        public Call(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
}
