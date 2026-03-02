package org.codingtest.loopers_coding_test_challenge_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class baekjoon_2309 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] heights = new int[9];
        for (int i = 0; i < 9; i++) {
            heights[i] = Integer.parseInt(br.readLine());
        }

        List<Integer> result = solution(heights);
        StringBuilder sb = new StringBuilder();
        for (int height : result) {
            sb.append(height).append("\n");
        }

        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();
    }

    public static List<Integer> solution(int[] heights) {

        List<Integer> answer = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            sum += heights[i];
            answer.add(heights[i]);
        }

        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) {
                int height1 = heights[i];
                int height2 = heights[j];
                if (sum - height1 - height2 == 100) {
                    return answer.stream()
                            .filter(h -> (h != height1 && h != height2))
                            .sorted().collect(toList());
                }
            }
        }

        return answer;
    }
}
