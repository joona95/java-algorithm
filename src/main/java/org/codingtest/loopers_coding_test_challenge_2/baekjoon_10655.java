package org.codingtest.loopers_coding_test_challenge_2;

import java.awt.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class baekjoon_10655 {

    static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int calculateDistance(Point p) {
            return Math.abs(x - p.x) + Math.abs(y - p.y);
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        List<Point> points = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            points.add(new Point(x, y));
        }

        bw.write(String.valueOf(solution(n, points)));

        bw.flush();
        br.close();
        bw.close();
    }

    public static int solution(int n, List<Point> points) {
        int total = 0;
        for (int i = 1; i < n; i++) {
            Point prev = points.get(i - 1);
            Point cur = points.get(i);
            total += prev.calculateDistance(cur);
        }

        int answer = Integer.MAX_VALUE;
        for (int i = 1; i < n - 1; i++) {
            Point prev = points.get(i - 1);
            Point cur = points.get(i);
            Point next = points.get(i + 1);
            answer = Math.min(answer, total - prev.calculateDistance(cur) - cur.calculateDistance(next) + prev.calculateDistance(next));
        }
        return answer;
    }
}
