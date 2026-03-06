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

public class baekjoon_15593 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        List<Cow> cows = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            cows.add(new Cow(s, e));
        }

        bw.write(String.valueOf(solution(cows)));

        bw.flush();
        br.close();
        bw.close();
    }

    public static int solution(List<Cow> cows) {
        Collections.sort(cows);

        int answer = Integer.MIN_VALUE;
        for (int i = 0; i < cows.size(); i++) {
            int s = 0, e = 0, sum = 0;
            for (int j = 0; j < cows.size(); j++) {
                if (i == j) {
                    continue;
                }
                if (s == 0 && e == 0) {
                    s = cows.get(j).start;
                    e = cows.get(j).end;
                    continue;
                }
                if (e < cows.get(j).start) {
                    sum += e - s;
                    s = cows.get(j).start;
                    e = cows.get(j).end;
                    continue;
                }
                e = Math.max(e, cows.get(j).end);
            }
            sum += e - s;
            answer = Math.max(answer, sum);
        }
        return answer;
    }

    static class Cow implements Comparable<Cow> {
        int start;
        int end;

        public Cow(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Cow o) {
            if (this.start == o.start) {
                return Integer.compare(this.end, o.end);
            }
            return Integer.compare(this.start, o.start);
        }
    }
}

/*
1 4
3 7
5 9
* */