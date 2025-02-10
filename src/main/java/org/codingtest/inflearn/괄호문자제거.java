package org.codingtest.inflearn;

import java.util.Scanner;
import java.util.Stack;

public class 괄호문자제거 {

    public String solution(String str) {

        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c != ')') {
                stack.push(c);
            } else {
                while (!stack.isEmpty()) {
                    char top = stack.pop();
                    if (top == '(') {
                        break;
                    }
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Character c : stack) {
            sb.append(c);
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        괄호문자제거 main = new 괄호문자제거();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        System.out.println(main.solution(str));
    }

}
