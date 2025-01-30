package org.codingtest.inflearn;

import java.util.Scanner;

public class 암호 {

    public String solution(int n, String str) {

        StringBuilder sb = new StringBuilder();

        /*
        for (int i = 0; i < n; i++) {
            char ch = 0;
            for (int j = 0; j < 7; j++) {
                ch *= 2;
                if (str.charAt(7 * i + j) == '#') {
                    ch += 1;
                }
            }
            sb.append(ch);
        }
         */

        str = str.replace("#", "1").replace("*", "0");

        for (int i = 0; i < n; i++) {
            String tmp = str.substring(i * 7, (i + 1) * 7);
            int num = Integer.parseInt(tmp, 2);
            sb.append((char) num);
        }

        return sb.toString();
    }

    public static void main(String[] args){

        암호 main = new 암호();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str = scanner.next();

        System.out.println(main.solution(n, str));
    }
}
