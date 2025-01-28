package org.codingtest.inflearn;

import java.util.Scanner;

public class 회문_문자열 {

    public String solution(String str) {

        /*
        str = str.toUpperCase();
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - 1 - i)) {
                return "NO";
            }
        }
        return "YES";
         */

        String tmp = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase(tmp)) {
            return "YES";
        }
        return "NO";
    }

    public static void main(String[] args){

        회문_문자열 main = new 회문_문자열();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        System.out.println(main.solution(str));
    }
}
