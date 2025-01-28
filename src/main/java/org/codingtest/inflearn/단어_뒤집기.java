package org.codingtest.inflearn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 단어_뒤집기 {

    public List<String> solution(String[] words) {

        List<String> answer = new ArrayList<>();
        /*
        for (String word: words) {
            String reverseWord = new StringBuilder(word).reverse().toString();
            answer.add(reverseWord);
        }
         */

        for (String word: words) {
            char[] s = word.toCharArray();
            for (int i = 0; i < s.length / 2; i++) {
                char tmp = s[s.length - 1 - i];
                s[s.length - 1 - i] = s[i];
                s[i] = tmp;
            }
            answer.add(String.valueOf(s));
        }

        return answer;
    }

    public static void main(String[] args){

        단어_뒤집기 main = new 단어_뒤집기();
        Scanner scanner = new Scanner(System.in);
        int cnt = scanner.nextInt();
        String[] words = new String[cnt];
        for (int i = 0; i < cnt; i++) {
            words[i] = scanner.next();
        }

        for (String result : main.solution(words)) {
            System.out.println(result);
        }
    }
}
