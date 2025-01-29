package org.codingtest.inflearn;

import java.util.Scanner;

public class 가장_짧은_문자거리 {

    public int[] solution(String s, char t) {

        int[] answer = new int[s.length()];

        int cnt = s.length()+1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t) {
                cnt = 0;
            }
            answer[i] = cnt;
            cnt++;
        }
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == t) {
                cnt = 0;
            }
            answer[i] = Math.min(answer[i], cnt);
            cnt++;
        }

        return answer;
    }

    public static void main(String[] args) {

        가장_짧은_문자거리 main = new 가장_짧은_문자거리();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        char t = scanner.next().charAt(0);

        for (int x : main.solution(s, t)) {
            System.out.print(x + " ");
        }
    }
}
