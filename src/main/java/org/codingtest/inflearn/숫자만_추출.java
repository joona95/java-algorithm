package org.codingtest.inflearn;

import java.util.Scanner;

public class 숫자만_추출 {

    public int solution(String str) {

        /*
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if(Character.isDigit(c)) {
                sb.append(c);
            }
        }

        return Integer.parseInt(sb.toString());
         */

        int answer = 0;
        for (char c : str.toCharArray()) {
            if (c >= 48 && c <= 57) {
                answer = answer * 10 + (c - 48);
            }
        }

        return answer;
    }

    public static void main(String[] args){

        숫자만_추출 main = new 숫자만_추출();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        System.out.println(main.solution(str));
    }
}
