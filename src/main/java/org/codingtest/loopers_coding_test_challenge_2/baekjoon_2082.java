package org.codingtest.loopers_coding_test_challenge_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class baekjoon_2082 {

    private static char[][][] numbers = {
            {
                    {'#', '#', '#'},
                    {'#', '.', '#'},
                    {'#', '.', '#'},
                    {'#', '.', '#'},
                    {'#', '#', '#'}
            },
            {
                    {'.', '.', '#'},
                    {'.', '.', '#'},
                    {'.', '.', '#'},
                    {'.', '.', '#'},
                    {'.', '.', '#'}
            },
            {
                    {'#', '#', '#'},
                    {'.', '.', '#'},
                    {'#', '#', '#'},
                    {'#', '.', '.'},
                    {'#', '#', '#'}
            },
            {
                    {'#', '#', '#'},
                    {'.', '.', '#'},
                    {'#', '#', '#'},
                    {'.', '.', '#'},
                    {'#', '#', '#'}
            },
            {
                    {'#', '.', '#'},
                    {'#', '.', '#'},
                    {'#', '#', '#'},
                    {'.', '.', '#'},
                    {'.', '.', '#'}
            },
            {
                    {'#', '#', '#'},
                    {'#', '.', '.'},
                    {'#', '#', '#'},
                    {'.', '.', '#'},
                    {'#', '#', '#'}
            },
            {
                    {'#', '#', '#'},
                    {'#', '.', '.'},
                    {'#', '#', '#'},
                    {'#', '.', '#'},
                    {'#', '#', '#'}
            },
            {
                    {'#', '#', '#'},
                    {'.', '.', '#'},
                    {'.', '.', '#'},
                    {'.', '.', '#'},
                    {'.', '.', '#'}
            },
            {
                    {'#', '#', '#'},
                    {'#', '.', '#'},
                    {'#', '#', '#'},
                    {'#', '.', '#'},
                    {'#', '#', '#'}
            },
            {
                    {'#', '#', '#'},
                    {'#', '.', '#'},
                    {'#', '#', '#'},
                    {'.', '.', '#'},
                    {'#', '#', '#'}
            },
    };

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[][][] time = new char[4][5][3];
        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 4; j++) {
                char[] ch = st.nextToken().toCharArray();
                for (int k = 0; k < 3; k++) {
                    time[j][i][k] = ch[k];
                }
            }
        }

        bw.write(solution(time));

        bw.flush();
        br.close();
        bw.close();
    }

    public static String solution(char[][][] time) {

        StringBuilder sb = new StringBuilder();
        for (int t = 0; t < 4; t++) {
            for (int i = 0; i < 9; i++) {
                boolean flag = true;
                for (int j = 0; j < 5; j++) {
                    for (int k = 0; k < 3; k++) {
                        if (numbers[i][j][k] == '.' && time[t][j][k] == '#') {
                            flag = false;
                            break;
                        }
                    }
                }
                if (flag) {
                    sb.append(i);
                    break;
                }
            }
            if (t == 1) {
                sb.append(':');
            }
        }
        return sb.toString();
    }
}
