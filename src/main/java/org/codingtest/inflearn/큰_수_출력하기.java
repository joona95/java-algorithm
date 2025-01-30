package org.codingtest.inflearn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 큰_수_출력하기 {

    public List<Integer> solution(int n, int[] nums) {

        List<Integer> answer = new ArrayList<>();

        answer.add(nums[0]);
        for (int i = 1; i < n; i++) {
            if (nums[i] > nums[i - 1]) {
                answer.add(nums[i]);
            }
        }

        return answer;
    }

    public static void main(String[] args){

        큰_수_출력하기 main = new 큰_수_출력하기();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        for (int x : main.solution(n, nums)) {
            System.out.print(x + " ");
        }
    }
}
