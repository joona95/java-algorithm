package org.codingtest.inflearn;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 학급_회장 {

    //private static final int CANDIDATE_CNT = 5;
    private static final char CANDIDATE_START_CHAR = 'A';

    public char solution(int n, String str) {

        char answer = CANDIDATE_START_CHAR;

        /*
        int[] candidates = new int[CANDIDATE_CNT];
        for (int i = 0; i < n; i++) {
            candidates[str.charAt(i) - CANDIDATE_START_CHAR]++;
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < CANDIDATE_CNT; i++) {
            if (max < candidates[i]) {
                max = candidates[i];
                answer = (char) (i + CANDIDATE_START_CHAR);
            }
        }
         */

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char key = str.charAt(i);
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        for (char key : map.keySet()) {
            int value = map.get(key);
            if (value > max) {
                max = value;
                answer = key;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        학급_회장 main = new 학급_회장();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str = scanner.next();

        System.out.println(main.solution(n, str));
    }
}
