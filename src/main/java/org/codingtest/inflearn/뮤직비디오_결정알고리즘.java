package org.codingtest.inflearn;

import java.util.Arrays;
import java.util.Scanner;

public class 뮤직비디오_결정알고리즘 {

    public int solution(int n, int m, int[] songs) {

        int answer = 0;

        /*
        int lt = 0, rt = 0;
        for (int i = 0; i < n; i++) {
            if (lt < songs[i]) {
                lt = songs[i];
            }
            rt += songs[i];
        }

         */

        int lt = Arrays.stream(songs).max().getAsInt();
        int rt = Arrays.stream(songs).sum();

        while (lt <= rt) {
            int mid = (lt + rt) / 2;

            if (count(songs, mid) > m) {
                lt = mid + 1;
            } else {
                answer = mid;
                rt = mid - 1;
            }
        }

        return answer;
    }

    private int count(int[] songs, int capacity) {

        int cnt = 1, sum = 0;
        for (int song : songs) {
            if (sum + song > capacity) {
                sum = song;
                cnt++;
            } else {
                sum += song;
            }
        }

        return cnt;
    }

    public static void main(String[] args) {

        뮤직비디오_결정알고리즘 main = new 뮤직비디오_결정알고리즘();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] songs = new int[n];
        for (int i = 0; i < n; i++) {
            songs[i] = scanner.nextInt();
        }

        System.out.println(main.solution(n, m, songs));
    }
}
