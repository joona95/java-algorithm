package org.codingtest.inflearn;

import java.util.Scanner;

public class 문자_찾기 {

    public int solution(String str, char c) {

        int answer = 0;

        str = str.toUpperCase();
        c = Character.toUpperCase(c);
        /*
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                answer++;
            }
        }
         */

        for (int s : str.toCharArray()) {
            if (s == c) {
                answer ++;
            }
        }

        return answer;
    }

    public static void main(String[] args){

        문자_찾기 main = new 문자_찾기();
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        char c = scanner.next().charAt(0);

        int result = main.solution(str, c);

        System.out.println(result);
    }
}