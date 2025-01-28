package org.codingtest.inflearn;

import java.util.Scanner;

public class 특정_문자_뒤집기 {

    public String solution(String str) {

        char[] s = str.toCharArray();
        int lt = 0, rt = str.length() - 1;
        while (lt < rt) {

            if (!Character.isAlphabetic(s[lt])) {
                lt++;
                continue;
            }
            if (!Character.isAlphabetic(s[rt])) {
                rt--;
                continue;
            }
            char tmp = s[lt];
            s[lt] = s[rt];
            s[rt] = tmp;
            lt++;
            rt--;
        }

        return String.valueOf(s);
    }

    public static void main(String[] args){

        특정_문자_뒤집기 main = new 특정_문자_뒤집기();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        System.out.println(main.solution(str));
    }
}
