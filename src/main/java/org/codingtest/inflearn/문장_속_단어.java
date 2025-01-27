package org.codingtest.inflearn;

import java.util.Scanner;

public class 문장_속_단어 {

    public String solution(String str) {

        String answer = "";

        /*
        while (str.indexOf(" ") > 0) {
            int splitIdx = str.indexOf(" ");
            String word = str.substring(0, splitIdx);
            if (answer.length() < word.length()) {
                answer = word;
            }
            str = str.substring(splitIdx + 1);
        }

        if (answer.length() < str.length()) {
            answer = str;
        }

         */

        String[] s = str.split(" ");
        for (String word : s) {
            if (answer.length() < word.length()) {
                answer = word;
            }
        }

        return answer;
    }

    public static void main(String[] args){

        문장_속_단어 main = new 문장_속_단어();
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        System.out.println(main.solution(str));
    }
}
