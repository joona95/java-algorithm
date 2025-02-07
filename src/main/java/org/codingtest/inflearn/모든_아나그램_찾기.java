package org.codingtest.inflearn;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 모든_아나그램_찾기 {

    public int solution(String s, String t) {

        int answer = 0;

        Map<Character, Integer> mapA = new HashMap<>();
        for (char c : t.toCharArray()) {
            mapA.put(c, mapA.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> mapB = new HashMap<>();
        for (int i = 0; i < t.length() - 1; i++) {
            mapB.put(s.charAt(i), mapB.getOrDefault(s.charAt(i), 0) + 1);
        }

        int lt = 0;
        for (int rt = t.length() - 1; rt < s.length(); rt++) {
            mapB.put(s.charAt(rt), mapB.getOrDefault(s.charAt(rt), 0) + 1);
            if (mapA.equals(mapB)) {
                answer++;
            }
            mapB.put(s.charAt(lt), mapB.get(s.charAt(lt)) - 1);
            if (mapB.get(s.charAt(lt)) == 0) {
                mapB.remove(s.charAt(lt));
            }
            lt++;
        }

        return answer;
    }

    public static void main(String[] args) {

        모든_아나그램_찾기 main = new 모든_아나그램_찾기();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String t = scanner.next();

        System.out.println(main.solution(s, t));
    }
}
