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

public class baekjoon_2304 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        List<Point> points = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());
            points.add(new Point(l, h));
        }

        bw.write(String.valueOf(solution(n, points)));

        bw.flush();
        br.close();
        bw.close();
    }

    public static int solution(int n, List<Point> points) {

        Collections.sort(points);

        int maxHeight = Integer.MIN_VALUE;
        for (int i = 0; i < points.size(); i++) {
            maxHeight = Math.max(maxHeight, points.get(i).h);
        }

        int leftPeakIdx = -1;
        int rightPeakIdx = -1;
        for (int i = 0; i < n; i++) {
            if (points.get(i).h == maxHeight) {
                if (leftPeakIdx == -1) {
                    leftPeakIdx = i;
                }
                rightPeakIdx = i;
            }
        }

        int answer = 0;

        int leftIdx = 0;
        int leftMaxHeight = points.get(leftIdx).h;
        for (int i = 1; i <= leftPeakIdx; i++) {
            if (leftMaxHeight < points.get(i).h) {
                Point point = points.get(i);
                Point leftPoint = points.get(leftIdx);
                answer += leftMaxHeight * (point.l - leftPoint.l);
                leftMaxHeight = point.h;
                leftIdx = i;
            }
        }

        int rightIdx = n - 1;
        int rightMaxHeight = points.get(rightIdx).h;
        for (int i = n - 2; i >= rightPeakIdx; i--) {
            if (rightMaxHeight < points.get(i).h) {
                Point point = points.get(i);
                Point rightPoint = points.get(rightIdx);
                answer += rightMaxHeight * (rightPoint.l - point.l);
                rightMaxHeight = point.h;
                rightIdx = i;
            }
        }

        answer += maxHeight * (points.get(rightPeakIdx).l - points.get(leftPeakIdx).l + 1);

        return answer;
    }

    static class Point implements Comparable<Point> {
        int l;
        int h;

        public Point(int l, int h) {
            this.l = l;
            this.h = h;
        }

        @Override
        public int compareTo(Point o) {
            return Integer.compare(this.l, o.l);
        }
    }
}
