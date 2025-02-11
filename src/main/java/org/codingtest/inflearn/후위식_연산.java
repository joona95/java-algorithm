package org.codingtest.inflearn;

import java.util.Scanner;
import java.util.Stack;

public class 후위식_연산 {

    public int solution(String str) {

        Stack<Integer> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                stack.push(c - 48);
            } else {
                int num1 = stack.pop();
                int num2 = stack.pop();
                switch (c) {
                    case '+':
                        stack.push(num1 + num2);
                        break;
                    case '-':
                        stack.push(num2 - num1);
                        break;
                    case '*':
                        stack.push(num1 * num2);
                        break;
                    case '/':
                        stack.push(num2 / num1);
                        break;
                }
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {

        후위식_연산 main = new 후위식_연산();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        System.out.println(main.solution(str));
    }
}
