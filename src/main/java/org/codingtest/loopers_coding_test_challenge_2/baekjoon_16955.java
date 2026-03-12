package org.codingtest.loopers_coding_test_challenge_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon_16955 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[][] board = new char[10][10];

        for (int i = 0; i < 10; i++) {
            char[] row = br.readLine().toCharArray();
            for (int j = 0; j < 10; j++) {
                board[i][j] = row[j];
            }
        }

        bw.write(String.valueOf(solution(board)));

        bw.flush();
        br.close();
        bw.close();
    }

    public static int solution(char[][] board) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (board[i][j] == 'X' || board[i][j] == 'O') {
                    continue;
                }
                if (canWin(i, j, board, 0, 1)
                        || canWin(i, j, board, 1, 0)
                        || canWin(i, j, board, 1, 1)
                        || canWin(i, j, board, 1, -1)) {
                    return 1;
                }
            }
        }
        return 0;
    }

    private static boolean canWin(int r, int c, char[][] board, int dr, int dc) {
        int count = 1;
        count += countStone(r, c, board, dr, dc);
        count += countStone(r, c, board, -dr, -dc);
        return count >= 5;
    }

    private static int countStone(int r, int c, char[][] board, int dr, int dc) {
        int count = 0;
        int nr = r + dr;
        int nc = c + dc;
        while (nr >= 0 && nc >= 0 && nr < 10 && nc < 10 && board[nr][nc] == 'X') {
            count++;
            nr += dr;
            nc += dc;
        }
        return count;
    }
}
