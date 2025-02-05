package org.codingtest.inflearn;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 아나그램 {

    public String solution(String str1, String str2) {

        Map<Character, Integer> map = new HashMap<>();
        for (char c : str1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        /*
        for (char c : str2.toCharArray()) {
            if (!map.containsKey(c)) {
                return "NO";
            }

            int value = map.get(c);
            if (value - 1 == 0) {
                map.remove(c);
            } else {
                map.put(c, map.get(c) - 1);
            }
        }

        return map.size() == 0 ? "YES" : "NO";

         */

        for (char c : str2.toCharArray()) {
            if (!map.containsKey(c) || map.get(c) == 0) {
                return "NO";
            }
            map.put(c, map.get(c) - 1);
        }

        return "YES";
    }

    public static void main(String[] args) {

        아나그램 main = new 아나그램();
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();

        System.out.println(main.solution(str1, str2));
    }
}
