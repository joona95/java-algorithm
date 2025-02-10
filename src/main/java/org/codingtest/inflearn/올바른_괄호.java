package org.codingtest.inflearn;

import java.util.Scanner;
import java.util.Stack;

public class 올바른_괄호 {

    public String solution(String str) {

        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            }
            else {
                if (stack.isEmpty()) {
                    return "NO";
                }
                stack.pop();
            }
        }

        if (!stack.isEmpty()) {
            return "NO";
        }

        return "YES";
    }

    public static void main(String[] args) {

        올바른_괄호 main = new 올바른_괄호();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        System.out.println(main.solution(str));
    }
}
