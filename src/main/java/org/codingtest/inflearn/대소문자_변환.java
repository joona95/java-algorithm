package org.codingtest.inflearn;

import java.util.Scanner;

public class 대소문자_변환 {

    public String solution(String str) {

        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else {
                sb.append(Character.toUpperCase(c));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args){

        대소문자_변환 main = new 대소문자_변환();
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        System.out.println(main.solution(str));
    }
}
