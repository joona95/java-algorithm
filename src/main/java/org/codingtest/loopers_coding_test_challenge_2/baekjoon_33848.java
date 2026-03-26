package org.codingtest.loopers_coding_test_challenge_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Stack;

public class baekjoon_33848 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int q = Integer.parseInt(br.readLine());
        String[] inputs = new String[q];
        for (int i = 0; i < q; i++) {
            inputs[i] = br.readLine();
        }

        bw.write(solution(inputs));

        bw.flush();
        br.close();
        bw.close();
    }

    public static String solution(String[] inputs) {

        StringBuilder sb = new StringBuilder();

        Stack<Integer[]> prevCommands = new Stack<>();
        Stack<Integer> stack = new Stack<>();
        for (String input : inputs) {
            Integer[] query = Arrays.stream(input.split(" ")).map(Integer::parseInt).toArray(Integer[]::new);
            switch (query[0]) {
                case 1:
                    stack.push(query[1]);
                    prevCommands.push(query);
                    break;
                case 2:
                    int n = stack.pop();
                    Integer[] command = {2, n};
                    prevCommands.push(command);
                    break;
                case 3:
                    for (int i = 0; i < query[1]; i++) {
                        Integer[] prevCommand = prevCommands.pop();
                        if (prevCommand[0] == 1) {
                            stack.pop();
                        } else {
                            stack.push(prevCommand[1]);
                        }
                    }
                    break;
                case 4:
                    sb.append(stack.size()).append("\n");
                    break;
                case 5:
                    if (stack.isEmpty()) {
                        sb.append(-1).append("\n");
                        break;
                    }
                    sb.append(stack.peek()).append("\n");
                    break;
            }
        }

        return sb.toString();
    }
}

