package org.codingtest.inflearn;

import java.util.Scanner;
import java.util.Stack;

public class 크레인_인형_뽑기 {

    public int solution(int n, int[][] board, int m, int[] moves) {

        int answer = 0;

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[j][moves[i] - 1] != 0) {
                    if (!stack.isEmpty() && stack.peek() == board[j][moves[i] - 1]) {
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(board[j][moves[i] - 1]);
                    }
                    board[j][moves[i] - 1] = 0;
                    break;
                }

            }
        }

        return answer;
    }

    public static void main(String[] args) {

        크레인_인형_뽑기 main = new 크레인_인형_뽑기();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = scanner.nextInt();
            }
        }
        int m = scanner.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++) {
            moves[i] = scanner.nextInt();
        }

        System.out.println(main.solution(n, board, m, moves));
    }
}
