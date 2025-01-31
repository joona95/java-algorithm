package org.codingtest.inflearn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 뒤집은_소수 {

    public List<Integer> solution(int n, int[] nums) {

        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            /*
            String tmp = new StringBuilder(String.valueOf(nums[i])).reverse().toString();
            int reverseNum = Integer.parseInt(tmp);
             */

            int tmp = nums[i];
            int reverseNum = 0;
            while (tmp > 0) {
                int t = tmp % 10;
                reverseNum = reverseNum * 10 + t;
                tmp = tmp / 10;
            }

            if (isPrime(reverseNum)) {
                answer.add(reverseNum);
            }
        }

        return answer;
    }

    private boolean isPrime(int num) {

        if (num == 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){

        뒤집은_소수 main = new 뒤집은_소수();
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
