package org.codingtest.inflearn;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 교육과정_설계 {

    public String solution(String needs, String classes) {

        Queue<Character> queue = new LinkedList<>();
        for(char c : needs.toCharArray()) {
            queue.offer(c);
        }

        for(char c : classes.toCharArray()) {
            if (queue.isEmpty()) {
                return "YES";
            }

            if (queue.peek() == c) {
                queue.poll();
            }
        }

        return "NO";
    }

    public static void main(String[] args){

        교육과정_설계 main = new 교육과정_설계();
        Scanner scanner=new Scanner(System.in);
        String needs = scanner.next();
        String classes = scanner.next();

        System.out.println(main.solution(needs, classes));
    }
}
