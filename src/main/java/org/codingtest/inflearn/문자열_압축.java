package org.codingtest.inflearn;

import java.util.Scanner;

public class 문자열_압축 {

    public String solution(String str) {

        /*
        StringBuilder sb = new StringBuilder();

        sb.append(str.charAt(0));
        int cnt = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(i - 1)) {
                if (cnt > 1) {
                    sb.append(cnt);
                }
                cnt = 1;
                sb.append(str.charAt(i));
                continue;
            }
            cnt++;
        }

        return sb.toString();

         */

        String answer = "";
        str = str + " ";
        int cnt = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                cnt++;
            }
            else {
                answer += str.charAt(i);
                if (cnt > 1) {
                    answer += String.valueOf(cnt);
                }
                cnt = 1;
            }
        }
        return answer;
    }

    public static void main(String[] args){

        문자열_압축 main = new 문자열_압축();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        System.out.println(main.solution(str));
    }
}
