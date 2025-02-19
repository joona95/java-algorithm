package org.codingtest.inflearn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 좌표_정렬 {

    class Position implements Comparable<Position> {

        private int x;
        private int y;

        public Position(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Position o) {
            if (x == o.x) {
                return y - o.y;
            }
            return x - o.x;
        }
    }

    public List<Position> solution(int n, int[][] arr) {

        List<Position> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            answer.add(new Position(arr[i][0], arr[i][1]));
        }

        Collections.sort(answer);

        return answer;
    }

    public static void main(String[] args) {

        좌표_정렬 main = new 좌표_정렬();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = scanner.nextInt();
            arr[i][1] = scanner.nextInt();
        }

        for (Position pos : main.solution(n, arr)) {
            System.out.println(pos.x + " " + pos.y);
        }
    }
}
