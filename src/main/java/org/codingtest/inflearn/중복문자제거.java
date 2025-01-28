package org.codingtest.inflearn;

import java.util.Scanner;

public class 중복문자제거 {

    public String solution(String str) {

        StringBuilder sb = new StringBuilder();

        /*
        for (char c : str.toCharArray()) {
            if (sb.indexOf(String.valueOf(c)) == -1) {
                sb.append(c);
            }
        }
         */

        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == i) {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args){

        중복문자제거 main = new 중복문자제거();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        System.out.println(main.solution(str));
    }
}
